package tadsemantico;

/**
 *
 * @author darlan
 */
class ArrayType implements Type {
    private Integer nbytes = null;
    private Integer size = null;
    private Symbol elemType = null;

    public ArrayType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "SIZE":
                this.size = (Integer) value;
                if(elemType != null && elemType.getType() != null && elemType.getType().get("_nbytes_") != null && size != null)
                    this.nbytes = ((Integer) elemType.getType().get("_nbytes_"))*this.size;
                else
                    this.nbytes = 0;
                return true;
            case "ELEMTYPE":
                this.elemType = (Symbol) value;
                if(elemType != null && elemType.getType() != null && elemType.getType().get("_nbytes_") != null && size != null)
                    this.nbytes = ((Integer) elemType.getType().get("_nbytes_"))*this.size;
                else
                    this.nbytes = 0;
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "SIZE":
                return this.size;
            case "ELEMTYPE":
                return this.elemType;
            case "_NBYTES_":
                return this.nbytes;
            default:
                return null;
        }
    }
}
