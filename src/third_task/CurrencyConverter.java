package third_task;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class CurrencyConverter {
    private static final String API_URL = "https://www.cbr.ru/scripts/XML_daily.asp?date_req=";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату (в формате dd.mm.yyyy): ");
        String date = scanner.nextLine();

        System.out.print("Введите код валюты для конвертации: ");
        String currencyCode = scanner.nextLine().toUpperCase();

        System.out.print("Введите сумму для конвертации: ");
        double amount = scanner.nextDouble();

        try {
            URL url = new URL(API_URL + date);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() != 200) {
                System.out.println("Ошибка при получении данных с API.");
                return;
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(connection.getInputStream());

            NodeList nodeList = document.getElementsByTagName("Valute");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String code = element.getElementsByTagName("CharCode").item(0).getTextContent();

                    if (code.equals(currencyCode)) {
                        double value = Double.parseDouble(element.getElementsByTagName("Value").item(0).getTextContent().replace(",", "."));
                        double conversionResult = amount / value;

                        System.out.println("Результат конвертации: " + conversionResult + " " + currencyCode);
                        return;
                    }
                }
            }

            System.out.println("Не удалось найти валюту с указанным кодом.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
