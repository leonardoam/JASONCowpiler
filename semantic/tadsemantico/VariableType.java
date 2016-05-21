package tadsemantico;

/**
 *
 * @author darlan
 */
class VariableType implements Type {
    private Integer nbytes = null;
    private Symbol elemType = null;

    public VariableType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "ELEMTYPE":
                this.elemType = (Symbol) value;
                if(elemType == null || elemType.getType() == null)
                    this.nbytes = 0;
                else
                    this.nbytes = (Integer) elemType.getType().get("nbytes");
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
                return this.nbytes;
            default:
                return null;
        }
    }
}
