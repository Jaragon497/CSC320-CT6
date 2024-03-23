import java.util.Comparator;
import java.util.ArrayList;
public class MergeSort {
    public static <T> void mergeSort(ArrayList<T> list, Comparator<T> comparator) {
        // Base case
        if (list.size() <= 1) {
            return;
        }
        // Split the array at halfway
        int splitIdx = list.size() / 2;

        // Create two sub-arrays using the split
        ArrayList<T> left = new ArrayList<>(list.subList(0, splitIdx));
        ArrayList<T> right = new ArrayList<>(list.subList(splitIdx, list.size()));

        // Recursive call
        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(list, left, right, comparator);
    }

    private static <T> void merge(ArrayList<T> base, ArrayList<T> left, ArrayList<T> right, Comparator<T> comparator) {
        int leftIndex = 0, rightIndex = 0, idx = 0;

        // Move index position based on comparator
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (comparator.compare(left.get(leftIndex), right.get(rightIndex)) < 0) {
                base.set(idx++, left.get(leftIndex++));
            } else {
                base.set(idx++, right.get(rightIndex++));
            }
        }

        // Move values around
        while (leftIndex < left.size()) {
            base.set(idx++, left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            base.set(idx++, right.get(rightIndex++));
        }
    }
}