import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangBay hangBay = new HangBay("HB001", "Vietnam Airlines");
        ChuyenBay cb1 = new ChuyenBay("CB0001", "Hanoi", "Ho Chi Minh", "10/12/2024", "10:00", 1150);
        hangBay.themChuyenBay(cb1);
        HanhKhach khach = new HanhKhach("KH001", "Nguyen Van A", 1990, "AB123456", "HB001", "TV001", 'B', "Hanoi");
        System.out.println(khach);
        scanner.close();
    }
}