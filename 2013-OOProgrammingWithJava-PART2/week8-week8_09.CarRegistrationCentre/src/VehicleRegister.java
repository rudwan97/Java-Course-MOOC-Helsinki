import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jeannette on 22/05/2017.
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        for (String vehicleOwner : owners.values()) {
            if (owners.get(vehicleOwner)!= null || owners.containsKey(plate)) {
                return false;
            }
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> vehicleOwners = new ArrayList<>();
        for (String vehicleOwner : owners.values()) {
            if (!vehicleOwners.contains(vehicleOwner)) {
                vehicleOwners.add(vehicleOwner);
                System.out.println(vehicleOwner);
            }
        }
    }
}
