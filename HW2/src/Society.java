
public class Society {
    private final Person[] members;

    Society() {
        members = null;
    }

    Society(Person[] members) {
        this.members = members;
    }

    public int getSubSocietySize(Filter filter) {
        if (filter != null) {
            int filteredCount = 0;

            for (Person person : members) {
                if (filter.test(person)) {
                    filteredCount++;
                }
            }

            return filteredCount;
        }


        return 0;
    }

    public Person[] getMembers() {
        return members;
    }

    public Society getSubSociety(Filter filter) {
        int filteredCount = getSubSocietySize(filter);
        Person[] newSociety = new Person[filteredCount];
        int count = 0;
        for (Person person : members) {
            if (filter.test(person)) { //buraya bak
                newSociety[count] = person;
                count++;
            }
        }
        return new Society(newSociety);


    }
}
