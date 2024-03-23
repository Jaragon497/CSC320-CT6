import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // List of students added to array
        students.add(new Student(22, "Julian", "9413 W Main St"));
        students.add(new Student(21, "Johnny", "741 E 4th Ave"));
        students.add(new Student(20, "Frank", "3214 Montgomery Dr"));
        students.add(new Student(28, "Ian", "5011 W Monaco Cir"));
        students.add(new Student(25, "Sophia", "2212 16th, St"));
        students.add(new Student(29, "Chelsea", "4433 Calico Dr"));
        students.add(new Student(26, "Jodi", "887 Post Ave"));
        students.add(new Student(24, "Victor", "672 Marietta Dr"));
        students.add(new Student(27, "Sandra", "1717 Maple Lane"));
        students.add(new Student(23, "Ashley", "9876 Jasmine Cir"));

        MergeSort.mergeSort(students, new RollComparator());

        for (Student s : students){
            System.out.println(s);
        }
    }
}
