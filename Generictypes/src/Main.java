import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

class veriTipi {
    int id;
    String isim;
}

class calisan<T> {
    T maas; /*maaşın tipi bazen farklı şeyler olabilir kullanıcıdan kullanıcıya double olabilir tam sayı olabilir.
    başka bir değere bağlı olarak değişen oran olabilir. Yani veri tipi tam olarak belli değil
    *****Bu yüzden classın hemen yanındaki gibi kendimiz bir tip tanımlayabiliriz <T> diye maaşı
    da o tipte tanımlayabiliriz
    Bu bizim bu classtan bir obje yarattığımızda istediğimiz gibi bu belli olmayan tipi belirtmemize olanak sağlar.
    42.satırda kullandık bu özelliği
    */

    String isim; // isim belli zaten tipi her türlü String olucak yani başka pek ihtimal yok.
}


public class Main {
    public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni) {
        /*
        sıralı bir şekilde eklemek için parametre olarak verdiğimiz String yeni ile kıyaslayıp ondan
        büyük ise next diyip sonrasına ekleyecek
         */
        ListIterator<String> iterator = gidilecekYerler.listIterator();
        while (iterator.hasNext()) {
            int karsılastirma = iterator.next().compareTo(yeni); //burada iterator'un tuttuğu değer ile bizim yeni değerimizi karşılaştırıyoruz
            if (karsılastirma == 0) {
                System.out.println("Listemizde bu eleman mevcut.");
                return;
            } else if (karsılastirma > 0) {
                iterator.previous();
                iterator.add(yeni);

                return;
            } else if (karsılastirma<0) {
                
            }
            System.out.println(iterator.next());
        }
        iterator.add(yeni);
    }

    public static void listeyiBastir(LinkedList<String> gidilecekYerler) {
      /*  for (String j : gidilecekYerler) {
            System.out.println(j);
        }  bu şekilde forEach kullanarak da bastırabiliriz ama complex işlemler yapmak istiyorsak ListIterator
        kullanmamız gerekir*/
        ListIterator<String> iterator = gidilecekYerler.listIterator();
        //ListIterator'ı bu şekilde tanımlıyoruz. Bu Iterator kullanımı biraz değişik referans numarasını ele alır
        //ve next methodu ile diğer elemana geçer hasNext ile sonrasında bir eleman var mı yok mu onu kontrol eder
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void main(String[] args) {
        //ArrayList a = new ArrayList();array listler böyle tanımlanır fakat bu şekilde tanımlanınca array listin hangi tipte değer alacağı belirtilmemiştir.
        ArrayList<String> a = new ArrayList<String>();//bir string değer alan array list tanımladık <String> kullanımı Array list'in bir string değer alan array list olduğunu belirtir.
        String s1 = "Bilgisayar Mühendisliği";
        String s2 = "Enes Geldi";
        a.add(s1); //burada ise array listin içine String referanslarımızı kayıt ettik.
        a.add(s2);
        ArrayList<Integer> b = new ArrayList<Integer>(); // b adında Integer Array Listi tanımladık
        b.add(12); //integer arraylistimizin içine integer bir değer kaydettik
        /*
        Eğer istersek kendi istediğimiz classa ait bir array list oluşturabiliriz aslında aynı mantık
        çünkü integer da string de bir class ve Array Listi tanımlarken o classlardan oluşturduğumuzu belirtiyoruz.
        Aşağıda kendi oluşturduğum classtan bir Array list oluşturucam
        */
        ArrayList<veriTipi> c = new ArrayList<veriTipi>();
        veriTipi vt = new veriTipi();//veriTipi classında bir obje oluşturduk.
        vt.id = 10;
        vt.isim = "Esra";
        c.add(vt);//c arrayine vt objesini kaydetmiş olduk
        /*
        Bir diğer husus ise generic tiplerde: Classında bir tipi olabilir. bunu çalışan classında anlattım.
         */
        calisan<Double> ali = new calisan<Double>();// bu kullanım bizim tanımladığımız generic tipin Double olduğunu belirtir ali objesi için
        calisan<Integer> veli = new calisan<>();
        ArrayList<String> e = new ArrayList<>();
        e.add("Enes");
        e.add("Tekin");
        e.add("Fatma");
        e.add("Nisanur");
        e.add("Esra");
        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i));
        }
        System.out.println();
        for (String s : e) {
            System.out.println(s);
        }
        
        System.out.println("--------------------------------------");
        e.add(1, "Resul");
        System.out.println(e.get(1));
        System.out.println();
        LinkedList<String> gidilecekYerler = new LinkedList<String>();
        gidilecekYerler.add("Ankara");
        gidilecekYerler.add("Karabük");
        gidilecekYerler.add("Karaman");
        gidilecekYerler.add("Darari");
        gidilecekYerler.add("Buneos Aires");
        gidilecekYerler.add("Miami");

        listeyiBastir(gidilecekYerler);
        System.out.println("--------------------------------------");
        gidilecekYerler.add(4, "Boston");
        listeyiBastir(gidilecekYerler);
        System.out.println("--------------------------------------");
        gidilecekYerler.remove(5);
        listeyiBastir(gidilecekYerler);
        System.out.println("--------------------------------------");
        siraliEkle(gidilecekYerler,"Ankara");
        siraliEkle(gidilecekYerler,"Eskişehir");
        siraliEkle(gidilecekYerler,"Kayseri");
    }
}