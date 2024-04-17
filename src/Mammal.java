public class Mammal extends Animals {
    int noOfLegs;
    String color = "various";

    public String sound() {
        System.out.println(super.sound());
        return "sound in Mammal";
    }

    public String move() {
        return "A Mammal walks or runs";
    }

    public String sit() {
        System.out.println(super.move());
        return "I have sat";
    }

    public static void main(String[] args) {
        Mammal dog = new Mammal();
        Animals anyAnimal = new Animals();
        Animals secondAnimal = new Mammal();

        System.out.printf("%s\n", dog.sound());
        System.out.printf("%s\n", dog.sit());
        System.out.printf("%s\n", anyAnimal.move());
        System.out.printf("%s\n", secondAnimal.sound());
    }
}
