package src.operators_and_statements;

class OperatorPrecedence {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x + x * x + x);
        System.out.println(x += x *= x += x);
        byte b = 0b100;
        System.out.println(~b | b & b);

    }
}
