public class Person {
    final String name ;
    final String surname;
    Person(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public int hashCode(){ /*Object sınıfında bulunan hashCode() methodu, bir nesnenin benzersiz bir tamsayı değeri olan bir karma değerini döndürür.

    Bu methodun temel amacı,nesneleri hızlı bir şekilde karşılaştırmak veya sıralamak için kullanılan veri yapılarında (örneğin, HashMap veya HashSet) performansı artırmaktır.
    Eğer .equals yaptığımızda iki nesnenin içeriği aynıysa true dönücek bunu anlamak için hashCode da kullanılabilir hashCode'un atadığı değer aynı ise
    bu iki nesnenin içeriği aynıdır ama override ettiğimizde
    */
        return name.hashCode() ^ surname.hashCode();
    }
    public String toString(){
        return name+  " " + surname;
    }
    public boolean equals(Object obj){
        if(this == obj)
        return true;
        else{
            Person p = (Person)obj;
            return(this.name.equals(p.name)&& this.surname.equals(p.surname));

        }
    }

}
