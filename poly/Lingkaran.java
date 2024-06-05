package poly;

public class Lingkaran extends BangunDatar {
    private int radius;
    private static final float PI = 3.14f;

    public Lingkaran(int radius) {
        this.radius = radius;
    }

    @Override
    public void luas() {
        float luas = PI * radius * radius;
        System.out.println("Luas Lingkaran: " + luas);
    }

    @Override
    public void keliling() {
        float keliling = 2 * PI * radius;
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}

