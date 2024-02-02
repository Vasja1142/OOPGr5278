package View;

import java.util.List;
import java.util.Scanner;

import Controller.ControllerClass;
import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {

    private iGetController contr;

    public void setContr(iGetController contr) {
        this.contr = contr;
    }


    /**
     * Метод вывода списка студентов
     * @param students список студентов
     */
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-------------Список студентов------------");
        for(Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }


    /**
     * Метод возвращающий введенные данные с консоли
     * @param msg сообщение перед считыванием информации с консоли
     * @return введенные данные с консоли
     */
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    /**
     * Запускает метод run из заданного controller-класса
     */
    public void ViewRunRU()
    {
        contr.run();
    }
}
