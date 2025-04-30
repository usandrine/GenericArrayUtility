package org.example;
import java.lang.reflect.Array;

public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] array1, T[] array2) {
        // Get the component type of the array
        Class<?> componentType = array1.getClass().getComponentType();

        // Create a new array of the combined length
        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(componentType, array1.length + array2.length);

        // Copy elements from array1
        System.arraycopy(array1, 0, result, 0, array1.length);

        // Copy elements from array2
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }
}
