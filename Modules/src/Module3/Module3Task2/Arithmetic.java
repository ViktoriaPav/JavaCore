package Module3.Module3Task2;

public class Arithmetic {
    Integer a;
    Integer b;

    public Arithmetic(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public int add(Integer a, Integer b) {

        int sum = a + b;

        return sum;

    }

}
