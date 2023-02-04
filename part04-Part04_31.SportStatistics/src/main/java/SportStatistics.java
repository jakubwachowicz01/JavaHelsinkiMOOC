
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        String homeTeam;
        String visitTeam;
        int homePoints;
        int visitingPoints;
        int games=0;
        int wins=0;
        int loses=0;

        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] pieces = line.split(",");
                homeTeam = pieces[0];
                visitTeam = pieces[1];
                homePoints = Integer.valueOf(pieces[2]);
                visitingPoints = Integer.valueOf(pieces[3]);
                if(homeTeam.equals(team)){
                    games++;
                    if(homePoints>visitingPoints){
                        wins++;
                    }else if(homePoints<visitingPoints){
                        loses++;
                    }
                }
                if(visitTeam.equals(team)){
                    games++;
                    if(homePoints>visitingPoints){
                        loses++;
                    }else if(homePoints<visitingPoints){
                        wins++;
                    }
                }
            }
        }
        System.out.println("Games: " + games +"\nWins: " + wins + "\nLosses: " + loses);


    }

}
