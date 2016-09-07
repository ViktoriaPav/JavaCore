import java.util.Scanner;

public class Module2Part2 {
    public static void main(String[] args) {

        Double balance = 135.0;

        System.out.println("Please input the sum of money which you want withdraw from your account: ");

        Scanner sc = new Scanner(System.in);
        Double withdrawal = sc.nextDouble();

        if (bank(balance, withdrawal) != true) {
            System.out.println("NO");
        }
    }


    static Boolean bank(Double balance, Double withdrawal) {
        Boolean bank;
        Double commision = withdrawal / 100 * 5;
        if (balance > (withdrawal + commision)) {
            bank = true;
            balance = balance - commision - withdrawal;
            System.out.println("OK " + commision + " " + balance);
        } else {
            bank = false;
        }
        return bank;
    }
}
