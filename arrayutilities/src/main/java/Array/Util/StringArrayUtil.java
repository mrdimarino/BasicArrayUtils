package Array.Util;

import java.util.ArrayList;

public class StringArrayUtil {
    public static boolean contains(String[] array, String value) {
        boolean containsValue = false;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)) {
                containsValue = true;

            }
        }
        return containsValue;
    }

    public static String[] reverse(String[] array) {
        String reverseArray[] = new String[array.length];
        int j = 0;
        for (int i = array.length-1; i >=0; i--) {
            String arrayElement = array[i];
            reverseArray[j] = arrayElement;
            j++;
        }
        return reverseArray;
    }

    public static boolean isPalindromic(String[] array) {
        String[] checkReverse = reverse(array);
        boolean isPalindromic = false;
        for (int i = 0; i < array.length; i++) {
            if (checkReverse[i].equals(array[i])) {
                isPalindromic = true;
            } else {
                isPalindromic = false;
            }
        }return isPalindromic;
    }

    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList<String>();
        int i =0;
        while (i<array.length){
            if (array[i].equals(valueToRemove)){
                i++;
            }else{
                newArray.add(array[i]);
                i++;
            }

        }
        int size = newArray.size();
        String newArray2[] = new String[size];
        newArray.toArray(newArray2);
        return newArray2;
    }
}
