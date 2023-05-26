package src.operators_and_statements;

class OperatorPrecedence {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x + x * x + x);
        x = 5;
        System.out.println(x += x *= x += x);
    }
}
