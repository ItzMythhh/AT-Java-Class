public class Main {
    public static void main(String[] args) {

        BaseballCard card1 = new BaseballCard("Derek Jeter", "Yankees", 2001);
        BaseballCard card2 = new BaseballCard("Derek Jeter", "Yankees", 2001);
        BaseballCard card3 = new BaseballCard("Mike Trout", "Angels", 2015);

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println("Card 3: " + card3);

        System.out.println("\ncard1 equals card2: " + card1.equals(card2));
        System.out.println("card1 equals card3: " + card1.equals(card3));
    }
}
