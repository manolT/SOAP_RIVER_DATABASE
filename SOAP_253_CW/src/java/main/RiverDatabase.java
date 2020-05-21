package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import javax.jws.WebService;

/**
 * A web service that stores and returns information about rivers.
 * @author Manol
 * @version 1.0
 */
@WebService
public class RiverDatabase {

    /*I opted for ConcurrentHashMap since it is thread-safe and 
      highly-concurrent. It allows multiple reads without locking.
      However they can overlap with write operations, so I had to 
      make some minor adjustments, such as making copies when 
      looping over all the elements in the map or other bulk operations.
     */
    private final ConcurrentHashMap<String, River> RIVERS
            = new ConcurrentHashMap<>();

    /**
     * Adds a river to the database.
     * @param name of the river
     * @param length of the river
     */
    public void addRiver(String name, int length) {
        River river = new River(name, length);
        RIVERS.putIfAbsent(name, river);
    }

    /**
     * Makes an existing river a tributary of another one.
     * @param parent river
     * @param child river
     */
    public void makeTeibutary(String parent, String child) {
        ConcurrentHashMap<String, River> copy = new ConcurrentHashMap<>(RIVERS);
        if (copy.containsKey(parent) && copy.containsKey(child) && !child.equals(parent)) {
            copy.get(parent).addTrib(copy.get(child));
        }
    }

    /**
     * Updates the length of an existing river
     * @param name of river
     * @param length of river
     */
    public void updateLength(String name, int length) {
        River temp = RIVERS.get(name);
        if (temp != null) {
            temp.setLength(length);
        }
    }

    /**
     * Deletes an existing river.
     * @param name of river
     */
    public void deleteRiver(String name) {
        RIVERS.remove(name);
        //removing occurances of that river in tributary lists
        //this also makes a copy so we don't get issues with concurrency
        Collection<River> coll = RIVERS.values();
        River[] arrayRivers = coll.toArray(new River[coll.size()]);

        for (River s : arrayRivers) {
            s.removeTrib(name);
        }
    }

    /**
     * Returns a list of all the rivers in the system.
     * @return rivers
     */
    public ArrayList<River> getAllRivers() {
        Collection<River> coll = RIVERS.values();
        return new ArrayList(coll);
    }

    public String getRiverName(River river){
        return river.getName();
    }
    
    /**
     * Returns all rivers with length over the minimum in the database.
     * @param min length
     * @return formatted text describing the rivers
     */
    public String getRivers(int min) {

        String result = "";
        //this also makes a copy so we don't get issues with concurrency
        Collection<River> coll = RIVERS.values();
        River[] arrayRivers = coll.toArray(new River[coll.size()]);

        for (River s : arrayRivers) {
            if (s.getLength() > min) {
                result += s.toString() + "\n";
            }
        }

        return result;
    }

}
