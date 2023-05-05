package src.java_building_blocks.names_of_members;

class Names {
    byte $1M = 0b1_000_000;
    short _1k$ = 01_000;
    int $1G =1_000_000_000;
    long _$1T = 0x1_000_000_000_000L;
    void ___ (){}
    void _$_(){
        ___();
        System.out.println($1M  +"  "+_1k$+"  "+$1G+"  "+_$1T);
    }

    public static void main(String[] args) {
        new Names()._$_();
    }
}
