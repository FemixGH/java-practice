package third_task;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class converter {

    public static double getCurrencyRate(String currencyCode, String date) throws IOException {
        String url = "https://www.cbr.ru/scripts/XML_daily.asp?date_req=" + date;
        URL apiURL = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Error: " + responseCode);
        }

        Scanner scanner = new Scanner(connection.getInputStream());
        StringBuilder xmlResponse = new StringBuilder();
        while (scanner.hasNext()) {
            xmlResponse.append(scanner.nextLine());
        }
        scanner.close();

        String xml = xmlResponse.toString();
        String startTag = "<CharCode>" + currencyCode + "</CharCode>";
        int start = xml.indexOf(startTag);
        if (start != -1) {
            int valueStart = xml.indexOf("<Value>", start);
            int valueEnd = xml.indexOf("</Value>", valueStart);
            String valueText = xml.substring(valueStart + 7, valueEnd).replace(",", ".");

            int nominalStart = xml.indexOf("<Nominal>", start);
            int nominalEnd = xml.indexOf("</Nominal>", nominalStart);
            String nominalText = xml.substring(nominalStart + 9, nominalEnd);

            double value = Double.parseDouble(valueText);
            int nominal = Integer.parseInt(nominalText);

            return value / nominal;
        }

        return -1; // Currency code not found
    }

    public static void main(String[] args) {
        try {
            String currencyCode = JOptionPane.showInputDialog(null, "Enter the currency code (e.g., USD)");
            String date = JOptionPane.showInputDialog(null, "Enter the date (format: YYYY-MM-DD)");

            double rate = getCurrencyRate(currencyCode, date);
            if (rate == -1) {
                JOptionPane.showMessageDialog(null, "Currency code not found", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Currency rate for " + currencyCode + " on " + date + ": " + rate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
