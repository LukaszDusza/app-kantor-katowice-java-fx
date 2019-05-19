package zadanieZoo;

public class Bear extends Animal {

    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    public String introduce() {
        String message =  "i'am a bear. My name is: "
                + this.getName() + ". "
                + this.getWeight()
                + " kg and my fur length is  "
                + this.furLength + ".";
        System.out.println(message);
        return message;
    }

    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }
}
