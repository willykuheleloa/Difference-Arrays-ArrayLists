import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // Array example
        String[] colorsArray = new String[2];
        colorsArray[0] = "Red";
        colorsArray[1] = "Blue";

        // ArrayList example
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Green");

        System.out.println("Array: " + Arrays.toString(colorsArray));
        System.out.println("ArrayList: " + colorsList);
    }
}
