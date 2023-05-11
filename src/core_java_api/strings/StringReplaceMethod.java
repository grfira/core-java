package src.core_java_api.strings;

class StringReplaceMethod {
    public static void main(String[] args) {

        String str = new String(new char[]{'S', 't', 'r', 'i', 'n', 'g'}).intern();

        System.out.println(str == str.replace('n', 'n'));        //true
        System.out.println(str == str.replace("n", "n"));       //Java 8 => false

        System.out.println(str == str.replace('k', 'k'));
        System.out.println(str == str.replace("k", "k"));

        System.out.println(str == str.replace('r', 'R'));
        System.out.println(str == str.replace("r", "R"));

    }
}
