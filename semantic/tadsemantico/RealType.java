package tadsemantico;

/**
 *
 * @author darlan
 */
public class RealType implements Type {
    private final int nbytes = 8;

    public RealType() {
        
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
