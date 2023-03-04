package lab5;

public class Chair extends Furniture{

    public Chair() {
    }
    public void buy(Chair chair, int money){
        if (chair.price == money){
            System.out.println("\nВы приобрели этот стул!");
        }
        else{
            System.out.println("\nУ вас недостаточно денег!");
        }
    }
}
