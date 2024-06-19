import java.util.*;

class BüyüktenKüçüğeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2); //büyükten küçüğe ise - koyuyoruz
    }
}

class BuyuktenKucugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() > o2.getId()) {
            return -1;
        } else if (o1.getId() < o2.getId()) {
            return 1;

        }
        return 0;
    }
}

class KucuktenBuyugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return 1;

        }
        return 0;
    }
}

class Player implements Comparable<Player> {
    private int id;
    private String isim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return id == player.id && Objects.equals(isim, player.isim);
    }
    /*
    equals() ve hashcCode()methodlarını mapleri kıyaslamak için kullanırız map'ler Collection classına ait
    olmadığı için bunlarda kıyaslamaları Collections.sort()methodu ile yapamayız maplerde compareTo falan da
    kullanılmaz.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;
        } else if (this.id > player.id) {
            return 1;
        }
            return 0;

    }

    @Override
    public String toString() {
        return "İsim:" + isim + "----" + " ID:" + id;
    }
}

public class Main {
    public static void main(String[] args) {
        //Java Collectionun devam konusu olan Comparable ve Comparatorlleri öğreneceğiz.
        ArrayList<String> listString = new ArrayList<String>();
        listString.add("Java");
        listString.add("C++");
        listString.add("JavaSpring");
        listString.add("C");
        listString.add("Pyhton");
        //biz bunları sıralı bir şekilde bastırmak istediğimizde Collections daki sort methodunu kullanabiliriz
        Collections.sort(listString);
        for (String s : listString) {
            System.out.println(s);
        }
        List<Player> listPlayer = new ArrayList<Player>();

        listPlayer.add(new Player("Enes", 10));
        listPlayer.add(new Player("Emre", 20));
        listPlayer.add(new Player("Arda", 5));
        Collections.sort(listPlayer);
        Player p10 = new Player("Ahmet", 76);

        listPlayer.add(p10);
        /*işte bizim oluşturduğumuz bir classta Collections.sort methodunu direkt kullanamayız
        bunları karşılaştırablmemiz için oluşturduğumuz classın Comparable interfaceini
        implemente edebilmesi gerekiyor. İmplemente ettiği için de classımızda compareTo() methodunu
        override etmemiz gerekiyor.
        */
        Player p1 = new Player("Ahmet", 76);
        Player p2 = new Player("Samet", 78);
        System.out.println(p1.compareTo(p2)); //-1 basıcak çünkü p1'in id'si p2den küçük
        System.out.println();
        for (Player player : listPlayer) {
            System.out.println(player);
        }
        //Collections.sort(); methodunun bir kullanımı dahava vardır.
        Collections.sort(listString, new BüyüktenKüçüğeString());
        Collections.sort(listPlayer, new KucuktenBuyugePlayer());


    }
}