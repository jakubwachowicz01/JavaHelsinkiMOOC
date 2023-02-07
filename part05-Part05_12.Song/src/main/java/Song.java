
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared){
        if(this==compared) return true;
        if(!(compared instanceof Song)){

            return false;
        }
        Song anotherSong = (Song) compared;
        if(
                this.artist.equals(anotherSong.artist) &&
                        this.name.equals(anotherSong.name) &&
                        this.durationInSeconds == anotherSong.durationInSeconds
        ){
            return true;
        }else{
            return false;
        }
    }
}
