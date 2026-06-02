public class AbstractDemo {

    public static void main(String[] args) {
        SavingsAccount sv = new SavingsAccount();
        sv.addMoney(100);
        sv.getBalance();
        System.out.println(sv.getBalance());
    }
   
    
}


abstract class BankAccount {
    double balance;
    abstract void addMoney(double amount);
    abstract void withDrawMoney(double amount);


    // So abstract class can have non abstract method
    void updatebalance(double _balance) {
        balance = _balance;
    }


    public double getBalance(){
        return balance;
    }
}


class SavingsAccount extends BankAccount {

    public void addMoney(double amount){
        super.updatebalance(super.getBalance() + amount);
    }

    public void canUserWithdraw(double amount) {
        if(amount <- super.getBalance()) {
            System.out.println("User can");
        } 
        else {
            System.out.println("User cannot");
        }
    }

    @Override
    void withDrawMoney(double amount) {
    if (amount <= getBalance()) {
        updatebalance(getBalance() - amount);
        System.out.println("Withdrew: " + amount);
    } else {
        System.out.println("Insufficient balance.");
    }
}
}
