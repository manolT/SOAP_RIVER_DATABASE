
package soapclient;

import java.util.ArrayList;
import main.River;
import main.RiverDatabase;
import main.RiverDatabaseService;

/**
 *
 * @author Manol
 */
public class SOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RiverDatabaseService service = new RiverDatabaseService();
        RiverDatabase port = service.getRiverDatabasePort();
        
        port.addRiver("Volga", 3790);
        port.addRiver("Oka", 1500);
        port.makeTeibutary("Volga", "Oka");
        port.addRiver("Sheksna", 139);
        port.makeTeibutary("Volga", "Sheksna");
        port.addRiver("Nerl", 112);
        port.makeTeibutary("Volga", "Nerl");
        
        System.out.println("Volga and tributaries:");
        System.out.println(port.getRivers(0));
        port.deleteRiver("Oka");
        System.out.println("After deleting a tributary:");
        System.out.println(port.getRivers(0));
        /*
        port.addRiver("Dunabe", 1300);
        port.addRiver("Iskar", 368);
        port.makeTeibutary("Dunabe", "Iskar");
        port.addRiver("Osam", 204);
        port.makeTeibutary("Dunabe", "Osam");
        System.out.println("Volga, Dunabe and tributaries:");
        System.out.println(port.getRivers(0));
        
        port.makeTeibutary("Osam", "Dunabe");
        port.updateLength("Dunabe", 2850);
        System.out.println("After attempting to make a tributary "
                + "to one of its distributaries and succesfully "
                + "correcting Dunabe's length:");
        System.out.println(port.getRivers(0));
        
        System.out.println("Rivers longer than 1500km:");
        System.out.println(port.getRivers(1500));
        
        /*
        ArrayList<River> rivers = (ArrayList<River>)port.getAllRivers();
        System.out.println(rivers.get(1).toString());
        
        
        
        System.out.println(port.getRivers(0));
        */
    }
    
}
