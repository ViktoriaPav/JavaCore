package Module4;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    //limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
    @Override
    int getLimitOfWithdrawal() {
        int limitetOfWithdrawal = 0;
        if (super.getCurrency() == Currency.USD) {
            limitetOfWithdrawal = 2000;
        }
        if (super.getCurrency() == Currency.EUR) {
            limitetOfWithdrawal = 2200;
        }
        return limitetOfWithdrawal;
    }

    //limit of funding - 20000 if EUR and 10000 if USD
    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (super.getCurrency() == Currency.EUR) {
            limitOfFunding = 20000;
        }
        if (super.getCurrency() == Currency.USD) {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    //monthly rate - 0% with USD and 1% with EUR
    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        if (super.getCurrency() == Currency.USD)
            if (super.getCurrency() == Currency.EUR) {
                monthlyRate = 1;
            }
        return monthlyRate;
    }

    //   commision - 5% if USD and up to 1000, 7% if USD and more than 1000
//   2% if EUR and up to 1000 and 4% if EUR and more than 1000
    @Override
    int getCommission(int summ) {
        int commission = 0;
        if (super.getCurrency() == Currency.USD) {
            if (summ < 1000) {
                commission = 5;
            } else {
                commission = 7;
            }
        }
        if (super.getCurrency() == Currency.EUR) {
            if (summ < 1000) {
                commission = 2;
            } else {
                commission = 4;
            }
        }
        return commission;
    }
}
