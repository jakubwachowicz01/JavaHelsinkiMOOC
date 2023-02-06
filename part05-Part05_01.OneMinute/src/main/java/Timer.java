public class Timer {
    private ClockHand miliSeconds;
    private ClockHand seconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.miliSeconds = new ClockHand(100);
    }

    public void advance(){
        this.miliSeconds.advance();
        if(this.miliSeconds.value()==0){
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.miliSeconds;
    }

}
