import operasi.ongkir;

public class p3_ongkir {
    public static void main(String[] args) {
        ongkir ongkir = new ongkir();

        ongkir.input();

        System.out.println();
        System.out.println("Harga: " + "Rp\t" + ongkir.hitung());
    }
}
