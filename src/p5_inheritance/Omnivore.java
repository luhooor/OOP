package p5_inheritance;

public class Omnivore extends Animal {
    @Override
    void identify_myself() {
        nama = "Ayam";
        gigiBinatang = "Tajam and Tumpul";
        jenisMakanan = "Semua";

        System.out.println("Hi, I'm Carnivore , My Name is " + nama + ", My Food is '"+jenisMakanan+"', I have "+gigiBinatang+" teeth");
    }
}
