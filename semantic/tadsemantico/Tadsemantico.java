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
public class Tadsemantico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SymbolTable sb = new SymbolTable();
        sb.addSymbol("count", "Integer");
        
        Symbol s = sb.search(0, "count");
        //s.getType().get("nbytes");
        System.out.println(s.getType().get("nbytes"));
    }
    
}
