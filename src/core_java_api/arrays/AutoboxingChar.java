package src.core_java_api.arrays;

import java.util.ArrayList;
import java.util.List;

class AutoboxingChar {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');

        if (list.contains('A')) list.remove('A');        //throws runtime exception, 'A' =65
        if (list.contains('A')) list.remove((Character) 'A');        //ok
    }
}
