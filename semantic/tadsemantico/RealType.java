package tadsemantico;

/**
 *
 * @author darlan
 */
class RealType implements Type {
    private final int nbytes = 8;

    public RealType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        return false;
    }

    @Override
    public Object get(String field) {
        return nbytes;
    }
}
