import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> a = new ArrayList<String>(); altta da a adında bir arraylist objesi oluşturduk burada da
        List<String> a = new ArrayList<String>();
        //eleman ekleme
        a.add("Java");
        a.add("C++");
        a.add("Pyhton");
        //elemana erişme
        System.out.println(a.get(0));
        for (String b : a) {
            System.out.println(b);
        }
        /*
        Aşağıda Arraylistlerle Linkedlistlerin performans açısından farklılıklarını inceleyeceğiz ve
        hangi durumda hangisini kullanmamız performans açısından daha aiyi olur onu öğreceneceğiz.
         */
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        zamanHesaplar("LinkedList", linkedList);
        zamanHesaplar("ArrayList", arrayList);

       /*
        Set Interface'i aynı Link interface'i gibi Collectiondan extends alıyor bundan dolayı aynı arrayList ve LinkedList
        in ilişkisi gibi bununda direkt Listle benzeyen yapısı methodu çok fazla çünkü ikiside Collectiondan extend ediliyor.
        Peki ne gibi farklılıklar var List interface'i ile Set interface'i arasında
        Set interface'inde bir obje bir kere yaratılabilir.
        Linkde ise aynı objeden birden fazla kez olabilir.
        */
        Set<String> set;
        /*
        HashSet her elemanı hashing yöntemine göre depolar yani Hash table esasına göre her elemanın kendine özgü
        key'i vardır.
        Set interface den dolayı bir elemandan sadece bir tane bulundurur.
        Elementler ekleme sırasına göre sıralanmazlar.
         */
        HashSet<String> hashSet;
        /*
        LinkedHashSet
        Hem Hash Setin hemde Linked Listin özelliklerini barındırır.
        Bir elemanı bir kere depolar.
        Elementleri ekleme sırasına göre depolar.
         */
        LinkedHashSet<String> linkedHashSet;
        /*
        TreeSetler NavigableSet interfaceini implemente eder ve AbstractSet sınıfından extend alır.
        Navigable Set interface'i de SortedSet interfaceinden miras aldığından;
        Elementler alfabetik bir şekilde sıralanır.
        Elementleri depolamak için Tree yani Ağaç yapısını kullanır.
         */
        TreeSet<String> treeSet;


        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();
        set1.add("Java");
        set1.add("Pyhton");
        set1.add("JavaScript");
        set1.add("C#");

        set2.add("Java");
        set2.add("Pyhton");
        set2.add("JavaScript");
        set2.add("C#");

        set3.add("Java");
        set3.add("Pyhton");
        set3.add("JavaScript");
        set3.add("C#");

        for (String s : set1) { //HashSet
            System.out.println(s);
        }
        System.out.println();
        for (String s : set2) { //LinkedHashSet
            System.out.println(s);
        }
        System.out.println();
        for (String s : set3) { //TreeSet
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        //Kümelerin farkını bulmak için removeAll methodu kullanılır.
        HashSet<String> set4 = new HashSet<String>();
        set4.add("Java");
        set4.add("Pyhton");
        set4.add("JavaScript");
        HashSet<String> fark = new HashSet<String>(set1);
        System.out.println(fark.removeAll(set4));
        System.out.println(fark);
        System.out.println();
        //Kümelerin kesişimini bulmak için retainAll methodu kullanılır.
        HashSet<String> kesisim = new HashSet<String>(set1);
        System.out.println(kesisim.retainAll(set4));
        System.out.println(kesisim);
        System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(10, "Java");//Collectionın alt classlarında eleman ekleme .add ile yapılıyordu HashMap collectiona bağlı olmadığı için öyle değil.put ile yapıyoruz
        hashMap.put(30, "Pyhton");//ilk yazdığımız key ikinci yazdığımız value
        hashMap.put(50, "C#");
        hashMap.put(20, "C#");
        System.out.println("----------");
        System.out.println(hashMap);
        hashMap.put(50, "JavaScript");
        System.out.println(hashMap.get(30));
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(100));
        //HashMapte direkt diğerlerinde olduğu gibi for da yazdıramıyoruz EntrySet methodunu kullanmamız gerek.
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Anahtar:" + entry.getKey() + " Değer:" + entry.getValue());
        }
        /*
        HashMap Sınıfı
        Değerleri Key ve Value olarak depolar. Her key'e karşılık olarak gelen bir değer bulunur.
        Bir anahtar sadece bir kez varolabilir.Ancak değer birden fazla olabilir
        Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz.
         */
        Map<Integer, String> hashMap1 = new HashMap<Integer, String>();
        Map<Integer, String> LinkedhashMap1 = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeSet1 = new TreeMap<Integer, String>();
        System.out.println();
        System.out.println("HashMap1");
        mapYazdir(hashMap1); //rastgele sıra ile
        System.out.println("LinkedhashMap1");
        mapYazdir(LinkedhashMap1);//ekleme sırası ile
        System.out.println("TreeSet1");
        mapYazdir(treeSet1);//key sırası ile


    }

    public static void zamanHesaplar(String veriTipi, List<Integer> list) {
        //Zamanı hesaplamak için işlemler yapıyoruz
        long başlangıc;
        long bitis;
        başlangıc = System.currentTimeMillis(); //bu kod çalışırken ki zamanı tutar.
        //Listin sonuna bir sürü değer eklemeye çalışacağız
        for (int i = 0; i < 100; i++) {
            list.add(0, i);
        }
        bitis = System.currentTimeMillis(); //bu kod çalışırken ki zamanı tutar.
        System.out.println(veriTipi + ":" + (bitis - başlangıc) + " kadar sürdü");
    }

    public static void mapYazdir(Map<Integer, String> map) {
        map.put(10, "C++");
        map.put(30, "Java");
        map.put(60, "C#");
        map.put(100, "Pyhton");
        map.put(1, "PHP");
        map.put(35, "JavaScript");


        for(Map.Entry<Integer,String>entry : map.entrySet()){
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }
        for(Integer key : map.keySet()){
            System.out.println("Key:" + key + "Value:" + map.get(key)) ;
        }
    }
}