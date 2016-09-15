package Module3.Module3Task3;

public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(2013/11/12, "Alex");
        Course course2 = new Course(2013/9/15, "Clarke");
        Course course3 = new Course(2013/6/20,"Lora");
        Course course4 = new Course(40,"Maks");
        Course course5 = new Course(50,"Mick");

        Student student1 = new Student("Nick","Bush",1);
        Student student2 = new Student("Zinger", new Course[]{course1, course2, course3});
        Student student3 = new Student("Techer","Margaret", 2, new Course[]{course3, course5}, 20);

        CollegeStudent collegeStudent1 = new CollegeStudent("Olga","Kreytor",3);
        CollegeStudent collegeStudent2 = new CollegeStudent("Cat",new Course[]{course4,course2,course3});
        CollegeStudent collegeStudent3 = new CollegeStudent("Oleg","Melnik",6,"UNU",6 ,56323222, 30,new Course[]{course1,course2,course3});

        SpecialStudent sStudent1 = new SpecialStudent("Ann","Beliaev",6);
        SpecialStudent sStudent2 = new SpecialStudent("Matushkin", new Course[]{course1,course5});
        SpecialStudent sStudent3 = new SpecialStudent("Noy","Mishutkin",2,"ONU", 5, 45614616, 28, new Course[]{course1,course3}, 652656461);
    }
}
