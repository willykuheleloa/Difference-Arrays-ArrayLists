import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // demonstration with an array
        String[] fruitsArray = new String[3]; // Array with fixed size
        fruitsArray[0] = "Apple";
        fruitsArray[1] = "Banana";
        // adding more than 3 elements requires creating a new array

        // uncomment below to see error
        // fruitsArray[3] = "Mango"; // Causes ArrayIndexOutOfBoundsException 

        System.out.println("Array of Fruits: " + Arrays.toString(fruitsArray));

        // demonstration with an ArrayList
        ArrayList<String> fruitsList = new ArrayList<>(); 
        //adding to dynamic array
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry"); 
        fruitsList.add("Mango"); 

        // removing element from array
        fruitsList.remove("Cherry");

        System.out.println("ArrayList of Fruits: " + fruitsList);
    }
}
