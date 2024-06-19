public class Key {
     private int code;
    Key(int code){
        this.code= code;
    }
    public boolean isCompatibleCode(int code){
        return this.code==code;

    }
}
