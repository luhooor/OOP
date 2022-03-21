package p5_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Herbivore herbivora = new Herbivore();
        Carnivore karnivora = new Carnivore();
        Omnivore omnivora = new Omnivore();

        animal.identify_myself();
        System.out.println();
        herbivora.identify_myself();
        karnivora.identify_myself();
        System.out.println();
        omnivora.identify_myself();

    }
}
