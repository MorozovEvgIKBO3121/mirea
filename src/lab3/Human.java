package lab3;

public class Human {
    private String name;
    private String sizeHead;
    private int sizeLegs;
    private String sizeHands;

    public Human(String name, Head head, Leg leg, Hand hand) {
        this.name = name;
        this.sizeHead = head.sizeHead;
        this.sizeLegs = leg.sizeLegs;
        this.sizeHands = hand.sizeHands;
    }
    public void showHuman(){
        System.out.println("Имя человека: " + name + "\nРазмер его головы - " + sizeHead + "\nРазмер его рук - " + sizeHands + "\nРазмер его ног - " + sizeLegs);
    }
}
