package src.core_java_api.arrays;

import java.util.ArrayList;
import java.util.List;

class BooleanArray {

    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(null);
        list.add(false);
        list.add(null);
        System.out.println(list.remove(null) + " " + list.remove(0) + " " + list.remove(0));
    }
}
