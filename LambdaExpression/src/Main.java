import java.util.ArrayList;
import java.util.List;

interface Drawable{
    public void draw();
}
interface Sayable{
    public String say(String name);
}
interface Addable{
    int add(int a,int b);
}
public class Main {
    public static void main(String[] args) {

        /*
        Lambda expressionlar temelde fonksiyonel programlamayı sağlamak için Java8 de eklenmiştir Javaya
        Bir diğer önemli özelliği ise kod yazarken kısa bir kod yazmamıza çok olanak sağlar.
        Lambda expressionları kullanırken interface oluşturmalıyız bir tane ve interfaceden oluşturduğumuz
        objeye kullanabiliriz
        (argument-list) -> { lambda expressionlar bu şekilde tanımlanır iki süslü parantez içerisi
        body kısmıdır
        }
         (p1)-> {
            tek parametreli lambda expression
        }
        (p1,p2)-> {
            iki parametreli lambda expression
        }
        Lambda expressionları kullanırken interface oluşturmalıyız bir tane ve interfaceden oluşturduğumuz
        objeye kullanabiliriz

        */
       /* Drawable d1 = new Drawable() {
            @Override
            public void draw() {

            }
        };*/
        int width =10;

        Drawable d1 =()->{
            System.out.println("Drawing:"+width);
        };
        d1.draw();
        Sayable s = (name)-> { //obje üretirken kullanırız ve blok açarak ne yapacağını söyleriz
            //sonrasında da o objeden methodu kullanırız
            return "Hello," + name;
        };
        Sayable s1= name->{
            return "Hello," + name;
        };
        System.out.println(s.say("Esraaaa"));
        System.out.println(s1.say("Eneeeeess"));

        Addable ad1= (a,b) -> (a+b); //interfacedeki parametreleri alır direkt
        System.out.println(ad1.add(10,20));

        Addable ad2 = (int a,int b)->(a+b); //özel olarak tipini belirttik
        System.out.println(ad2.add(100,200));

        Addable ad3 = (int a,int b) ->{//return lü yapmak istersek kod bloğu şeklinde yapmamız gerek.
            return (a+b);
        };
        System.out.println(ad3.add(300,800));
        //Lambda expressionlar ile forEach döngüsünü daha kolay bir şekilde yapabiliriz
        List<String> list = new ArrayList<String>();
        list.add("Esra");
        list.add("Enes");
        list.add("Fatma");
        list.add("Tekin");
        list.add("Nisa");
        list.forEach(  //forEach diye bir method var listlerde onu kullandık ve methodun içine n diye bir parametre verdik bu
                //listeyi dolanıcak ve yazdırıcak
                (n)-> System.out.println(n)
        );
        Sayable person = (message)->{
            String str1="I would like to say,";
            String str2 = str1+message;
            return str2;

        };
        System.out.println(person.say("time is precious"));


    }
}