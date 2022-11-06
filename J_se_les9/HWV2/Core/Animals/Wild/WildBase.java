package Java.J_se_les9.HWV2.Core.Animals.Wild;

import Java.J_se_les9.HWV2.Core.Animals.Base.Base;

public abstract class WildBase extends Base {
    private String livingLocation;
    private String locationData;

    protected WildBase(Integer hight, Integer weight, String eyeColor, String livingLocation, String locationData) {
        super(hight, weight, eyeColor);
        this.livingLocation = livingLocation;
        this.locationData = locationData;
    }

    public String getLivingLoc() {
        return livingLocation;
    }

    public String getLocDate() {
        return locationData;
    }
}