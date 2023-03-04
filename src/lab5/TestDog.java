package lab5;

public class TestDog {
    public static void main(String[] args) {
        Alabai alabai1 = new Alabai();
        alabai1.setNameBreedCharacter("Шарик", "Алабай", "Игривый");

        Bulldog bulldog1 = new Bulldog();
        bulldog1.setNameBreedCharacter("Бобик", "Английский бульдог", "Смелый");

        System.out.println(bulldog1);
        System.out.println(alabai1);
    }
}
