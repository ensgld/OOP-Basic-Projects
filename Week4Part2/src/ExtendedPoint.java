public class ExtendedPoint extends Point{
    final String explanation;
    ExtendedPoint(int x,int y,String explanation){
        super(x,y);
        this.explanation=explanation;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        else if(obj instanceof ExtendedPoint){
            ExtendedPoint pts=(ExtendedPoint) obj;
            return super.equals(pts) && this.explanation.equals(pts);
        }
        else return false;

    }

}
