package Java.J_se_les8.task1;

import java.util.ArrayList;

import Java.J_se_les8.task1.figures.Circle;
import Java.J_se_les8.task1.figures.Figure;
import Java.J_se_les8.task1.figures.Rectangle;
import Java.J_se_les8.task1.figures.Square;
import Java.J_se_les8.task1.figures.Triangle;

/*
 * Написать классы следующих фигур:
1. Треугольник
2. Прямоугольник
3. Квадрат
4. Круг
У всех классов, где это необходимо, реализовать методы вычисления периметра и площади. Для всех классов реализовать необходимый набор конструкторов и селекторов. 
В классе Program реализовать метод печати информации о фигуре. Объекты фигур создать в main
 */
public class Program {
    public static void info(Figure figure){
        System.out.println(figure.getInfo()); 
    }
    public static void main(String[] args) {
        ArrayList<Figure> array = new ArrayList<>();
        Figure f1 = new Rectangle(5, 7);
        Figure f2 = new Circle(10);
        Figure f3 = new Square(7);
        Figure f4 = new Triangle(3,4,5);
        Figure f5 = new Triangle(7,8);
        Figure f6 = new Triangle(6);
        array.add(f1);
        array.add(f2);
        array.add(f3);
        array.add(f4);
        array.add(f5);
        array.add(f6);
        for (int i = 0; i < array.size(); i++) {
            info(array.get(i)); 
        }

    }
}
