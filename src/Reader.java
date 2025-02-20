public class Reader {
    private String fio;
    private int numberTicket;
    private String faculty;
    private String birthDate;
    private String numberPhone;

    public Reader(String fio, int numberTicket, String faculty, String birthDate, String numberPhone) {
        this.fio = fio;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.numberPhone = numberPhone;
    }

    // Перегруженный метод takeBook с количеством книг
    public void takeBook(int quantity) {
        System.out.println(this.fio + " взял " + quantity + " книги.");
    }

    // Перегруженный метод takeBook с названиями книг
    public void takeBook(String... bookTitles) {
        System.out.print(this.fio + " взял книги: ");
        System.out.println(String.join(", ", bookTitles));
    }

    // Перегруженный метод returnBook с количеством книг
    public void returnBook(int quantity) {
        System.out.println(this.fio + " вернул " + quantity + " книги.");
    }

    // Перегруженный метод returnBook с названиями книг
    public void returnBook(String... bookTitles) {
        System.out.print(this.fio + " вернул книги: ");
        System.out.println(String.join(", ", bookTitles));
    }

    public static void main(String[] args) {
        Reader[] readers = new Reader[5];

        readers[0] = new Reader("Дейцев В. С.", 12345, "Филология", "06.02.2004", "123-456-7890");
        readers[1] = new Reader("Петров В. В.", 67890, "Математика", "25.09.1998", "987-654-3210");
        readers[2] = new Reader("Дружнов Г. М.", 24680, "Экология", "17.11.2001", "555-123-4567");
        readers[3] = new Reader("Зубцов А. П.", 13579, "Психология", "29.03.2002", "111-222-3333");
        readers[4] = new Reader("Лисин Д. Б.", 98765, "Биология", "30.07.2000", "444-555-6666");

        for (int i = 0; i < 5; i++) {
            readers[i].takeBook(3);
            readers[i].takeBook("Математика будущего", "Математическая смекалка");
            readers[i].returnBook(2);
            readers[i].returnBook("Психология отношений", "Искусство самопознания");
        }
    }
}
