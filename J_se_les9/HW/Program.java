package Java.J_se_les9.HW;

import Java.J_se_les9.HW.Classes.ReadData.ReadData;
import Java.J_se_les9.HW.Classes.UI.UI;
import Java.J_se_les9.HW.Classes.Zoo.Zoo;

public class Program {
    public static void workWithZoo(Zoo zoo) {
        UI ui = new UI();
        int choose = -1;
        ReadData tmpForMain = new ReadData();
        while (choose != 0) {
            ui.mainMenu();
            tmpForMain.setIntValue();
            choose = tmpForMain.getIntValue();
            switch (choose) {
                case 0:
                    ui.actions(choose);
                    break;
                case 1:
                    ui.actions(choose);
                    tmpForMain.setIntValue();
                    zoo.addAnimal(tmpForMain.getIntValue());
                    break;
                case 2:
                    ui.actions(choose);
                    tmpForMain.setIntValue();
                    zoo.removeAnimal(tmpForMain.getIntValue());
                    break;
                case 3:
                    ui.actions(choose);
                    tmpForMain.setIntValue();
                    zoo.infoAbout(tmpForMain.getIntValue());
                    break;
                case 4:
                    ui.actions(choose);
                    zoo.infoAll();
                    break;
                case 5:
                    ui.actions(choose);
                    tmpForMain.setIntValue();
                    zoo.makeSoundThis(tmpForMain.getIntValue());
                    break;
                case 6:
                    ui.actions(choose);
                    zoo.makeSoundAll();
                    break;
                case 7:
                    ui.actions(choose);
                    tmpForMain.setIntValue();
                    zoo.flyAction(tmpForMain.getIntValue());
                    break;
                case 8:
                    ui.actions(choose);
                    tmpForMain.setIntValue();
                    zoo.weaselAction(tmpForMain.getIntValue());
                    break;
                case 9:
                    ui.actions(choose);
                    tmpForMain.setIntValue();
                    zoo.trainAction(tmpForMain.getIntValue());
                    break;
                default:
                    ui.actions(choose);
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo();
        zoo.addAnimalDefault();
        workWithZoo(zoo);

    }
}