package src.core_java_api.arrays;

class RaggedArray {
    public static void main(String[] args) {


        int[][] array1 = {{1, 2}, {}, {3, 4, 5}, {}, {6, 7, 8, 9}, {0}};

        int[][] array2 = new int[6][];
        array2[0] = new int[]{1, 2};
        array2[1] = new int[]{};
        array2[2] = new int[]{3, 4, 5};
        array2[3] = new int[0];
        array2[4] = new int[]{6, 7, 8, 9};
        array2[5] = new int[1];


        print(array1);
        print(array2);


    }

    private static void print(int[][] array) {
        for (int[] numbers : array) {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
