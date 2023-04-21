package src.core_java_api.strings;

class StringManipulation {
    public static void main(String[] args) {

        String a = "a";
        a += 'b';
        a.concat("c");

        StringBuilder sb = new StringBuilder(a);
        sb.append("def").insert(sb.length(), "g");
        sb.substring(3);

        System.out.println(sb);
    }
}
