package Homework2;


public class GenderFilter extends Filter {
	public final Gender gender;
	
	GenderFilter() {
		gender = null;
	}
	
	GenderFilter(Gender gender) {
        this.gender = gender;		
		// student code
	}

	@Override
	public boolean test(Person person) {
        if (person != null) {
            if (gender == null) {
                return person.gender == null;
            } else {
                return person.gender == gender;
            }
        } else {
            return false;
        }
	}

}
