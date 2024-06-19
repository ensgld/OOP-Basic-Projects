import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person{
      String name ;
      int billions;
      Person(String name,int billions){
          this.name=name;
          this.billions=billions;
      }
}
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Warren Buffet",150));
        people.add(new Person("Jeff Bezos",100));
        people.add(new Person("Bill Gates",110));
        people.add(new Person("Mark Zuckerberg",65));
        people.stream().forEach(
                person -> System.out.println(person.name)
        );
        System.out.println("Hundred Club:");
        List<Person> hundredClub = people.stream()
                .filter(person -> person.billions >= 100)
                .collect(Collectors.toList());
        hundredClub.stream().forEach(person -> System.out.println(person.name));

        List<Person> sortedList = people.stream().sorted(Comparator.comparing(person -> person.billions)).collect(Collectors.toList());
        sortedList.forEach(person -> System.out.println("Name:"+person.name+"Billions:"+person.billions));
    }
}