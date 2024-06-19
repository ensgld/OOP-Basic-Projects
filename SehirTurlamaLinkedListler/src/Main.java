import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void islemBastir() {
        System.out.println("0- İşlemleri Görüntüle....");
        System.out.println("1- Sonraki şehri görüntüle....");
        System.out.println("2- Önceki şehri Görüntüle....");
        System.out.println("3- Uygulamadan çık....");

    }

    public static void sehirleriTurla(LinkedList<String> sehirler) {
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;
        islemBastir();
        Scanner input = new Scanner(System.in);
        if (!iterator.hasNext()) {
            System.out.println("Herhangi bir şehir bulunmuyor...");
        }
        boolean cikis = false;
        boolean ileri =true;
        while (!cikis) {
            System.out.println("Bir işlem seçiniz.");
            islem = input.nextInt();
            switch (islem) {
                case 0:
                    islemBastir();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Şehre gidiliyor: " + iterator.next());
                    } else {
                        System.out.println("Sonrasında şehir yok...");
                        ileri=true;

                        islemBastir();
                    }
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Önceki şehre gidiliyor: " + iterator.previous());

                    }
                    else {
                        System.out.println("Şehir turu başladı...");
                    }
                    break;

                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çıkıldı...");
                    break;

            }
        }

    }


    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Kayseri");
        sehirleriTurla(sehirler);


    }
}