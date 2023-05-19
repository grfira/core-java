package src.operators_and_statements;

class OverloadedOperators {

    public static void main(String[] args) {
        System.out.println(1+2+""+5);                   //35
        System.out.println(1+2+'7'+'\u0039'+1+2);       //118       '7'=55=\u0037 '9'=57=\u0039
        System.out.println(1+2+'7'+"9"+1+2);            //58912
        System.out.println(1+2+"7"+'9'+1+2);            //37912
        System.out.println(1+2+'7'+1+2+"c");            //61c
        System.out.println('a'*'b');                    //9506      'a'=97=\u0061  'b'=98=\u0062
        System.out.println('a'^'b');                    //3         'a'=97=\u0061  'b'=98=\u0062
        System.out.println('a'|'b');                    //99        'a'=97=\u0061  'b'=98=\u0062
        System.out.println('a'&'b');                    //96        'a'=97=\u0061  'b'=98=\u0062
        System.out.println(~'a');                       //-98       'a'=97=\u0061  'b'=98=\u0062
        System.out.println('\u0062');                   //b

    }
}
