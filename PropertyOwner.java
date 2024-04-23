import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {
    private User user;
    private List<Property> listOfProperties = new ArrayList<>();

    public void addProperty(String propertyID, String description, String propertyOwnerId) {
        listOfProperties.add(new Property(propertyID, description, propertyOwnerId));
    }

    public void removeProperty(String propertyID) {
        for (int i = 0; i < this.listOfProperties.size(); i++) {
            if (listOfProperties.get(i).getPropertyID().equals(propertyID)) {
                this.listOfProperties.remove(i);
                break;
            }
        }
    }
}
