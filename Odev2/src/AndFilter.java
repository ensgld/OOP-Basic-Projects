public class AndFilter extends Filter {
    private Filter filter1;
    private Filter filter2;	
	// student code
	
	AndFilter(Filter filter1, Filter filter2) {
		this.filter1 = filter1;
		this.filter2 = filter2;
	}
	
	@Override
	public boolean test(Person person) {
        if (person != null) {
            return filter1.test(person) && filter2.test(person);
        }
        else {
        	return false;
        }
        //return false;		
		// student code
	}

}
