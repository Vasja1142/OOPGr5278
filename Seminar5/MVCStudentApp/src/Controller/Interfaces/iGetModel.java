package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
   /**
    * @return Возвращает список студентов
    */
   public List<Student> getStudents();

   /**
    * Метод удаления данных студента из списка
    * @param ID номер студента
    * @return Возвращает false если студента с данным ID не существует
    */
   public boolean deleteStudent(Integer ID);
}
