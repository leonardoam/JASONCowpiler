package tadsemantico;

/**
 *
 * @author darlan
 */
class ProcedureType implements Type {
    private int nparams = -1;
    

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
                if(this.nparams < 0)
                    return null;
                return this.nparams;
            default:
                return null;
        }
    }
}
