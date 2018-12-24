package Array.Util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntegerArrayUtil {

    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i ++){
            sum = intArray[i] + sum;
        }
        return sum;
    }

    public static Double getAverage(Integer[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i ++){
            sum = intArray[i]  + sum;
        }
        double average = sum/intArray.length;
        return average;
    }

    public static Integer getMax(Integer[] intArray) {
        int max = intArray[0];
        for(int i=1;i < intArray.length;i++){
            if(intArray[i] > max){
                max = intArray[i];
            }
        }
        return max;
    }

    public Integer[] merge(Integer[] array1, Integer[] array2){
        int count = 0;
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        for(int i = 0; i<array1.length; i++) {
            mergedArray[i] = array1[i];
            count++;
        }
        for(int j = 0; j < array2.length; j++) {
            mergedArray[count] = array2[j];
            count++;
        }

        return mergedArray;
    }

    public Integer mostCommon(Integer[] array){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++){
            if(hm.containsKey(array[i])){
               hm.put(array[i],hm.get(array[i])+1);
            }else if (!hm.containsKey(array[i])){
                hm.put(array[i], 1);
            }
        }

        Integer element = 0;
        int frequency = 1;

        Set<Map.Entry<Integer, Integer>> entrySet = hm.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() > frequency){
                element = entry.getKey();
                frequency = entry.getValue();
            }
        }
        return element;
    }




}
