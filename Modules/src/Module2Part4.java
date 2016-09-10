import java.util.Scanner;

public class Module2Part4 {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        System.out.println("Please enter you Name:");
        Scanner sc = new Scanner(System.in);
        String ownerName = sc.nextLine();

        System.out.println("Please enter the sum of money which you want fund to your account:");
        double fund = sc.nextDouble();
        if (bank(balances, ownerNames, ownerName, fund) != true) {
            System.out.println("No");
        }
    }

    static Boolean bank(int[] balances, String[] ownerNames, String ownerName, double fund) {
        Boolean bank = true;
        int balance = 0;

        for (int i = 0; i <= ownerNames.length - 1; i++) {

            if (ownerName.equals(ownerNames[i])) {
                balance = balances[i];
                int fundInt = (int) fund;

                balances[i] = fundInt + balances[i];

                System.out.println("OK " + ownerNames[i] + " " + balances[i]);
                bank = false;

            } else {
                bank = true;
            }
        }
        return bank;
    }
}

