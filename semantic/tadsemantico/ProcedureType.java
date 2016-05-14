package tadsemantico;

/**
 *
 * @author darlan
 */
class ProcedureType implements Type {
    private Integer nparams = null;
    

    public ProcedureType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                this.nparams = (Integer) value;
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                return this.nparams;
            default:
                return null;
        }
    }
}
