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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void talk() {
        System.out.println("I am waking");
    }
}
