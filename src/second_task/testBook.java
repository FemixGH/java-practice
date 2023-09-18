package second_task;

import java.util.Date;

public class testBook {
    public static void main(String[] args) {
        Book book = new Book("MeinKampf", "Adolf Hitler", new Date());
        System.out.println(book);
        book.set_name("Рептилоиды и древние русы");
        book.set_writing_date(new Date());
        System.out.println(book);
    }
}
