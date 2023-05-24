package assignment8;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Person p1 = new Person("Quan", 25, "123456789", "Ha Noi");
        Person p2 = new Person("Nguyen", 21, "25646515", "TP Ho Chi Minh");
        Person p3 = new Person("Trang", 18, "21205485", "Da Nang");
        Person p4 = new Person("Viet", 20, "254865151", "Da Lat");
        Room room = new Room("Karaoke", "Khu 2 Hoang Khuong Thanh Ba Phu Tho");
        room.addPerson(p1);
        room.addPerson(p2);
        room.addPerson(p3);
        room.addPerson(p4);
        room.removePerson(p4);
        room.printInfo();
    }
}