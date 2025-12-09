class ChildBankAccount {

    private double balance;
    private double maxBalance;

    public ChildBankAccount(int maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        if (value <= 0) {
            return false;
        }
        if (value + balance > maxBalance) {
            return false;
        }
        balance = balance + value;
        return true;
    }

    public boolean debitMoney(double value) {
        //todo
        if (value <= 0) {
            return false;
        }

        if (balance - value < 0) {
            //not enough
            return false;
        }

        balance = balance - value;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

class Country{
    private String title;
    private String cityName;
    private int population;
    private double area;
    private boolean isOceanFront;

    public Country(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0) {
            return;
        }
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isOceanFront() {
        return isOceanFront;
    }

    public void setOceanFront(boolean oceanFront) {
        isOceanFront = oceanFront;
    }
}

public class Main {
    public static void main(String[] args) {
        //1
        ChildBankAccount account =
                new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balance: " + account.getBalance());

        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balance: " + account.getBalance());


        //2
        Country country = new Country("USA");
        country.setPopulation(1_999_999_999);
        System.out.println("Country title :" + country.getTitle());
        System.out.println("Country population :" + country.getPopulation());

    }
}