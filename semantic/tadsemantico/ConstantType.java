package tadsemantico;

/**
 *
 * @author darlan
 */
class ConstantType implements Type {
    private Integer nbytes = null;
    private Object value = null;
    private Symbol elemType = null;

    public ConstantType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "VALUE":
                this.value = value;
                return true;
            case "ELEMTYPE":
                this.elemType = (Symbol) value;
                if(elemType == null || elemType.getType() == null)
                    this.nbytes = 0;
                else
                    this.nbytes = (Integer) elemType.getType().get("_nbytes_");
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
            case "_NBYTES_":
                return this.nbytes;
            default:
                return null;
        }
    }
}
