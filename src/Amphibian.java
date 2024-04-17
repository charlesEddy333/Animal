public class Amphibian extends Animals {
    int noOfLegs;
    String color="green";

    public String sound(){
        System.out.println(super.sound());
        return "sound in Amphibian";
    }


    public String move(){
        return "An Amphibian swims or crawls";
    }

    public String sit(){
        System.out.println(super.move());
        return "i have sat";
    }


    public static void main(String[] args) {
        Amphibian frog = new Amphibian();
        Animals anyAnimals = new Animals();
        Animals secondAnimals=new Amphibian();

       System.out.printf("%s\n",frog.sound());
       System.out.printf("%s\n",frog.sit());
       System.out.printf("%s\n",anyAnimals.move());
        System.out.printf("%s\n",secondAnimals.sound());

    }
}





