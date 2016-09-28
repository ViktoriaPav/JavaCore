package Module4;

public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {

        if (amount < user.getBank().getLimitOfWithdrawal() || user.getBank().getLimitOfWithdrawal() == 0) {

            double commission = (double)amount / 100 * user.getBank().getCommission(amount);

            if (user.getBalance() > commission + (double)amount) {
                user.setBalance(user.getBalance() - (double) amount - commission);
                System.out.println(user.toString() + ". Withdraw Of User = " + amount);

            } else {
                System.out.println("The amount exceeds the current balance");
            }
        } else {
            System.out.println("The amount exceeds the limit of the bank");
        }
    }


    @Override
    public void fundUser(User user, int amount) {

        if(amount < user.getBank().getLimitOfFunding() || user.getBank().getLimitOfFunding() == 0){
            user.setBalance(amount + user.getBalance());
        } else {
            System.out.println("The amount exceeds the limit of the bank");
        }
    }


    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if(amount < fromUser.getBank().getLimitOfWithdrawal() || fromUser.getBank().getLimitOfWithdrawal() == 0){

            double commission = (double)amount / 100 * fromUser.getBank().getCommission(amount);

            if( fromUser.getBalance() > (double)amount + commission){

                if(amount < toUser.getBank().getLimitOfFunding()){

                    fromUser.setBalance(fromUser.getBalance() - (double)amount - commission);
                    fromUser.getBank().setTotalCapital(fromUser.getBank().getTotalCapital() + (long) commission);
                    toUser.setBalance(toUser.getBalance() + amount);

                    } else {
                    System.out.println("The amount exceeds the limit of the bank");
                }
            } else {
                System.out.println("The amount exceeds the current balance User");
            }
        } else {
            System.out.println("The amount exceeds the limit of the bank");
        }

    }

    @Override
    public void paySalary(User user) {
        double monthRate = user.getSalary() / 100 * user.getBank().getMonthlyRate();
        if ((long) user.getBank().moneyPaidMonthlyForSalary() < user.getBank().getTotalCapital()){
            user.getBank().setTotalCapital(user.getBank().getTotalCapital() - (long)user.getSalary() - (long)monthRate);
            user.setBalance(user.getSalary() + monthRate + user.getBalance());
            user.setMonthsOfEmployment(user.getMonthsOfEmployment() + 1);
        } else {
            System.out.println("The amount exceeds the current balance of Bank");
        }
    }
}
