package tadsemantico;

import java.util.HashMap;
/**
 *
 * @author darlan
 */
public class RecordType implements Type {
    private int nbytes = -1;
    private HashMap fields = new HashMap<String, Type>();

    public RecordType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        field = field.toUpperCase();
       
        if(fields.containsKey((String) field)){
            return false;
        }
        fields.put(field, value);
        this.nbytes = ((this.nbytes < 0)? (Integer)((Type) value).get("nbytes") : this.nbytes + (Integer)((Type) value).get("nbytes"));
        return true;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "NBYTES":
                if(this.nbytes < 0)
                    return null;
                return this.nbytes;
            default:
                if(!fields.containsKey(field))
                    return null;
                return fields.get(field);
        }
    }
}
