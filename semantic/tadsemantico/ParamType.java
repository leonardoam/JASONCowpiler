package tadsemantico;

/**
 *
 * @author darlan
 */
public class ParamType implements Type {
    private String tClass = null;
    private Symbol elemType = null;
    private Symbol param = null;//equivalent to address on a HashTable

    public ParamType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "TCLASS":
                tClass = ((String) value).toUpperCase();
                if(tClass.equals("REFERENCE") || tClass.equals("VALUE")){
                    this.tClass = tClass;
                    return true;
                }
                return false;
            case "ELEMTYPE":
                this.elemType = (Symbol) value;
                return true;
            case "PARAM":
                this.param = (Symbol) value;
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
            case "PARAM":
                return this.param;
            default:
                return null;
        }
    }
}
