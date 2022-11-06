package Java.J_se_les9.HWV2.Core.Animals.Base;
public abstract class Base {
    private Integer hight;
    private Integer weight;
    private String eyeColor;

    protected Base(Integer hight, Integer weight, String eyeColor) {
        this.hight = hight;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public Integer getHight() {
        return hight;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }
}