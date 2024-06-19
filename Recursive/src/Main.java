
public class Main {

    public static int getReverse(int a) {
        int reverse = 0;
        while (a > 0) {
            reverse = (reverse * 10) + (a%10);
            a/=10;
        }
        return reverse;

    }

    public static long factorial(long n) {
        long f = 1;
        for (long i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static long factorialWithRecursion(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialWithRecursion(n - 1);
        }

    }


    public static int f(int x) {
        if (x == 10) {
            return 10;
        }
        System.out.println("x:" + x);
        return x + f(x + 1);
    /*
    f(0): 0 + f(1)
    f(1): 1 + f(2)
    f(2): 2 + f(3)
    ...
    f(8): 8 + f(9)    f(8)= 27 çünkü f(9)u bulduk ve sonrasında ekledik.
    f(9): 9 + f(10)   buradan f(10) u bildiğimiz için bitiyor f(9)'u da öğreniyoruz. f(9)=19

     */
    }

    public static void loop(int i, int n) {
        if (i <= n) {
            System.out.println(i);
            loop(i + 1, n);
        }
    }

    public static int fib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        int a =123456798;
        System.out.println("İs Palindromic: " + (getReverse(a)==a));
        System.out.println(factorialWithRecursion(4));
        System.out.println(factorial(3));
        loop(1, 15);


        /*
        Normalde fibonacciyi nasıl yapıyoruz bir for döngüsünde yapıyoruz
        Ve şöyle bir deyim vardır her döngü bir recursive fonksiyon olarak yazılabilir
        Her ecursive fonksiyon da bir döngü olarak yazılabilir.
         int toplam = 0;
        for (int i = 0; i < 10; i++) {
            toplam += i + 1;
            System.out.println("Toplam=" + toplam + " ve " + "i=" + i);
        }
        System.out.println("Sonuç:" + toplam);
         */
        System.out.println("f(0):" + f(0));
        for (int i = 0; i <= 10; i++) {
            System.out.println("n=" + i + " için fiboncacci:" + fib(i));
        }

    }
}