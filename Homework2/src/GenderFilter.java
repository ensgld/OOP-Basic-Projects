
public class GenderFilter extends Filter {
	public final Gender gender;

	
	GenderFilter() {
		gender = null;
	}
	
	GenderFilter(Gender gender) {
		this.gender=gender;
	}

	@Override
	public boolean test(Person person) {
		if (person != null){
			if(person.gender !=null){
				return person.gender==gender;
			}
			else{
				return person.gender==null;
			}
		}
		else
			return false;
	}

}
