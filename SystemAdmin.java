
package garage.system;
public class SystemAdmin {
   private String Name;
   private String Password;
   private long ID;
   private int UserID;
   private long phoneNumber;

    public SystemAdmin(String Nam, String Passwor, long ID, long phoneNumber) {
        this.Name = Nam;
        this.Password = Passwor;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "SystemAdmin{" + "Name=" + Name + ", Password=" + Password 
                + ", ID=" + ID + ", UserID=" + UserID + ", phoneNumber=" + phoneNumber + '}';
    }


}