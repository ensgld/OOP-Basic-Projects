// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static class A {

    }
    static class B extends A{

    }
    static class C extends B{

    }
    class D{

    }
    public static void main(String[] args) {
        String s1= "Java";
        String s2= "C++";
        String s3= new String("Java");
        System.out.println(s1==s3); //memoryde tuttukları yer aynı mı diye bakıyor böyle yapınca
        System.out.println(s1.equals(s3));//equals methodunu kullanırken de içeriğine bakıyor
        System.out.println(s1.getClass());//class java.lang.String
        System.out.println(s1.getClass().getSuperclass()); //class java.lang.Object
        /*
        s1 değişkeni bir string değişkeni olduğundan bunun classını öğrenmek istersek
        bize String classı diyecektir. Stringin bir üst classını yani superClassını
        öğrenmek istersek bize Object classını işaret edeceketir çünkü javada en ata class
        Object classıdır ve String classının üstünde de Object classı vardır.
         */
        int []arr={1,3,5};
        System.out.println(arr.getClass()); //class [I
        System.out.println(arr.getClass().getSuperclass());//class java.lang.Object
        Object objects [] = {"Java",new int[]{1,3,5},new Person("Enes","Geldi"),new Student("Nisanur","Geldi",1560)};
        /*
        Object javada bütün classların ata classı olduğu için hem array hem string hem kendi oluşturduğumuz classları aynı anda Object arrayine girebildik.
         */
        for(Object obj :objects){
            System.out.println(obj.toString());
            Student p1= new Student("Enes","Geldi",123);
            Student p2= new Student("Enes","Geldi",123);
            System.out.println(p1==p2); //false
            System.out.println(p1.equals(p2)); //falsetu ama equals methodunu override ettikten sonra true oldu
        }
        Student p1= new Student("Enes","Geldi",123);
        Student p2= new Student("Enes","Geldi",123);
        System.out.println(p1.hashCode()); //  overriden önce:1706234378 override dan sonra:70850431
        System.out.println(p2.hashCode()); //  overriden önce:1867750575 override dan sonra:70850431
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println(a instanceof A); /*instanceof operatörü, Java'da bir nesnenin belirli bir türün bir örneği olup olmadığını kontrol etmek için
        kullanılır. Bu operatör, bir nesnenin bir sınıfa veya arabirim türüne ait olup olmadığını kontrol etmek için kullanılır ve sonuç olarak true veya false değeri döndürür.
        */
        System.out.println(b instanceof A);
        System.out.println(c instanceof A);
        System.out.println(a instanceof Object);
        System.out.println(a instanceof B);
        System.out.println(c instanceof B);






    }
}