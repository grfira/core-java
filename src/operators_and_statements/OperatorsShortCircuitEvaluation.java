package src.operators_and_statements;

class OperatorsShortCircuitEvaluation {
    public static void main(String[] args) {

        int b=15;
        if(b==15||b++<1);
        System.out.println(b);

        int c=25;
        if(c==25|c++<1);
        System.out.println(c);

        int d=35;
        if(d!=35&&d++<1);
        System.out.println(d);

        int e=45;
        if(e!=45&e++<1);
        System.out.println(e);

    }
}
