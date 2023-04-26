package src.operators_and_statements;

class OperatorAssociativity {
    public static void main(String[] args) {

        boolean ba = false, bb = false, bc = false, bd = true;
        System.out.println(ba != bb != bc == bd);                   //left-to-right associativity 1: ba!=bb 2: (ba!=bb)==bc 3: ((ba!=bb)==bc)==bd


        System.out.println(ba = bb = bc = bd);                      //right-to-left associativity 1: bc=bd, 2: bb=(bc=bd), 3:ba=(bb=(bc=bd))
        System.out.println("ba= " + ba + ", bb= " + bb + ", bc= " + bc + ", bd= " + bd);


        long la = 3, lb = 7, lc = 8, ld = 5;
        System.out.println(la -= lb += lc -= ld);                   //right-to-left associativity 1: lc-=ld, 2: lb+=(lc-=ld), 3:la-=(lb+=(lc-=ld))
        System.out.println("la= " + la + ", lb= " + lb + ", lc= " + lc + ", ld= " + ld);


        int ia = 13, ib = 17, ic = 7;
        System.out.println(ia % ib % ic);                           //left-to-right associativity 1: ia%ib 2: (ia%ib)%ic


        double da = 24, db = 8, dc = 4;
        System.out.println(da / db / dc);                           //left-to-right associativity 1: da/db 2: (da/db)/dc
    }
}
