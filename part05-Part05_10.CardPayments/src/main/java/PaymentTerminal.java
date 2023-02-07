
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money=1000;
    }

    public double eatAffordably(double payment) {
        if(payment>=2.50){
            this.affordableMeals++;
            this.money+=2.50;
            return payment-2.50;
        }else{
            return payment;
        }

        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

    }

    public double eatHeartily(double payment) {
        if(payment>=4.30){
            this.heartyMeals++;
            this.money+=4.30;
            return payment-4.30;
        }else{
            return payment;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

    }
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance()>=2.50){
            this.affordableMeals++;
            card.takeMoney(2.50);
            return true;
        }else{
            return false;
        }
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance()>=4.30){
            this.heartyMeals++;
            card.takeMoney(4.30);
            return true;
        }else{
            return false;
        }
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        card.addMoney(sum);
        if(sum>0) this.money+=sum;
    }
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
