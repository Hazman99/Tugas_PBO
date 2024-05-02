import java.util.Scanner;

class Person {
    String name;
    String address;
    String nim;

    public void inputM() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        name = scanner.nextLine();
        System.out.print("Alamat: ");
        address = scanner.nextLine();
        System.out.print("NIM: ");
        nim = scanner.nextLine();
    }

    public void printI() {
        System.out.println("Nama : " + name);
        System.out.println("Alamat : " + address);
        System.out.println("NIM: " + nim);
    }

    public void hobi() {
        System.out.println("Bola");
    }
}
