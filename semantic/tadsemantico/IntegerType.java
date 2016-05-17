package tadsemantico;

/**
 *
 * @author emanuel
 */
public class IntegerType implements Type {
    private final int nbytes = 4;

    public IntegerType() {
        
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
