public class Module2part1 {
    public static void main(String[] args) {
        int[] intArrays = {5, 8, -5, 9, 26, 948, 34, -45, -4, -65};
        Double[] doubleArrays = {56.48, 56.954, -56.98, 3.9415, 6.495, 6.158, 648.692, 546.159, -65.2, -15.152};

        System.out.println("sum Int: " + sum(intArrays));
        System.out.println("sum Double: " + sum(doubleArrays));
        System.out.println("min Int: " + min(intArrays));
        System.out.println("min Double: " + min(doubleArrays));
        System.out.println("max Int: " + max(intArrays));
        System.out.println("max Double: " + max(doubleArrays));
        System.out.println("multiplication Int: " + multiplication(intArrays));
        System.out.println("multiplication Double: " + multiplication(doubleArrays));
        System.out.println("module of first Int element: " + modulus(intArrays[0]));
        System.out.println("module of last Int element: " + modulus(intArrays[intArrays.length - 1]));
        System.out.println("module of first Double element: " + modulus(doubleArrays[0]));
        System.out.println("module of last Double element: " + modulus(doubleArrays[doubleArrays.length - 1]));
        System.out.println("second Largest Int: " + secondLargest(intArrays));
        System.out.println("second Largest Double: " + secondLargest(doubleArrays));
    }


    static int sum(int[] intArrays) {
        int sum = 0;
        for (int intArray : intArrays) {
            sum += intArray;
        }
        return sum;
    }


    static Double sum(Double[] doubleArrays) {
        Double sum = 0.0;
        for (Double doubleArray : doubleArrays) {
            sum += doubleArray;
        }
        return sum;
    }


    static int min(int[] intArrays) {
        int min = intArrays[0];
        for (int intArray : intArrays) {
            if (min > intArray) {
                min = intArray;
            }
        }
        return min;
    }


    static Double min(Double[] doubleArrays) {
        Double min = doubleArrays[0];
        for (Double doubleArray : doubleArrays) {
            if (min > doubleArray) {
                min = doubleArray;
            }
        }
        return min;
    }


    static int max(int[] intArrays) {
        int max = intArrays[0];
        for (int intArray : intArrays) {
            if (max < intArray) {
                max = intArray;
            }
        }
        return max;
    }


    static Double max(Double[] doubleArrays) {

        Double max = doubleArrays[0];
        for (Double doubleArray : doubleArrays) {
            if (max < doubleArray) {
                max = doubleArray;
            }
        }
        return max;
    }


    static int maxPositive(int[] intArrays) {
        int maxPositive = 0;
        if (max(intArrays) > 0) {
            maxPositive = max(intArrays);
        }
        return maxPositive;
    }


    static int multiplication(int[] intArrays) {
        int multiplication = intArrays[0];
        for (int intArray : intArrays) {
            multiplication = multiplication * intArray;
        }
        return multiplication;
    }


    static Double multiplication(Double[] doubleArrays) {
        Double multiplication = doubleArrays[0];
        for (double doubleArray : doubleArrays) {
            multiplication = multiplication * doubleArray;
        }
        return multiplication;
    }


     static int modulus(int x) {
        if (x < 0) {
            x = x * -1;
        }
        return x;
    }


    static Double modulus(Double x) {
        if (x < 0) {
            x = x * -1;
        }
        return x;
    }


    static int secondLargest(int[] intArrays) {
        int secondLargest = intArrays[0];
        for (int intArray : intArrays) {
            if ((secondLargest < intArray) && (max(intArrays) != intArray)) {
                secondLargest = intArray;
            }
        }
        return secondLargest;
    }


    static Double secondLargest(Double[] doubleArrays) {
        double secondLargest = doubleArrays[0];
        for (Double doubleArray : doubleArrays) {
            if ((secondLargest < doubleArray) && (max(doubleArrays) != doubleArray)) {
                secondLargest = doubleArray;
            }
        }
        return secondLargest;
    }

}


