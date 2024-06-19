
public class Key {

	private int code;
	
	Key(int code) {
		this.code = code;
	}
	
	boolean isCompatibleCode(int code) {
		return this.code == code;
	}
	
}
