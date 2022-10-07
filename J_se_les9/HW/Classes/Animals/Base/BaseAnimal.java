package Java.J_se_les9.HW.Classes.Animals.Base;

public abstract class BaseAnimal {
    private Integer hight;
    private Integer weight;
    private String eyeColor;

    public BaseAnimal(Integer hight, Integer weight, String eyeColor) {
        this.hight = hight;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    protected Integer getHight() {
        return hight;
    }

    protected Integer getWeight() {
        return weight;
    }

    protected String getEyeColor() {
        return eyeColor;
    }

    public String getInfo() {
        return String.format("Type: %s\nHight: %d\nWeight: %d\nEye color: %s\n", getClass().getSimpleName(), getHight(),
                getWeight(), getEyeColor());
    }

    public abstract void makeSound();

}
