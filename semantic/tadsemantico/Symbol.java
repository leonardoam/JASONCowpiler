/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadsemantico;

/**
 *
 * @author emanuel
 */
public class Symbol {
    final String typeName;
    final String id;
    Type type;

    public Symbol(String id, String typeName) {
        this.typeName = typeName.toUpperCase();
        this.id = id;
        
        switch(typeName.toUpperCase()){
            case "INTEGER": 
                type = new IntegerType();
                break;
            case "REAL":
                type = new RealType();
                break;
            case "STRING":
                type = new StringType();
                break;
            default: type = null;
        }
        //this.type
    }

    public String getTypeName() {
        return typeName;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }
    
    
   
    
}