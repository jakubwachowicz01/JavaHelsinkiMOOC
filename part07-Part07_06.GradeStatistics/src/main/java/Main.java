
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops:");
        while(true){

            int input = Integer.valueOf(scanner.nextLine());
            if(input==-1) break;
            if(input<0 || input>100){
                continue;
            }
            points.add(input);

        }
        System.out.println("Point average (all): " + average(points));
        if(averagePassing(points)==0){
            System.out.println("Points average(passing): -");
        }else{
            System.out.println("Points average(passing): " + averagePassing(points));
        }
        System.out.println("Pass percentage: " + 100.0*numberOfPassing(points)/points.size());
        gradeDistribution(points);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }

    public static double average(ArrayList<Integer> array){
        int sum = 0;
        for (Integer points:array
             ) {
            sum+=points;
        }
        double average = 1.0*sum/array.size();
        return average;
    }

    public static int numberOfPassing(ArrayList<Integer> array){
        int number = 0;
        for (Integer points:array
        ) {
            if(points>=50){
                number++;
            }

        }
        return number;
    }
    public static double averagePassing(ArrayList<Integer> array){
        int sum = 0;
        int size=numberOfPassing(array);
        for (Integer points:array
        ) {
            if(points>=50){
                sum+=points;
            }

        }
        double average = 1.0*sum/size;
        return average;
    }
    public static void gradeDistribution(ArrayList<Integer> points){
        int[]grades = {0, 0, 0, 0, 0,0};

        for (Integer point:points
             ) {
                if(point<0||point>100) continue;
                if(point<50){
                    grades[0]++;
                } else if (point<60) {
                    grades[1]++;
                }else if (point<70) {
                    grades[2]++;
                }else if (point<80) {
                    grades[3]++;
                }else if (point<90) {
                    grades[4]++;
                }else{
                    grades[5]++;
                }
        }
        System.out.println("Grade distribution:");
        for(int i = 5;i>=0;i--){
            System.out.print(i+": ");
            for(int j = grades[i]; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
