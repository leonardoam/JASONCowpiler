package tadsemantico;

/**
 *
 * @author darlan
 */
class ConstantType implements Type {
    private int nbytes = -1;
    private Object value = null;
    private Type elemType = null;

    public ConstantType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "VALUE":
                this.value = value;
                return true;
            case "ELEMTYPE":
                this.elemType = (Type) value;
                this.nbytes = (Integer) elemType.get("nbytes");
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "VALUE":
                return this.value;
            case "ELEMTYPE":
                return this.elemType;
            case "NBYTES":
                if(this.nbytes < 0)
                    return null;
                return this.nbytes;
            default:
                return null;
        }
    }
}
