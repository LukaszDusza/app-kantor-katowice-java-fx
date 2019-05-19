package zadanieZoo;

public class Tiger extends  Animal {
    private int clawLength;

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }

    @Override
    public String introduce() {
        String message = "I'm a tiger. My name is " + this.getName() + ". I weigh " + this.getWeight() + " kg and my claw length is " + clawLength+ ".";
        System.out.println(message);
   return message;
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }
}
