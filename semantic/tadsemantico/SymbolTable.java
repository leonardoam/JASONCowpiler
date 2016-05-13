/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadsemantico;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author emanuel
 */
public class SymbolTable {
    private ArrayList<HashMap<String, Symbol>> levels;
    private Integer currentLevel;
    
    public SymbolTable()
    {
        levels = new ArrayList<HashMap<String, Symbol>>();
        levels.add(new HashMap());
        currentLevel = 0;
    }
           
    public void addLevel()
    {
        levels.add(new HashMap());
        currentLevel++;
    }
    
    public void removeLevel()
    {
        if(currentLevel < 0)
            return;
        
        levels.remove(currentLevel);
        currentLevel--;
    }
    
     public boolean addSymbol(String id, String type)
     {
         if(currentLevel >=0 && !isSet(id))
         {
             levels.get(currentLevel).put(id, new Symbol(id, type));
             return true;
             
         }
         
         //TODO 
         return false;
 
    }
     
     public boolean isSet(String id)
     {
         if(currentLevel < 0)
             return false;
         
         return levels.get(currentLevel).containsKey(id);
     }
     
     public Symbol search(int level, String id)
     {
         while(level >= 0)
         {
             if(levels.get(level--).containsKey(id))
                 return (Symbol) levels.get(level+1).get(id);   
         }
         
         return null;
     }
   
    public Integer getCurrentLevel() {
        return currentLevel;
    }
}
