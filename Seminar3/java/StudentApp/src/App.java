import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Domain.GroupComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);
        Student s7 = new Student("Вася",  27);

        List<Student> listStud1 = new ArrayList<>();
        List<Student> listStud2 = new ArrayList<>();
        List<Student> listStud3 = new ArrayList<>();

        listStud1.add(s1);
        listStud1.add(s2);
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        listStud3.add(s7);

        StudentGroup group1 = new StudentGroup(listStud1, 1);
        StudentGroup group2 = new StudentGroup(listStud2, 2);
        StudentGroup group3 = new StudentGroup(listStud3, 3);

        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        StudentStream stream = new StudentStream(groups, 1);

        System.out.println(stream);
        Collections.sort(stream.getStudentStream());

        System.out.println("====================================");
        System.out.println(stream);

        Comparator<StudentGroup> comp = new GroupComparator();
        Collections.sort(stream.getStudentStream(), comp);

        System.out.println("====================================");
        System.out.println(stream);

    }
}
