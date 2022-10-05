package Java.J_se_les9.task1;

import Java.J_se_les9.task1.Classes.Advanced;
import Java.J_se_les9.task1.Classes.Beginer;
import Java.J_se_les9.task1.Classes.Middle;
import Java.J_se_les9.task1.Classes.Base.Base;
import Java.J_se_les9.task1.Interfaces.ILearning;
import Java.J_se_les9.task1.Interfaces.IPlaying;
import Java.J_se_les9.task1.Interfaces.Iskipping;
import Java.J_se_les9.task1.Interfaces.Ismoking;

public class Program {
    static void actions(Base name){
        if(name instanceof ILearning){
            ILearning tmp = (ILearning) name;
            tmp.learning();
        }
        if(name instanceof IPlaying){
            IPlaying tmp = (IPlaying) name;
            tmp.playing();
        }
        if(name instanceof Ismoking){
            Ismoking tmp = (Ismoking) name;
            tmp.smoking();
        }
        if(name instanceof Iskipping){
            Iskipping tmp = (Iskipping) name;
            tmp.skipping();
        }
    }

    public static void main(String[] args) {
        Beginer pupil1 = new Beginer();
        Middle pupil2 = new Middle();
        Advanced pupil3 = new Advanced();
        // pupil1.learning();
        // pupil1.playing();
        // pupil2.learning();
        // pupil2.playing();
        // pupil2.skipping();
        // pupil3.learning();
        // pupil3.smoking();
        actions(pupil1);
        actions(pupil2);
        actions(pupil3);

    }
}
/*
Разработать слоедующую иерархию школьников:
1. Младшеклассник
2. Ученик средней школы
3. Старшеклассник
Все школьники должны обладать методом учиться. У младшеклассника релизовать следующие методы:
1. Учиться, выдающий на экран фразу "Я люблю учиться"
2. Играть, выводящий на экран фрацу "Я играю в игрушки"
У ученика средней школы реализовать следующие методы:
1. Учиться, выводящий на экран фразу "Я ненавижу учиться"
2. Играть, выводящий на экран фрацу "Я играю в Minecraft"
3. Прогуливать уроки, выводящий на экран фразу "Я прогуливаю уроки"
Для старшеклассника реализовать следующие методы:
1. Учиться, выводящий на экран фрацу "Я должен учиться"
2. Курить, выводящий на экран фрацу "Я курю"
В классе програм реализовать метод, печатющий все доступные действия школьника
 */