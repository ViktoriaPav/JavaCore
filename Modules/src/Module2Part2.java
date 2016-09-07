import java.util.Scanner;

public class Module2Part2 {
    public static void main(String[] args) {

        Double balance = 135.0;

        System.out.println("Please input the sum of money which you want withdraw from your account");

        Scanner sc = new Scanner(System.in);
        Double withdrawal = sc.nextDouble();

        System.out.println(bank(balance, withdrawal));
    }
        static String bank(Double balance,Double withdrawal){
            String bank = "No";
            Double commision = balance / 100 * 5;

            if(balance > (withdrawal + commision)) {
                balance = balance - withdrawal - commision;
                bank = "OK " + commision + " " + balance;
            }
    return bank;
    }
}
