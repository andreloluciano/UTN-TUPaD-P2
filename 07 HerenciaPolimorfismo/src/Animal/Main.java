package Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Lucky"));
        animales.add(new Gato("God of War"));
        animales.add(new Vaca("Loki"));


        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }
    }
}
