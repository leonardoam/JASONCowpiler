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
class IntegerType implements Type {
    private final int nbytes = 2;

    public IntegerType() {
        
    }

    @Override
    public boolean set(String field, Object value) {
        return false;
    }

    @Override
    public Object get(String field) {
        return new Integer(nbytes);
    }
    
}
