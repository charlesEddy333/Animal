public class Reptile extends Animals {
    int noOfLegs;
    String color = "various";

    public String sound() {
        System.out.println(super.sound());
        return "sound in Reptile";
    }

    public String move() {
        return "A Reptile slithers or crawls";
    }

    public String sit() {
        System.out.println(super.move());
        return "I have sat";
    }

    public static void main(String[] args) {
        Reptile snake = new Reptile();
        Animals anyAnimal = new Animals();
        Animals secondAnimal = new Reptile();

        System.out.printf("%s\n", snake.sound());
        System.out.printf("%s\n", snake.sit());
        System.out.printf("%s\n", anyAnimal.move());
        System.out.printf("%s\n", secondAnimal.sound());
    }
}
