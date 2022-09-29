package Java.J_se_les7.HW.task1;

public class Program {
    static void show(Base base){
        System.out.println(base.toString()); 
    }
    public static void main(String[] args) {
        Base milk = new Milk("Домик в деревне", 100, 500, "ml", 1000, 2.5, "21.11.2022");
        Base soda = new Soda("Coca-Cola", 170, 15, "ml", 2);
        Base bread = new Bread("Бородино", 80, 120, "gr", "21.11.2022", "Кукурузная");
        Base eggs = new Eggs("Пивостопль", 120, 50, "pack", "21.11.2022", 10);
        Base mask = new Masks("Если не бритый", 106, 2000, "pack", 100);
        Base toiletPaper = new ToiletPaper("Zэva", 296, 1200, "pack", 8, 3);
        Base diapers = new Diapers("Для самых маленьких", 745, 321, "pack", 0, "Гипоаллергенные", 12, 0, 4, "S-class");
        Base pacifier = new Pacifier("Культурная", 4500, 10, "by the piece", 18, "Не гипоаллергенная");
        show(milk);
        show(soda);
        show(bread);
        show(eggs);
        show(mask);
        show(toiletPaper);
        show(diapers);
        show(pacifier);
    }
}