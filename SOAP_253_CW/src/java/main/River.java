package main;


import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Data structure to hold the information of a river.
 * @author Manol
 * @version 1.0
 */

public class River {
    private final String name;
    private int length;
    private final ConcurrentHashMap<String, River> trib = new ConcurrentHashMap<>();
    
    /**
     * Creates a river
     * @param name of river
     * @param length of river
     */
    public River(String name, int length){
        this.name = name;
        this.length = length;
    }
    
    /**
     * Updates the length of a river.
     * @param length of river
     */
    public void setLength(int length){
        this.length = length;
    }
    
    /**
     * Returns the name of the river.
     * @return name of river
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Checks if the river has a tributary with the name given
     * @param name of tributary river
     * @return true if it has it
     */
    public Boolean hasTrib(String name){
        return trib.containsKey(name);
    }
    
    /**
     * Adds a tributary to a river.
     * @param river to be a tributary
     */
    public void addTrib(River river){
        //this check stops a circle of tributaries
        if(!river.hasTrib(this.name)){
            trib.putIfAbsent(river.getName(), river);
        }
    }
    
    /**
     * Removes a tributary
     * @param name of tributary
     */
    public void removeTrib(String name){
        trib.remove(name);
    }
    
    /**
     * Returns length of river.
     * @return length of river
     */
    public int getLength(){
        return this.length;
    }
    
    /**
     * Formats the river to a nice string.
     * @return "name:length km-with tributaries: lengthWithTributaries km;"
     */
    @Override
    public String toString(){
        int tribLength = this.length;
        //this also makes a copy so we don't get issues with concurrency
        Collection<River> coll = trib.values();
        River[] arrayRivers = coll.toArray(new River[coll.size()]);
        for(River s : arrayRivers){
            tribLength += s.getLength();
        }
        
        return this.name + ":" + this.length + "km-with tributaries: " 
                + tribLength + "km;";
    }
    
    
    
}