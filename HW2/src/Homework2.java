
public class Homework2 {

    public static void main(String[] args) {

        // Create society members
        Person[] societyMembers = {
                new Person("Ali", "Kondur", Gender.Male, 1975, 7, 2),
                new Person("Faruk", "Guz", Gender.Male, 1985, 1, 5),
                new Person("Murat", "Demir", Gender.Male, 1995, 5, 1),
                new Person("Ahmet", "Ari", Gender.Male, 2000, 7, 2),
                new Person("Nigar", "Sen", Gender.Female, 1943, 11, 9),
                new Person("Serap", "Kaya", Gender.Female, 2000, 12, 15),
                new Person("Zeynep", "Erdogan", Gender.Female, 2015, 10, 28),
                new Person("Burak", "Ak", Gender.Male, 2020, 6, 23),
                new Person("Arzu", "Sesiguzel", Gender.Female, 2002, 8, 19),
                new Person("Tuna", "Nar", Gender.Male, 1975, 4, 4),
                new Person("Oktay", "Eker", Gender.Male, 1978, 2, 8),
                new Person("Elif", "Tek", Gender.Female, 1990, 2, 10),
                new Person("Murat", "Ak", Gender.Male, null),
                new Person("Baha", "Sen", Gender.Male, 1946, 1, 16),
                new Person("Asya", "Nar", Gender.Female, 1997, 3, 25),
                new Person("Mesut", "Mert", Gender.Male, 1951, 8, 19),
        };
        Society society = new Society(societyMembers);

        // Show society members
        System.out.println("Society members");
        System.out.println("---------------");
        for (Person person : society.getMembers()) {
            System.out.println(person + ", Age = " + person.getAge());
        }
        System.out.println();

        // Filter society by gender and age
        Filter maleFilter = new GenderFilter(Gender.Male);
        Filter femaleFilter = new GenderFilter(Gender.Female);

        System.out.println("Society size = " + society.getMembers().length);
        System.out.println("Male count = " + society.getSubSocietySize(maleFilter));
        System.out.println("Female count = " + society.getSubSocietySize(femaleFilter));
        System.out.println("Unknown gender count = " + society.getSubSocietySize(new GenderFilter()));
        System.out.println();

        System.out.println("Males");
        System.out.println("-----");
        for (Person person : society.getSubSociety(maleFilter).getMembers()) {
            System.out.println(person);
        }
        System.out.println();

        System.out.println("Females");
        System.out.println("-------");
        for (Person person : society.getSubSociety(femaleFilter).getMembers()) {
            System.out.println(person);
        }
        System.out.println();

        System.out.println("Age between 25 and 45");
        System.out.println("---------------------");
        Filter ageFilter = new AgeFilter(25, 45);
        for (Person person : society.getSubSociety(ageFilter).getMembers()) {
            System.out.println(person + ", Age = " + person.getAge());
        }
        System.out.println();

        System.out.println("Males with age between 25 and 45");
        System.out.println("--------------------------------");
        for (Person person : society.getSubSociety(ageFilter).getSubSociety(maleFilter).getMembers()) {
            System.out.println(person + ", Age = " + person.getAge());
        }
        System.out.println();

        Filter andFilter = new AndFilter(ageFilter, femaleFilter);
        System.out.println("Females with age between 25 and 45");
        System.out.println("----------------------------------");
        for (Person person : society.getSubSociety(andFilter).getMembers()) {
            System.out.println(person + ", Age = " + person.getAge());
        }
        System.out.println();
    }

}
