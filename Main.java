package academy.learnprogramming.binarysearch;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {5, 9, 12, 17, 20, 35, 55};

        System.out.println(binarySearch(intArray, 9));
        System.out.println(binarySearch(intArray, 35));
        System.out.println(binarySearch(intArray, 25));
        System.out.println(binarySearch(intArray, 17));


    }

    public static int binarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }

        return -1;
    }

}
