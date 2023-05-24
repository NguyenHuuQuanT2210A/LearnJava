package assignment10;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("Nguyen Huu Quan", "123456789");
        phoneBook.insertPhone("Tran Thai Son", "455989125");
        phoneBook.insertPhone("Dinh Van Duong", "134420542");
        phoneBook.insertPhone("Le Thi Mau", "871522156");
        phoneBook.sort();
        phoneBook.updatePhone("Dinh Van Duong", "134420542", "024865165");
        phoneBook.removePhone("Le Thi Mau");
    }
}