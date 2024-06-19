class OuterClass{
    class InnerClass{
        /*buradaki kullanımda olduğu gibi bir dış class söz konusu bir de iç class
         Ne tarz durumlarda karşımıza çıkabilir bunu konuşalım.Object oriented dünyada bazı şeyler
         varlığı bir başka şeye bağlıdır mesela. Bir bina düşünün ve bu binanın içinde odalar var
         odaların olması için binanın olması gerekir
         Burada odanın varlığı başka bir varlığa yani binaya bağlı olmuş oldu.
         Inner classların ilişkisini inheritance ilişkisi ile karıştırmayalım inheritance da bir classın
         diğer bir classtan özelliklerini miras almasıdır.
         Burada ise onun var olabilmesi için diğer classın olması gerekmektedir.bina oda örneği güzel bir örnek
         İnheritance ilişkisi olmadığını da şöyle açıklayalım.Mesela bir okulda çalışan olarak müdür var
         ve bu mudur bütün default çalışanlarla aynı özelliklere sahip olacağı ve üstüne kendi özellikleri olacağından
         dolayı tek başına varlığını devam ettirebilir ama ortak birçok özelliği olduğu için miras alma deniyor buna.
          */
         /*
         Local Classlar da aslında inner classlarla aynıdır ufak farklılıkları vardır mesela
         bir döngüde bir methodda tanımlanırlar kullanılrlar ve kullanıldıktan sonrada yok olurlar
          */
        /*
        Anonymus class ise yine bir inner classtır ama classın ismi yoktur. Ve sadece bir obje oluştururuz
        o classtan çünkü daha fazla obje oluşturamayız.Çünkü ismi olmadığı için erişim sağlayamayız
        eğer oluşturmak istersek inner classa çevirmek ve isim vermek gerekir.
        KULLANIM ÖRNEĞİ:
         HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
            Burada HelloWorld adlı bir classtan frenchGreeting diye bir obje oluşturmuşuz ama bu objeyi
            anonymus class yapısı ile içini doldurmuşuz name ile de yapabilirdik class oluşturmak yerine bu da bir seçenek tabi
            override de etmişiz greet methodunu mesela bu da mümkün tabii.

        };

         */

    }
}
public class Main {
    public static void main(String[] args) {

 /*
Nested class kavramı aslına bakarsak bir classın içersinde başka bir class tanımlamaktır.
*/
    }
}