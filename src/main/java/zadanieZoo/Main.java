package zadanieZoo;

public class Main {

    public static void main(String[] args) {

        Bear bear = new Bear("Yogi", 200, 40);
        bear.introduce();

        //tworzenie obiektu z poziomu klasy nadrzędej Animal.
        Animal bear2 = new Bear("Koralgol", 80, 10);
        bear2.introduce();

        Tiger tiger = new Tiger("Jataka", 150, 25);
        tiger.introduce();

        Animal wolf = new Wolf("Howler", 70, 40);
        wolf.introduce(); //dostep tylko dometod klasy nadrzednej

        Canie wolf2 = new Wolf("Howler", 70, 40);
        wolf2.bark(); //dostep tylko do metod interfejsu

        Wolf wolf3 = new Wolf("Howler2", 70, 40);

        Dog dog = new Dog("Scooby", 55);
        dog.sitPretty();

    }
}
