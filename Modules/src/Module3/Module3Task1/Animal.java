package Module3.Module3Task1;

public class Animal {
    private String breed;
    private String name;
    private int year;
    private String place;

    public Animal(String breed, String name, int year, String place) {
        this.breed = breed;
        this.name = name;
        this.year = year;
        this.place = place;
    }

    public void talk() {
        System.out.println("I am waking");
    }
}
