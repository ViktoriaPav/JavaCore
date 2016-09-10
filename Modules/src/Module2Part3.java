import java.util.Scanner;

public class Module2Part3 {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        System.out.println("Please enter you Name:");
        Scanner sc = new Scanner(System.in);
        String ownerName = sc.nextLine();

        System.out.println("Please enter the sum of money which you want withdraw from your account:");
        double withdrawal = sc.nextDouble();

        if (bank(balances, ownerNames, ownerName, withdrawal) != true) {
            System.out.println("No");
        }
    }

    static Boolean bank(int[] balances, String[] ownerNames, String ownerName, double withdrawal) {
        Boolean bank = true;
        int balanceInt = 0;

        for (int i = 0; i <= ownerNames.length - 1; i++) {

            if (ownerName.equals(ownerNames[i])) {
                balanceInt = balances[i];
                double balance = (double) balanceInt;
                double commision = withdrawal / 100 * 5;

                if (balance > commision + withdrawal) {
                    balance = balance - commision - withdrawal;
                    System.out.println("OK " + withdrawal + " " + balance);
                    bank = false;
                } else {
                    bank = true;
                }
            } else {
                bank = true;
            }
        }
        return bank;
    }
}
