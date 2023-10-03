package third_task;

public class task_1 {

    public static void main(String[] args) {
        // Создание объекта класса Double с использованием метода valueOf()
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("5.67");

        // Преобразование строки к типу double с использованием метода parseDouble()
        String str = "7.89";
        double value = Double.parseDouble(str);

        // Преобразование объекта класса Double ко всем примитивным типам
        double primitiveValue = d1.doubleValue();
        float floatValue = d1.floatValue();
        int intValue = d1.intValue();
        long longValue = d1.longValue();
        short shortValue = d1.shortValue();
        byte byteValue = d1.byteValue();

        // Вывод значения объекта Double на консоль
        System.out.println("Значение объекта d1: " + d1);

        // Преобразование литерала типа double к строке
        String d = Double.toString(3.14);
        System.out.println("Значение переменной d: " + d);
    }
}

