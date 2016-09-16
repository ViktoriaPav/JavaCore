package Module3.Module3Task3;

import java.util.Date;
import java.util.GregorianCalendar;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;


    public Course(int year, int month, int day, String name) {
        GregorianCalendar f = new GregorianCalendar(year,month,day);
        startDate = f.getTime();
        this.name = name;
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
