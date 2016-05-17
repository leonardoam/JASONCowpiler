package tadsemantico;

/**
 *
 * @author darlan
 */
public class StringType implements Type {
    private final int nbytes = 256;

    public StringType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        return false;
    }

    @Override
    public Object get(String field) {
        if(field.toUpperCase().equals("NBYTES")){
            return this.nbytes;
        }else{
            return null;
        }
    }
}
