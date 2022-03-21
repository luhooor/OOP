import operasi.rumus;

class p1_luasDanKeliling {
    public static void main(String[] args) {
        System.out.println("Luas");
        System.out.println("Persegi: "+ rumus.luasPersegi(4));
        System.out.println("Segitiga: "+ rumus.luasSegitiga(3,4));
        System.out.println("Persegi Panjang: "+ rumus.luaspersegiPanjang(7,8));
        System.out.println("Keliling");
        System.out.println("Persegi: "+ rumus.kelilingPersegi(4));
        System.out.println("Segitiga: "+ rumus.kelilingSegitiga(3,4));
        System.out.println("Persegi Panjang: "+ rumus.kelilingpersegiPanjang(7,8));
    }
}
