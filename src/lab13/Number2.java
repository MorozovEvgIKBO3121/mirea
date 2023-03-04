package lab13;

public class Number2 {
    public static void main(String[] args) {
        Person person1 = new Person("Морозов", "Евгений", "Павлович");
        System.out.println(person1.getFullName());

        Person person2 = new Person("Морозов", "Евгений", null);
        System.out.println(person2.getFullName());

        Person person3 = new Person("Иван", null, "Александрович");
        System.out.println(person3.getFullName());

        Person person4 = new Person("Сидоров", "", "");
        System.out.println(person4.getFullName());
    }
}
