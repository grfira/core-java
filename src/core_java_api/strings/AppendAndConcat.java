package src.core_java_api.strings;

class AppendAndConcat {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("A");
        System.out.println(sb.append(sb.append("B").append("C")));

        String str = new String("A");
        System.out.println(str.concat(str.concat("B").concat("C")));
    }
}
