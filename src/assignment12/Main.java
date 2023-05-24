package assignment12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        News a = new News(1, "abcdxyz","02/02/2002","NHQ","Anh danh ca va con ca vang",3);
        a.Display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sao ban muon danh gia: ");
        sc.nextFloat();
    }
}
