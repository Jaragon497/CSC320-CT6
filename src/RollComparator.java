import java.util.Comparator;

class RollComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {

        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}
