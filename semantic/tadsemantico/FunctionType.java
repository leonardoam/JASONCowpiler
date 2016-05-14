package tadsemantico;

/**
 *
 * @author darlan
 */
class FunctionType implements Type {
    private Integer nparams = null;
    private Symbol returnType = null;
    

    public FunctionType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                this.nparams = (Integer) value;
                return true;
            case "RTYPE":
                this.returnType = (Symbol) value;
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                return this.nparams;
            case "RTYPE":
                return this.returnType;
            default:
                return null;
        }
    }
}
