package Module3.Module3Task4;

public class Main {
    public static void main(String[] args) {
        User u = new User("Ann",1200,24,"Nike",200,"UA");
        u.withdraw(100);
        u.monthIncreaser(12);
        System.out.println("balance u- " + u.balance + "; " +"monthofEmployment -" + u.monthsOfEmployment);
        System.out.println(u.companyNameLength());
    }
}
