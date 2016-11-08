package Module6;

public final class ArraysUtils {
//

    public static int sum(int[] intArrays) {
        int sum = 0;
        for (int intArray : intArrays) {
            sum += intArray;
        }
        return sum;
    }


    public static int min(int[] intArrays) {
        int min = intArrays[0];
        for (int intArray : intArrays) {
            if (min > intArray) {
                min = intArray;
            }
        }
        return min;
    }


    public static int max(int[] intArrays) {
        int max = intArrays[0];
        for (int intArray : intArrays) {
            if (max < intArray) {
                max = intArray;
            }
        }
        return max;
    }


    public static int maxPositive(int[] intArrays) {
        int maxPositive = 0;
        if (max(intArrays) > 0) {
            maxPositive = max(intArrays);
        }
        return maxPositive;
    }


    public static int multiplication(int[] intArrays) {
        int multiplication = intArrays[0];
        for (int intArray : intArrays) {
            multiplication = multiplication * intArray;
        }
        return multiplication;
    }


    public static int modulus(int x) {
        if (x < 0) {
            x = x * -1;
        }
        return x;
    }


    public static int secondLargest(int[] intArrays) {
        int secondLargest = intArrays[0];
        for (int intArray : intArrays) {
            if ((secondLargest < intArray) && (max(intArrays) != intArray)) {
                secondLargest = intArray;
            }
        }
        return secondLargest;
    }


    //int[] reverse(int[] array)
    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0, k = array.length - 1; i < array.length; i++, k--) {
            reverse[i] = array[k];
        }
        return reverse;
    }

    // int[] findEvenElements(int[] array)
    public static int[] findEvenElements(int[] array) {
        int[] findEvenElements;
        int k = 0;
        for (int y : array) {
            if (y % 2 == 0) {
                k++;
            }
        }
        findEvenElements = new int[k];

        int i = 0;
        for (int y : array) {
            if (y % 2 == 0) {
                findEvenElements[i] = y;
                i++;
            }
        }
        return findEvenElements;
    }
}