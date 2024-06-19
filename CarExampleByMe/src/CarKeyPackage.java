public class CarKeyPackage { /*
Bu sınıf bir paketi temsil etmetke araba alırken ne alırsın sadece bir anahtar ve araba alırsın bu sınıf o araba ile anahtarı temsil ediyor
*/
     public final Car car;
     public final Key key;

     CarKeyPackage(Car car, Key key){
        this.car=car;
        this.key=key;
     }
}
