package Domain;

import java.util.Comparator;

public class GroupComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        if(o1.getIdGroup()>o2.getIdGroup()){
            return 1;
        } else if (o1.getIdGroup()<o2.getIdGroup()) {
            return -1;
        }
        return 0;
    }
}
