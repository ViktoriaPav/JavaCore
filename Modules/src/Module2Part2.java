import java.util.Scanner;

public class Module2Part2 {
    public static void main(String[] args) {

        Double balance = 135.0;
        Double commision;
        System.out.println("Please input the sum of money which you want withdraw from your account");

        Scanner sc = new Scanner(System.in);
        Double withdrawal = sc.nextDouble();

        commision = withdrawal / 100 * 5;


        if (bank(balance, withdrawal, commision) == true ){
            balance = balance - commision - withdrawal;
            System.out.println("OK " + commision + " " + balance);
        } else {
            System.out.println("NO");
        }
    }


    static Boolean bank(Double balance,Double withdrawal,Double commision){
        Boolean bank = true;
        if (balance < (withdrawal + commision)){
            bank = false;
        }
        return bank;
    }
}
