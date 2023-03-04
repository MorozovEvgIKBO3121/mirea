package lab2;

public class Dog {
    private String name;
    private int age;

    private int humanAge;

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        humanAge = age * 7;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "Кличка собаки: " + name  +
                "; Возраст собаки: " + age +
                "; Возраст в человеческих годах: " + humanAge +
                "}\n";
    }
}

