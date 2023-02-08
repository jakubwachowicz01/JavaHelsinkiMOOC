
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        if(this.day+1>30){
            if(this.month+1>12){
                this.day=1;
                this.month=1;
                this.year+=1;
            }else{
                this.day=1;
                this.month+=1;
            }
        }else{
            this.day+=1;
        }
    }

    public void advance(int howManyDays){
        for (int i=0;i<howManyDays;i++){
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate dateCopy = new SimpleDate(this.day,this.month,this.year);
        dateCopy.advance(days);
        return dateCopy;
    }
}
