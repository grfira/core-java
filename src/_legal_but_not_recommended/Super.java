package src._legal_but_not_recommended;

class Super extends Object{
    Super Super;
    Super(){ super();Super();}
    void Super(){return;}
}
class This extends Super{
    This This;
    This(){ super();}
    This(This This) {
        this();
        this.This = This;
        super.Super=this.This;
    }
}
