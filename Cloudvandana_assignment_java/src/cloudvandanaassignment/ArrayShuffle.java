package cloudvandanaassignment;

import java.util.Arrays;
import java.util.Collections;

public class ArrayShuffle {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(array));
        shuffleArray(array);//array shuffling
        System.out.println("Shuffled Array: " + Arrays.toString(array));//here it prints the shuffled array
    }

    public static void shuffleArray(Integer[] array) {
        Collections.shuffle(Arrays.asList(array));
    }
}
