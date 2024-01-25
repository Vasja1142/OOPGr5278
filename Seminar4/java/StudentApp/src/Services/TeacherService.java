package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для работы с Преподавательским составом
 */
public class TeacherService implements iPersonService<Teacher> {
    /**
     * Счетчик
     */
    private int count;
    /**
     * Массив данных о преподавателях
     */
    private List<Teacher> teachers = new ArrayList();

    /**
     * Инициализация сервиса
     */
    public TeacherService() {
        teachers = new ArrayList<>();
        this.count = 0;
    }

    /**
     * @return Возвращает массив данных о всех преподавателях
     */
    public List<Teacher> getAll() {
        return this.teachers;
    }

    /**
     * Добавляем преподавателя в базу данных
     * @param name Имя преподавателя
     * @param age Количество лет
     */
    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age,  "Преподаватель");
        ++this.count;
        teachers.add(teacher);
        this.sortByFIO();
    }

    /**
     * Добавляем преподавателя в базу данных
     * @param teacher Переменная "преподаватель"
     */
    public void create(Teacher teacher){
        ++this.count;
        teachers.add(teacher);
        this.sortByFIO();
    }

    /**
     * Сортировка по ФИО
     */
    public void sortByFIO() {
        PersonComparator<Teacher> teachComp = new PersonComparator();
        this.teachers.sort(teachComp);
    }

    /**
     * @return Вывод в консоль
     */
    @Override
    public String toString() {
        return "Преподаватели: \n" + teachers +
                '\n';
    }
}
