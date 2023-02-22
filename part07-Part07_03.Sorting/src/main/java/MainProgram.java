import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }


    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array
        ) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int index = startIndex;
        for(int i = startIndex; i< array.length;i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int helpValue = array[index1];
        array[index1]=array[index2];
        array[index2]=helpValue;
    }

    public static void sort(int[] array){
        for(int i = 0; i< array.length;i++){
            System.out.println(Arrays.toString(array));
            int indexOfSmallest = indexOfSmallestFrom(array,i);
            swap(array,i,indexOfSmallest);
        }
    }
}

