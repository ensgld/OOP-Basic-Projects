
public class Door {

	private int code;
	
	Door(int code) {
		this.code = code;
	}
	
	public boolean isCompatibleKey(Key key) {
		return key.isCompatibleCode(this.code);
	}
}
