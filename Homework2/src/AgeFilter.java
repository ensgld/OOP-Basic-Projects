
public class AgeFilter extends Filter {
	public final Integer startAge;
	public final Integer endAge;

	AgeFilter() {
		startAge = null;
		endAge = null;
	}
	
	AgeFilter(Integer startAge) {
		this.startAge = startAge;
		this.endAge = null;
	}	
	
	AgeFilter(Integer startAge, Integer endAge) {
		this.startAge = startAge;
		this.endAge = endAge;
	}	
	
	@Override
	public boolean test(Person person) {
		if (person != null) {
			Integer personAge = person.getAge();
			if(personAge != null){
			if (startAge != null && endAge != null){
				return personAge<=endAge && personAge>= startAge;
			}
			else if (startAge != null) {
				return personAge <=startAge;
			}
			}
		}

		return false;
	}

}
