package lab5;

public abstract class Dog {
    public String name;
    public String breed;

    public String character;

    public void setNameBreedCharacter(String name, String breed, String character) {
        this.name = name;
        this.breed = breed;
        this.character = character;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Кличка собаки - " + name +
                "\nПорода: " + breed +"\nХарактер: " + character + "\n";
    }
}
