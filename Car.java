
package garage.system;

public class Car {
    private String PlateNumber;
    private String Owner;
    private String SubscriptionType;
    private boolean isVIP;

    public Car(String PlateNumber, String Owner, String SubscriptionType, boolean isVIP) {
        this.PlateNumber = PlateNumber;
        this.Owner = Owner;
        this.SubscriptionType = SubscriptionType;
        this.isVIP = isVIP;
    }

    public String getPlateNumber() {
        return PlateNumber;
    }

    public void setPlateNumber(String PlateNuber) {
        this.PlateNumber = PlateNuber;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getSubscriptionType() {
        return SubscriptionType;
    }

    public void setSubscriptionType(String SubscriptionType) {
        this.SubscriptionType = SubscriptionType;
    }

    public boolean isIsVIP() {
        return isVIP;
    }

    public void setIsVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }

    @Override
    public String toString() {
        return "Car{" + "PlateNumber=" + PlateNumber + ", Owner=" + Owner 
                + ", SubscriptionType=" + SubscriptionType + ", isVIP=" + isVIP + '}';
    }
    
}

