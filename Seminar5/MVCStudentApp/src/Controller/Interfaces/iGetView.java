package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {

    /**
     * Вывод данных студентов на консоль
     * @param students Список студентов
     */
    public void printAllStudent(List<Student> students);

    /**
     * Метод получения данных с консоли
     * @param msg сообщение на консоль
     * @return сообщение считанное с консоли
     */
    public String prompt(String msg);
    
}
