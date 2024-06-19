import java.util.*;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        SortedSet<String> sortedSet = new TreeSet<>(); //sorted setler setlere alternatiftir TreeSetle sıralama açısından benzerdir.
        sortedSet.add("Esra");
        sortedSet.add("Enes");
        sortedSet.add("Nisa");
        sortedSet.add("Sude");
        sortedSet.add("Tekin");
        sortedSet.add("Fatma");
        Iterator<String> itr1 = sortedSet.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println();
        LinkedList<String> tersListe = new LinkedList<>();
        tersListe.add("Enes");
        tersListe.add("Esra");
        tersListe.add("Fatma");
        Iterator ters =tersListe.descendingIterator();
      // while(ters.hasNext()){
        //    System.out.println(ters.next());
        //}
        ters.forEachRemaining(a-> System.out.println(a));

      



    }
}


