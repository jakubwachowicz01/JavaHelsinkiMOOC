
public class Statistics {
    private int count;
    private int sum;
    public Statistics() {
        this.count = count;
        this.sum = 0;
    }

    public void addNumber(int number){
        count++;
        this.sum += number;
    }

    public int getCount(){
        return this.count;
    }

    public int sum(){
        if(count!=0){
            return this.sum;
        }else{
            return 0;
        }

    }
    public double average(){
        if(count!=0){
            return 1.0*this.sum/this.count;
        }else{
            return 0;
        }

    }
}
