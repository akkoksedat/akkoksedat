package org.example.Ders14;

import java.util.Arrays;
import java.util.Optional;

public class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenericClass<Integer> intInstance = new GenericClass<>(123);
        intInstance.printValue();

        GenericClass<String> stringInstance = new GenericClass<>("Hello");
        stringInstance.printValue();

        GenericClass<Double> doubleInstance = new GenericClass<>(45.67);
        doubleInstance.printValue();

        // Array search examples
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println(findElement(intArray, 3)); // Output: 3
        System.out.println(findElement(intArray, 6)); // Output: -1

        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println(findElement(strArray, "banana")); // Output: banana
        System.out.println(findElement(strArray, "orange")); // Output: -1
    }

    public static <T> Object findElement(T[] array, T element) {
        Optional<T> result = Arrays.stream(array)
                .filter(e -> e.equals(element))
                .findFirst();
        return result.orElse((T) new Integer(-1));
    }
}
