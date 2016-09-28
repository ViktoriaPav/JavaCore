package Module4;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    //    limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal = 0;
        if (super.getCurrency() == Currency.USD) {
            limitOfWithdrawal = 100;
        }
        if (super.getCurrency()==Currency.EUR){
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;
    }

    //    limit of funding - 5000 if EUR and 10000 if USD
    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 0;
        if (super.getCurrency()==Currency.EUR){
            limitOfFunding = 5000;
        }
        if (super.getCurrency()==Currency.USD){
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    //    monthly rate - 1% with USD and 0% with EUR
    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        if (super.getCurrency()==Currency.USD){
            monthlyRate = 1;
        }
        if (super.getCurrency()==Currency.EUR){
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    //    commision - 3% if USD and up to 1000, 5% if USD and more than 1000
    //    0% if EUR and up to 1000 and 11% if EUR and more than 1000
    @Override
    int getCommission(int summ) {
        int commission = 0;
        if (super.getCurrency()==Currency.USD){
            if (summ < 1000){
                commission = 3;
            } else {
                commission = 5;
            }
        }
        if (super.getCurrency()==Currency.EUR){
            if (summ > 1000){
                commission = 11;
            }
        }
        return commission;
    }
}

