package tadsemantico;

/**
 *
 * @author darlan
 */
class VariableType implements Type {
    private Integer nbytes = null;
    private Symbol elemType = null;
    private String address = null;

    public VariableType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "ELEMTYPE":
                this.elemType = (Symbol) value;
                if(elemType == null || elemType.getType() == null)
                    this.nbytes = 0;
                else
                    this.nbytes = (Integer) elemType.getType().get("_nbytes_");
                return true;
            case "_ADDRESS_":
                if(value != null){
                    this.address = (String) value;
                    /*if(this.elemType != null && this.elemType.getTypeName().equals("TYPE")){
                        if(this.elemType.getType().get("ELEMTYPE").equals("RECORD")){
                            Symbol record = (Symbol)this.elemType.getType().get("ELEMTYPE");
                            record.getType().set("_ADDRESS_", this.address);
                        }
                    }*/
                    return true;
                }
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "ELEMTYPE":
                return this.elemType;
            case "_NBYTES_":
                return this.nbytes;
            case "_ADDRESS_":
                return this.address;
            default:
                return null;
        }
    }
}
