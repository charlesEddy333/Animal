public class Bird extends Animals {
    int noOfLegs;
    String color = "various";

    public String sound() {
        System.out.println(super.sound());
        return "sound in Bird";
    }

    public String move() {
        return "A Bird flies or walks";
    }

    public String sit() {
        System.out.println(super.move());
        return "I have perched";
    }

    public static void main(String[] args) {
        Bird eagle = new Bird();
        Animals anyAnimal = new Animals();
        Animals secondAnimal = new Bird();

        System.out.printf("%s\n", eagle.sound());
        System.out.printf("%s\n", eagle.sit());
        System.out.printf("%s\n", anyAnimal.move());
        System.out.printf("%s\n", secondAnimal.sound());
    }
}
