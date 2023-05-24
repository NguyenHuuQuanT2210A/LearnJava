package assignment2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        new PhanSo();
        new PhanSo(3, 5);
        a.setTuSo(5);
        a.setMauSo(10);
        a.inPhanSo();
        a.rutGon();
        a.nghichDao();
    }
}
