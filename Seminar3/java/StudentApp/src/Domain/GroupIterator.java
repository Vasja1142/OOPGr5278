package Domain;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> groups;
    public GroupIterator(List<StudentGroup> groups){
        this.groups = groups;
    }


    @Override
    public boolean hasNext() {
        return counter < groups.size();
    }


    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return groups.get(counter++);
    }
}
