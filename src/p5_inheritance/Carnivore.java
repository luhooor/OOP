package p5_inheritance;

public class Carnivore extends Animal {
    @Override
    void identify_myself() {
        nama = "Singa";
        gigiBinatang = "Tajam";
        jenisMakanan = "Daging";

        System.out.println("Hi, I'm Carnivore , My Name is " + nama + ", My Food is '"+jenisMakanan+"', I have "+gigiBinatang+" teeth");
    }
}
