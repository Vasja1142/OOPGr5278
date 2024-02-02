package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Класс хранящий в себе персональные данные студентов в формате HashMap.
 */
public class ModelClassHash implements iGetModel {
    private HashMap<Integer, Student> students;

    public ModelClassHash(List<Student> students){
        this.students = new HashMap<>();
        int ID = -1;
        for (Student s: students) {
            this.students.put(++ID, s);
        }
    }

    public boolean deleteStudent(Integer ID) {
        if (students.containsKey(ID)) {
            students.remove(ID);
            return true;
        }
        else return false;
    }


    /**
     * @return возвращает данные всех студентов в формате List<Student>
     */
    @Override
    public List<Student> getStudents() {
        Collection<Student> studs = students.values();
        List<Student> studsList = new ArrayList<>(studs);
        return studsList;
    }
}
