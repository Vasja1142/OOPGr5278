package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

import static Controller.Command.ENG;
import static Controller.Command.RU;

/**
 * Класс для работы с базой данных (Model) и пользователем (View)
 */
public class ControllerClass implements iGetController {

    private iGetModel model;
    private iGetView view;
    private List<Student> studBuffer = new ArrayList<>();

    /**
     * Инициализация контроллера
     * @param model База данных
     * @param view Класс вывода пользователю запращиваемой информации
     */
    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * @param stud список студентов
     * @return возвращает false если список пустой
     */
    private boolean tesdData(List<Student> stud)
    {
        if(stud.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Метод запускающий заданный вывод данных (view) из заданной базы данных (model)
     * @param Request Какое-то сообщение не влияющее ни на что
     */
    public void update(String Request)
    {
        //MVP
        studBuffer = model.getStudents();
        if(tesdData(studBuffer))
        {
            view.printAllStudent(studBuffer);
        }
        else
        {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudent(model.getStudents());
    }


    /**
     * Метод работы с базой данных
     * EXIT - выход из программы
     * LIST - вывод списка студентов
     */
    public void run()
    {
        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        boolean flag = true;

        String lang = view.prompt("Enter the language (\"Ru\" or \"Eng\"):");
        Command language = Command.valueOf(lang.toUpperCase());

        while(getNewIter)
        {
            switch (language){
                case RU:
                    String command = view.prompt("Введите команду:");
                    com = Command.valueOf(command.toUpperCase());
                    switch(com)
                    {
                        case EXIT:
                           getNewIter = false;
                           System.out.println("Выход из программы");
                           break;
                        case LIST:
                           view.printAllStudent(model.getStudents());
                           break;
                    }
                    break;
                case ENG:
                    String commandEng = view.prompt("Enter the command:");
                    com = Command.valueOf(commandEng.toUpperCase());
                    switch(com)
                    {
                        case EXIT:
                            getNewIter = false;
                            System.out.println("Exit the programm");
                            break;
                        case LIST:
                            view.printAllStudent(model.getStudents());
                            break;
                        case DELETE:
                            Integer num = Integer.valueOf(view.prompt("Enter the student's number:"));
                            boolean del = model.deleteStudent(num);
                            if (!del){
                                System.out.println("This ID is missing!");
                            }
                    }
                    break;

            }

        }

    }
}
