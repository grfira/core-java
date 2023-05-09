package src.core_java_api.arrays;

class BooleanArrays {

    public static void main(String[] args) {

        boolean[] arrayA = new boolean[]{false};
        Boolean[] arrayB = new Boolean[]{Boolean.valueOf(null)};

        System.out.println(arrayA[0] == arrayB[0]);
    }
}
