package zadanieZoo;

public class Wolf extends Animal implements Canie  {
    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }


    public void bark() {
        System.out.println("BARK BARK BARK");
    }


    @Override
    public String introduce() {
        String message = "I'm a wolf. My name is "
                + this.getName()
                + ". I weigh "
                + this.getWeight()
                + " kg and my fang length is "
                + fangLength + ".";
        System.out.println(message);
        return message;
    }

    public int getFangLength() {
        return fangLength;
    }

    public void setFangLength(int fangLength) {
        this.fangLength = fangLength;
    }
}
