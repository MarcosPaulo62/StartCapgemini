package Interfaces;

public class Gado implements Animal {

    @Override
    public void animalSom() {
        System.out.println("Muuuuu");
    }

    @Override
    public void animalComer() {
        System.out.println("Comendo capim");
    }

    @Override
    public void animalAbrigo() {
        System.out.println("Curral");
    }
}
