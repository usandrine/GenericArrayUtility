package org.example;
import java.lang.reflect.Array;

public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] array1, T[] array2) {

        Class<?> componentType = array1.getClass().getComponentType();


        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(componentType, array1.length + array2.length);

        System.arraycopy(array1, 0, result, 0, array1.length);


        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }
}
