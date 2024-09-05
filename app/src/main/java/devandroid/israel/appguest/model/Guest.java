package devandroid.israel.appguest.model;

import java.util.Arrays;

public class Guest {
    private String name;
    private String lastName;
    private Character isHusbandOrWifeFamily;
    private int nGuest;
    private Boolean alcoholOrnot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Character getIsHusbandOrWifeFamily() {
        return isHusbandOrWifeFamily;
    }

    public void setIsHusbandOrWifeFamily(Character isHusbandOrWifeFamily) {
        this.isHusbandOrWifeFamily = isHusbandOrWifeFamily;
    }

    public int getnGuest() {
        return nGuest;
    }

    public void setnGuest(int nGuest) {
        this.nGuest = nGuest;
    }

    public Boolean getAlcoholOrnot() {
        return alcoholOrnot;
    }

    public void setAlcoholOrnot(Boolean alcoholOrnot) {
        this.alcoholOrnot = alcoholOrnot;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isHusbandOrWifeFamily=" + isHusbandOrWifeFamily +
                ", nGuest=" + nGuest +
                ", alcoholOrnot=" + alcoholOrnot +
                '}';
    }
}
