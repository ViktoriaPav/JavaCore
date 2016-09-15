package Module3.Module3Task3;

import java.util.Date;

public class Course {
    Date startDate;
    String name;
    int hoursDuration;
    String teacherName;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hoursDuration, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }
}
