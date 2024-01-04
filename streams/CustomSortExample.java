package learn.java.streams;

import learn.java.data.Student;
import learn.java.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSortExample {
    public static List<Student> getSortedList() {
        return StudentDatabase.getStudentList()
                .stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
    }

    public static List<String> getSortedActivitiesList() {
        return StudentDatabase.getStudentList()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(StudentDatabase.getStudentList().stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(StudentDatabase.getStudentList().stream()
                .map(Student::getGrade)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList()));

        System.out.println(getSortedList());
        System.out.println(getSortedActivitiesList());
    }
}
