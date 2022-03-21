package p5_inheritance;

public class Herbivore extends Animal {
    @Override
    void identify_myself() {
        nama = "Kambing";
        gigiBinatang = "Tumpul";
        jenisMakanan = "Tumbuhan";

        System.out.println("Hi, I'm Carnivore , My Name is " + nama + ", My Food is '"+jenisMakanan+"', I have "+gigiBinatang+" teeth");
    }
}
