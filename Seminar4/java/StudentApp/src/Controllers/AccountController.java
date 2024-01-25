package Controllers;

import Domain.Person;
import Domain.Teacher;
import Domain.Worker;

import java.util.List;

/**
 * Содержит вспомогательные методы.
 */
public class AccountController {
    /**
     * @param person Кто получил зарплату
     * @param salar Сколько получил
     * @param <T> Должность работника
     * @param <V> Тип данных денег
     */
    public static <T extends Worker,V> void paySalary(T person, V salar)
    {
        System.out.println(person.getName()  + " выплачена зарплата "+salar);
    }

    /**
     * @param persons Название переменной которая содержит массив данных о людях
     * @param <T> Должность людей (тип данных)
     * @return Среднее значение лет
     */
    public static <T extends Person> Double AverageAge(List<T> persons){
        int sumAge = 0;
        int counter = 0;
        for (T person: persons) {
            sumAge += person.getAge();
            counter++;
        }
        return (double) (sumAge / counter);
    }

    // public void paySalary(Teacher person, int salar)
    // {
    //     System.out.println(person.getName()  + " выплачена зарплата "+salar);
    // }

    // public void paySalary(Student person, int salar)
    // {
    //     System.out.println(person.getName()  + " выплачена зарплата "+salar);
    // }
}
