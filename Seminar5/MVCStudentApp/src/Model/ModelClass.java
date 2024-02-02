package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

/**
 * Класс для хранения списка студентов
 */
public class ModelClass implements iGetModel {

    private List<Student> students;

    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    @Override
    public boolean deleteStudent(Integer index) {

        if(students.size()>index && index >= 0){
        students.remove(index);
        return true;
        }

        else return false;
    }

}
