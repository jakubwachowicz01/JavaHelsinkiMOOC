
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        if(increase<0) return;
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        if(this.balance>=amount){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }
}
