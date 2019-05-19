package zadanieZoo;

public class Dog extends Animal implements Canie {

    public Dog(String name, float weight) {
        super(name, weight);
    }


    public void bark() {
        System.out.println("BARK BARK BARK");
    }


    @Override
    public String introduce() {
        String message =  "I'm a dog. My name is "
                + this.getName()
                + ". I weigh "
                + this.getWeight()
                + " kg and my fang length is "
                + ".";
        System.out.println(message);
        return message;
    }

    public void sitPretty() {
        System.out.println(this.getName() + " sits pretty.");
    }

}
