package Arrays;

import java.util.*;

public class ArrayListBasic {
    public static void main(String[] args) {

        //Declaration and Initialization
        ArrayList<Integer> arrList = new ArrayList<>();

        //Adding elements in arraylist
        arrList.add(10); //[10]

        //Adding element at a particular index
        arrList.add(0,20); //[20, 10]

        //Change element at a particular index
        arrList.set(0, 5); //[5,10]

        //Remove element by index
        arrList.remove(1); //[5]

        //Remove element by object
        arrList.remove((Integer) 5); //[]

        //Converting Array to ArrayList
        List<Integer> listConvert = new ArrayList<>();
        Integer[] intArr = new Integer[]{5,10,20,30,40};
        listConvert = Arrays.asList(intArr);

        //Converting ArrayList to Array
        //Type 1
        Object[] objs = listConvert.toArray();
        for(Object obj : objs) {
            Integer value = (Integer) obj;
            System.out.println(value);
        }

        //Type 2
        Integer[] convertArr = new Integer[listConvert.size()];
        convertArr = listConvert.toArray(convertArr);
        for(Integer value : convertArr) {
            System.out.println(value);
        }

        arrList.add(5);
        arrList.add(30);
        //To check if it is empty
        System.out.println(arrList.isEmpty()); //returns true/false

        //To find the index of particular element/the first occurence of element
        System.out.println(arrList.indexOf(5)); //returns the index if found or -1;

        //to find the last occurrence of particular element
        System.out.println(arrList.lastIndexOf(5)); //returns the lastIndex if found or -1;

        //to check if element is present in the array
        System.out.println(arrList.contains(5)); //returns true/false

        //Sort
        Collections.sort(arrList);

        //Reverse
        Collections.reverse(arrList);

        //To Clear all the elements from the arraylist
        arrList.clear(); //[]
    }
}
