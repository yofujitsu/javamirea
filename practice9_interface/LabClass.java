package practice9_interface;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class LabClass {
    public static Student[] arr = new Student[10];
    public void fillArray() {
        arr[0] = new Student(101, "Ramzes", 4.5);
        arr[1] = new Student(702, "Gpk", 4.8);
        arr[2] = new Student(137, "DM", 4.9);
        arr[3] = new Student(228, "Solo", 4.0);
        arr[4] = new Student(666, "Raze", 3.6);
        arr[5] = new Student(991, "Cvrsxd", 3.3);
        arr[6] = new Student(431, "Daxao", 3.9);
        arr[7] = new Student(212, "Ame", 5.0);
        arr[8] = new Student(725, "Gojira", 4.3);
        arr[9] = new Student(322, "Laise", 3.7);
    }

    public LabClass () {
        fillArray();
    };

    public Student[] getArr() {
        return arr;
    }

    static void sort(Comparator<Student> comp) {
        arr = qsort(arr, 0, arr.length - 1, comp);
    }
    static Student findStudent(String name) throws RuntimeException {
        if (name.equals("")) {
            throw new EmptyStringException("An empty input was entered", new IllegalArgumentException());
        }
        for (Student target : arr) {
            if (target.getName().equals(name)) {
                return target;
            }
        }
        throw new StudentNotFoundException("Such student is not found in the database", new NoSuchElementException());
    }
    static class SortingStudentsByGPA implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.getGPA(), a.getGPA());
        }
    }
    static class SortingStudentsById implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Integer.compare(a.getId(), b.getId());
        }
    }
    static class SortingStudentsByName implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            char aChar = a.getName().charAt(0);
            char bChar = b.getName().charAt(0);
            for (int i = 0; (i < a.getName().length()) && (i < b.getName().length()); ++i) { //do until one of the words ends
                aChar = a.getName().charAt(i);
                bChar = b.getName().charAt(i);
                if (((int) aChar - (int) bChar) == 0) { //go to next letter if letters are equal
                    continue;
                }
                return (int) aChar - (int) bChar;
            }
            return (int) aChar - (int) bChar;
        }
    }

    static private Student[] qsort(Student[] array,
                                   int left,
                                   int right,
                                   Comparator<Student> comp) {
        int ll = left;
        int rr = right;

        if (rr > ll) {
            Student pivot = array[(ll + rr) / 2];
            while (ll <= rr) {
                while (ll < right && comp.compare(array[ll], pivot) < 0) {
                    ll += 1;
                }
                while (rr > left && comp.compare(array[rr], pivot) > 0) {
                    rr -= 1;
                }
                if (ll <= rr) {
                    swap(array, ll, rr);
                    ll += 1;
                    rr -= 1;
                }
            }
            if (left < rr) {
                qsort(array, left, rr, comp);

            }
            if (ll < right) {
                qsort(array, ll, right, comp);
            }
        }
        return array;
    }

    static void swap(Student[] arr, int l, int r) {
        Student t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}
