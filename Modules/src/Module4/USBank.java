package Module4;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    //limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal=0;
        if (super.getCurrency()==Currency.USD){
            limitOfWithdrawal = 1000;
        }
        if (super.getCurrency()==Currency.EUR){
            limitOfWithdrawal = 1200;
        }
       return limitOfWithdrawal;
    }

    //limit of funding - 10000 if EUR and no limit if USD
    @Override
    int getLimitOfFunding() {
        int limitOfFunding=0;
        if(super.getCurrency()==Currency.EUR){
            limitOfFunding = 10000;
        }
        if(super.getCurrency()==Currency.USD){
            limitOfFunding=0;    //думаю тут будет ошибка, так как в дальнейшем может получится услови не больше "0".
        }
        return limitOfFunding;
    }

    //monthly rate - 1% with USD and 2% with EUR
    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
         if(super.getCurrency()== Currency.USD){
             monthlyRate=1;
         }
        if (super.getCurrency() == Currency.EUR){
            monthlyRate=2;
        }
        return monthlyRate;
    }

    //commision - 5% if USD and up to 1000, 7% if USD and more than 1000
    //6% if EUR and up to 1000 and 8% if EUR and more than 1000
    @Override
    int getCommission(int summ) {
        int commission = 0;
        if(super.getCurrency()==Currency.USD){
            if(summ < 1000){
                commission = 5;
            } else {
                commission = 7;
            }
        }
        if(super.getCurrency()==Currency.EUR){
            if(summ<1000){
                commission=6;
            } else {
                commission=8;
            }
        }
        return commission;
    }
}
