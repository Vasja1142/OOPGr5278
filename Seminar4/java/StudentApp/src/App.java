
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.Employee;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }



        Teacher t1 = new Teacher("Эдуард", 50, "Доцент");
        Teacher t2 = new Teacher("Дмитрий", 53, "Преподаватель");
        Teacher t3 = new Teacher("Василий", 40, "Доцент");
        Teacher t4 = new Teacher("Игорь", 56, "Доцент");
        Teacher t5 = new Teacher("Сергей", 30, "Доцент");
        Teacher t6 = new Teacher("Владимир", 36, "Доцент");
        Employee e1 = new Employee("Федор", 35, "Дворник");

        TeacherService TS = new TeacherService();
        TS.create(t1);
        TS.create(t2);
        TS.create(t3);
        TS.create(t4);
        TS.create(t5);
        TS.create(t6);
        System.out.println(TS);

        double averageAge = AccountController.AverageAge(TS.getAll());
        System.out.printf("Средний возраст преподавателей: %.0f лет.\n", averageAge );

       // AccountController controller = new AccountController();
       // controller.paySalary(t1, 50000);
        //controller.paySalary(e1, 25000);

        //controller.paySalary(s1, 20000);
        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(e1, 50000);
        //AccountController.paySalary(s1, 50000);

    }
}
