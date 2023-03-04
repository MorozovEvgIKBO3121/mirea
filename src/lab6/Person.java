package lab6;

public class Person implements Nameable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Я человек, моё имя " + name);
    }
}
