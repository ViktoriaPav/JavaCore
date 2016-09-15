package Module3.Module3Task1;

public class Bird extends Animal {

    public Bird(String breed, String name, int year, String place) {
        super(breed, name, year, place);
    }

    public void talking() {
        System.out.println("I am flying");
        System.out.println("I am singing");
        System.out.println("I am Bird");
    }
}
