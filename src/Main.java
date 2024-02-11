public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book();
        Menu menu = new Menu(library);
        menu.gererMenu();
    }
}
