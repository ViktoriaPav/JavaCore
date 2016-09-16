package Module3.Module3Task4;

public class User {
    String name;
    int balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //that add salary to the balance of the user
    public void paySalary(int salary, int balance) {
        balance = balance + salary;
    }

    //withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
    public void withdraw(int summ, int balance) {
        double commision = summ / 100;
        if (summ < 1000) {
            balance = balance - summ - (int) (commision * 5);
        } else {
            balance = balance - summ - (int) (commision * 10);
        }
    }

    // companyNameLenfht - calculates name of the company name
    public void companyNameLenfht(String name, String companyName) {

    }

    //monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
    public void monthIncreaser(int addMonth, int monthsOfEmployment) {
        monthsOfEmployment = monthsOfEmployment + addMonth;
    }
}
