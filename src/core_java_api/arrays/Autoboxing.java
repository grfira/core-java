package src.core_java_api.arrays;

import java.util.ArrayList;
import java.util.List;

class Autoboxing {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Integer int1 = 1, int3 = 3;
        int int2 = 2, int4 = 4;
        list.add(int1);
        list.add(int2);
        list.add(int3);
        list.add(int4);
        list.remove(int3);
        list.remove(int2);
        System.out.println(list);
    }

}
