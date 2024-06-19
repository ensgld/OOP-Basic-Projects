
public class Main {
    static int sumLoop(int n){
        if(n>0){
            return n+ sumLoop(n-1);

        }
        else{
            return 0;

        }
    }
    static int sumLoop(int i,int n){
        if(i<=n){
            return i+sumLoop(i+1,n);
        }
        
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumLoop(10));
        System.out.println(sumLoop(8,9));


    }
}