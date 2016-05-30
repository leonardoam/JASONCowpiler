package tadsemantico;

import java.util.ArrayList;

/**
 *
 * @author darlan
 */
class FunctionType implements Type {
    private Integer nparams = null;
    private Symbol returnType = null;
    private ArrayList<Symbol> params = new ArrayList<>();

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
            case "PARAM":
                this.params.add((Symbol)value);
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
            case "PARAMS":
                return this.params;
            default:
                return null;
        }
    }
}
