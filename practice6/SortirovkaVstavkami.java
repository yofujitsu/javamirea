package practice6;

public class SortirovkaVstavkami {

    public static void InsertSort(Student[] students){
        int i, j;
        Student temp;
        for(i = 0; i < 5; ++i) {
            temp = students[i];
            j = i - 1;
            while(j >=0 && students[j].getId() > temp.getId()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Alex", 3.5, 1546),
                new Student("Alex", 4.5, 2202),
                new Student("Ben", 3.6, 33),
                new Student("Dima", 2.8, 412),
                new Student("Lexa", 4.9, 5)
        };

        for(int i = 0; i < 5; ++i) {
            System.out.println(students[i]);
        }

        InsertSort(students);

        System.out.println();
        for(int i = 0; i < 5; ++i) {
            System.out.println(students[i]);
        }
    }



}
