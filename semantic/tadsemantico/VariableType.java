package tadsemantico;

/**
 *
 * @author darlan
 */
class VariableType implements Type {
    private int nbytes = -1;
    private Type elemType = null;

    public VariableType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
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
