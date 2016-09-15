package Module3.Module3Task2;

public class Adder extends Arithmetic {

    public boolean check(Integer a, Integer b) {
        boolean check;
        if (a >= b) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }
}
