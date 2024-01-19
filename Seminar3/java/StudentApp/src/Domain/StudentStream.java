package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private Integer numberStream;

    public List<StudentGroup> getStudentStream() {
        return studentStream;
    }

    private List<StudentGroup> studentStream;

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    public StudentStream(List<StudentGroup> studentStream, Integer numberStream){
        this.studentStream = studentStream;
        this.numberStream = numberStream;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(studentStream);
    }

    @Override
    public String toString() {
        return "Номер потока: " + numberStream +
                "\n" + studentStream +
                "\n";
    }
}
