package poly;

public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void luas() {
        int luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    @Override
    public void keliling() {
        int keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }
}

