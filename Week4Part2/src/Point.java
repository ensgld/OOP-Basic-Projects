public class Point {
    final int x;
    final int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString (){
        return "P("+ x+ ","+ y + ")";
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;}

            else if(obj instanceof Point) {
                Point pts = (Point) obj;
                return this.x== pts.x && this.y== pts.y;
            }
            else{
                return false;

        }
        }
    }

