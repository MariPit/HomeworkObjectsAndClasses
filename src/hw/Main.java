package hw;

public class Main {


    public static void main(String[] args) {
        Author Dostaevsky = new Author("Федор", "Достаевский");
        Book Idiot = new Book("Идиот", Dostaevsky, 1868);

        Author Griboedov = new Author("Александр", "Грибоедов");
        Book WoeFromWit = new Book("Горе от ума", Griboedov, 1833);

        System.out.println("Название книги: " + Idiot.getTitle()
                + " Автор: " + Dostaevsky.getName() + " " + Dostaevsky.getSurname()
                + " Год издания:" + Idiot.getPublicationYear());
        System.out.println("Название книги: " + WoeFromWit.getTitle()
                + " Автор: " + WoeFromWit.getAuthor().getName() + " " + WoeFromWit.getAuthor().getSurname()
                + " Год издания:" + WoeFromWit.getPublicationYear());

        Idiot.setPublicationYear(1990);
        System.out.println("Idiot = " + Idiot.getPublicationYear());
    }
    }