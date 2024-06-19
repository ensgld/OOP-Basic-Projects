public class Person {
    String name ;
    String surname;
    int yaş;
    int kilo;
    Person(){ //default constructor'ı mühendislerinde illa boy ve kilosunu girmeyelim diey açtık.
    }
    Person (int yaş,int kilo){
        if(yaş>0 && kilo>0){
            this.kilo=kilo;
            this.yaş=yaş;
            System.out.println("Yeni bir insan oluştu");
        }

    }
    void yemek(){
        kilo++;
    }
}
