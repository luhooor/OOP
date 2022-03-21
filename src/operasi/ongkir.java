package operasi;

import java.util.Scanner;

public class ongkir {
    int p, l, t, d, b, harga = 5000;

    public void input() {
//        input panjang
        Scanner panjang = new Scanner(System.in);
        System.out.print("Panjang: ");
        p = panjang.nextInt();
//        input lebar
        Scanner lebar = new Scanner(System.in);
        System.out.print("Lebar: ");
        l = lebar.nextInt();
//        input tinggi
        Scanner tinggi = new Scanner(System.in);
        System.out.print("Tinggi: ");
        t = tinggi.nextInt();

//        input berat
        Scanner berat = new Scanner(System.in);
        System.out.print("Berat: ");
        b = berat.nextInt();
    }

    public int hitung() {
// dimensi dan berat
        int d = p * l * t;

        if (d < 50 || b < 1 || (d < 50 && b < 1)) {
            harga = 5000;
        } else {
            harga *= d * b;
        }

        return harga;
    }
}
