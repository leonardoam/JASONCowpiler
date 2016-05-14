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
        Type t = ((Symbol)value).getType();
        if(t.get("nbytes") != null)
            this.nbytes = ((this.nbytes == null)? (Integer)t.get("nbytes") : this.nbytes + (Integer)t.get("nbytes"));
        return true;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "NBYTES":
                return this.nbytes;
            default:
                if(!fields.containsKey(field))
                    return null;
                return fields.get(field);
        }
    }
}
