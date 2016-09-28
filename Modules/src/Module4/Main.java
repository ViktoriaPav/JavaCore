package Module4;


public class Main {

   public static void main(String[] args) {

        Bank bank1 = new USBank(154313, "UNB", Currency.USD, 25, 2000, 654, 2000000);
        Bank bank2 = new USBank(13153, "UB", Currency.EUR, 45, 1500, 45, 520000000);
        Bank bank3 = new EUBank(6465416, "ENB", Currency.EUR, 15, 1500, 25, 50000000);
        Bank bank4 = new EUBank(1235464, "EB", Currency.USD, 64, 2050, 48, 645151303);
        Bank bank5 = new ChinaBank(1541132, "ChNB", Currency.USD, 16, 1000, 13, 75000000);
        Bank bank6 = new ChinaBank(15461323, "ChB", Currency.EUR, 45, 1250, 85, 1654130326);

        User user1 = new User(1353646, "Bladimer", 2000, 3, "Nike", 200, bank1);
        User user2 = new User(15686312, "Valentin", 50000, 40, "Adidas", 300, bank2);
        User user3 = new User(51654631, "Galina", 5000, 24, "Nike", 205, bank3);
        User user4 = new User(23151456, "Avgustin", 4005, 60, "Dolce & Gabbana", 250, bank4);
        User user5 = new User(15413235, "Evgeniy", 4596, 10, "Adidas", 150, bank5);
        User user6 = new User(1343512, "Nataly", 5694, 15, "Victoria's Secret", 456, bank6);

       BankSystem bankSystem = new BankSystemImpl();

       bankSystem.withdrawOfUser(user1,124);
       bankSystem.transferMoney(user2, user3, 500);
       bankSystem.fundUser(user4, 256);
       bankSystem.paySalary(user5);

       System.out.println(user1.toString());
       System.out.println(user2);
       System.out.println(user3);
       System.out.println(user4);
       System.out.println(user5);

    }
}
