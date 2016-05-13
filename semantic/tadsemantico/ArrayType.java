package tadsemantico;

/**
 *
 * @author darlan
 */
class ArrayType implements Type {
    private int nbytes = -1;
    private int size = -1;
    private Type elemType = null;

    public ArrayType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "SIZE":
                this.size = (Integer) value;
                if(elemType != null && size > 0)
                    this.nbytes = ((Integer) elemType.get("nbytes"))*this.size;
                return true;
            case "ELEMTYPE":
                this.elemType = (Type) value;
                if(elemType != null && size > 0)
                    this.nbytes = ((Integer) elemType.get("nbytes"))*this.size;
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
            case "NBYTES":
                if(this.nbytes < 0)
                    return null;
                return this.nbytes;
            default:
                return null;
        }
    }
}
