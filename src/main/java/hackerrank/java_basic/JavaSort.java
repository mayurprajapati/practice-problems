package hackerrank.java_basic;

import java.util.*;

class Student2 implements Comparable<Student2> {
    private int id;
    private String name;
    private double cgpa;

    public Student2(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student2 o) {
        if (this.cgpa != o.cgpa) return Double.compare(o.cgpa, this.cgpa);
        if (!this.name.equals(o.name)) return this.name.compareTo(o.name);
        return Integer.compare(this.id, o.id);
    }
}

//Complete the code
public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student2> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student2 st = new Student2(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);
        for (Student2 st : studentList) {
            System.out.println(st.getName());
        }
    }
}



