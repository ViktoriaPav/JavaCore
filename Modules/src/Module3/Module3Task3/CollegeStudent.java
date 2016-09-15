package Module3.Module3Task3;

public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, int age, Course[] coursesTaken) {
        super(firstName, lastName, group);
        this.coursesTaken = coursesTaken;
        this.age = age;
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
