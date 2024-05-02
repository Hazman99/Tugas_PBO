import java.util.Scanner;

class Student extends Person {
    double spp;
    double sks;
    double modul;

    public void inputPs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("SPP : ");
        spp = scanner.nextDouble();
        System.out.print("SKS : ");
        sks = scanner.nextDouble();
        System.out.print("Modul : ");
        modul = scanner.nextDouble();
    }
    public double hitungPembayaran() {
        return spp + (sks * 250000) + modul;
    }
}