package tadsemantico;

import java.util.HashMap;
/**
 *
 * @author darlan
 */
public class RecordType implements Type {
    private Integer nbytes = null;
    private HashMap fields = new HashMap<String, Symbol>();
    
    public RecordType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        field = field.toUpperCase();
       
        if(fields.containsKey((String) field)){
            return false;
        }
        fields.put(field, value);
        if(value == null){
            this.nbytes = 0;
        }else{
            Type t = ((Symbol)value).getType();
            if(t.get("_nbytes_") != null)
                this.nbytes = ((this.nbytes == null)? (Integer)t.get("_nbytes_") : this.nbytes + (Integer)t.get("_nbytes_"));
        }
        return true;
    }

    @Override
    public Object get(String field) {
        field = field.toUpperCase();
        switch(field){
            case "_NBYTES_":
                return this.nbytes;
            case "_FIELDS_":
                return this.fields.keySet();
            default:
                if(!fields.containsKey(field))
                    return null;
                return fields.get(field);
        }
    }
}
