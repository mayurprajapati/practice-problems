package hackerrank.java_basic;

import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */

class Student1 implements Comparable<Student1> {
    int id;
    String name;
    double cgpa;

    public Student1(int id, String name, double cgpa) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    int getID() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getCGPA() {
        return this.cgpa;
    }

    @Override
    public String toString() {
        return this.name + " " + this.cgpa + " " + this.id;
    }

    @Override
    public int compareTo(Student1 o) {
        if (this.cgpa != o.cgpa) return Double.compare(o.cgpa, this.cgpa);
        if (!this.name.equals(o.name)) return this.name.compareTo(o.name);
        return Integer.compare(this.id, o.id);
    }
}

class Priorities {
    final PriorityQueue<Student1> queue = new PriorityQueue<>();

    List<Student1> getStudents(List<String> events) {
        for (String data : events) {
            String[] split = data.split("\\s+");
            String event = split[0];
            if (event.equals("ENTER")) {
                String name = split[1];
                double cgpa = Double.parseDouble(split[2]);
                int id = Integer.parseInt(split[3]);
                Student1 s = new Student1(id, name, cgpa);
                queue.add(s);
            } else {
                queue.poll();
            }
        }

        ArrayList<Student1> arrayList = new ArrayList<>();

        while (!queue.isEmpty()) {
            arrayList.add(queue.poll());
        }
        return arrayList;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student1> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student1 st : students) {
                System.out.println(st.getName());
            }
        }
    }
}