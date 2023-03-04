package lab6;

public class Animal implements Nameable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Кличка животного " + name);
    }
}
