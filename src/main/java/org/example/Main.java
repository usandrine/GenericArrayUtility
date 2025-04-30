package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] nums1 = {1, 2, 3};
        Integer[] nums2 = {4, 5, 6};
        Integer[] mergedNums = GenericArrayUtility.mergeArrays(nums1, nums2);
        System.out.println("Merged Integers: " + Arrays.toString(mergedNums));


        String[] words1 = {"Hello", "World"};
        String[] words2 = {"Java", "Generics"};
        String[] mergedWords = GenericArrayUtility.mergeArrays(words1, words2);
        System.out.println("Merged Strings: " + Arrays.toString(mergedWords));
    }
}
