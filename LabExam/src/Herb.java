
 public abstract class Herb extends Item {
	 
	private boolean consumed = false;  

	public boolean isConsumed() {
		return consumed;
	}
	
	public void setAsConsumed() {
		consumed = true;
	}
	
    @Override
    public String toString() {
    	return "Herb --> " + super.toString();
    }	
    
}
