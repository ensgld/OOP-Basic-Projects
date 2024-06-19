public class Mühendis extends Person{
    int maaş;
    Mühendis(int maaş,int yaş,int kilo){
        super(yaş, kilo); //extend aldığımız Person classından constrctor aldık
        this.maaş=maaş;

    }
    int zam(){
        return maaş++;
    }
    int zam(int zamMiktarı){
        /*
        Tanımlanmış bir methodu tekrar farklı özellikte yazıyoruz yani overloading işlemi yapıyoruz.
         */
        maaş+=zamMiktarı;
        return maaş;
    }
    int zam(float zamOrani){ //float verirsek bu method çalışıcak
        maaş*=(1+zamOrani);
        return maaş;
    }
    void yemek(){ //overriding işlemi yaptık person classındaki yemek methodunun üstüne mühendislere özel olan bir özellliğe göre yaptık.
        kilo+=2;
    }
    void yemek(int yemekKilo){ //overloading
        kilo+=yemekKilo;

    }
   /* void zam(){
        maaş*=2;
   Yapamayız bir methodu overload edebilmemiz için return type'ı değişmemesi gerekir bu durumda
   java hangisini kullanacağını bilemez bizim değiştirmemiz gereken şey parametresi olabilir veya
    işlemleri değiştirebiliriz.
    } */


}
