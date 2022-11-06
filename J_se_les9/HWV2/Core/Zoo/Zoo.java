package Java.J_se_les9.HWV2.Core.Zoo;

import java.util.ArrayList;
import java.util.List;

import Java.J_se_les9.HWV2.Core.Animals.Base.Base;

public class Zoo {
    private List<Base> zooList;
    public Zoo(){
        zooList = new ArrayList<Base>();
    }
    public void add(Base base){
        zooList.add(base);
    }
    public void remove(int index){
        zooList.remove(index);
    }
    public int animalsInZoo(){
        return zooList.size();
    }
    public Base getAnimal(int index){
        return zooList.get(index);
    }
}