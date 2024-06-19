
public class AndFilter extends Filter {
	Filter filter1;
	Filter filter2;

	
	AndFilter(Filter filter1, Filter filter2) {
		this.filter1 = filter1;
		this.filter2 = filter2;
	}
	
	@Override
	public boolean test(Person person) {
		// student code
	}

}
