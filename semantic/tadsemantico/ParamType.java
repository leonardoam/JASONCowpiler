package tadsemantico;

/**
 *
 * @author darlan
 */
class ParamType implements Type {
    private String tClass = null;
    private Type elemType = null;
    private Integer address = null;

    public ParamType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "TCLASS":
                String tclass = ((String) value).toUpperCase();
                if(tClass.equals("REFERENCE") || tClass.equals("VALUE")){
                    this.tClass = tClass;
                    return true;
                }
                return false;
            case "ELEMTYPE":
                this.elemType = (Type) value;
                return true;
            case "ADDRESS":
                this.address = (Integer) value;
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "TCLASS":
                return this.tClass;
            case "ELEMTYPE":
                return this.elemType;
            case "ADDRESS":
                return this.address;
            default:
                return null;
        }
    }
}
