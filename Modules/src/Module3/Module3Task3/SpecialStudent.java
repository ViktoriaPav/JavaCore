package Module3.Module3Task3;

public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, int age, Course[] coursesTaken, long secretKey) {
        super(firstName, lastName, group, collegeName, rating, id, age, coursesTaken);
        this.secretKey = secretKey;
    }
}
