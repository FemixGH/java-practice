package fourth_task;

public class Tester {
    public static void main(String[] args) {

        //процессор
        Processor processor = new Processor("Intel Core i7", 3.5);

        //оперативная память
        Memory memory = new Memory(16, "DDR4");

        //монитор
        Monitor monitor = new Monitor("HP", 24);

        //компьютер
        Computer computer = new Computer(Brand.HP, processor, memory, monitor);
        //тестировка
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Processor: " + computer.getProcessor().getModel());
        System.out.println("Memory: " + computer.getMemory().getSize() + "GB");
        System.out.println("Monitor: " + computer.getMonitor().getModel() + ", " + computer.getMonitor().getSize() + " дюймов");

    }
}
