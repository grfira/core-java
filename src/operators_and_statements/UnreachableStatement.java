package src.operators_and_statements;

class UnreachableStatement {
    public static void main(String[] args) {

        if(false) System.out.println("if(false)");                  //unreachable statement, but legal
        //while(false) System.out.println("while(false)");          //unreachable statement, does not compile
        //for(;false;) System.out.println("for(;false;)");          //unreachable statement, does not compile

        //while(true); System.out.println("if(true)");              //unreachable statement, does not compile
        //for(;;); System.out.println("for");                       //unreachable statement, does not compile

        // return; System.out.println("unreachable after return;"); //unreachable statement, does not compile
    }
}
