package tadsemantico;

/**
 *
 * @author darlan
 */
class FunctionType implements Type {
    private int nparams = -1;
    private Type returnType = null;
    

    public FunctionType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                this.nparams = (Integer) value;
                return true;
            case "RTYPE":
                this.returnType = (Type) value;
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                if(this.nparams < 0)
                    return null;
                return this.nparams;
            case "RTYPE":
                return this.returnType;
            default:
                return null;
        }
    }
}
