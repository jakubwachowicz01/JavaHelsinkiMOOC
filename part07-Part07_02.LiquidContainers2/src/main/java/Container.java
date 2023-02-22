public class Container {
    private int contains;

    public Container() {
        this.contains = 0;
    }

    public int contains(){
        return this.contains;
    }

    public void add(int amount){
        if(amount<0) return;
        if(this.contains+amount>100){
            this.contains=100;
        }else{
            this.contains+=amount;
        }
    }

    public void remove(int amount){
        if(amount<0) return;
        if(this.contains-amount<0){
            this.contains=0;
        }else{
            this.contains-=amount;
        }
    }

    public String toString(){
        return this.contains + "/100";
    }
}
