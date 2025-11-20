import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AllMethodTest {

    @Test
    public void testGetExamGrade_WithHistory() throws Exception {
        Tutor tutor = new Tutor(1, "T", "U", "2000", "x", "y", "desc");
        Student student = new Student(1, "Test", "User", "2000", "x", "y", "G1", tutor);

        Grade grade = new Grade(student, 10);

        Instant before = Instant.now();
        Thread.sleep(50);
        grade.changeValue(15, "Correction");
        Instant after = Instant.now();

        List<Grade> grades = new ArrayList<>();
        grades.add(grade);

        Exam exam = new Exam(1, "Exam1", null, "2025", 2, grades);
        exam.getGrades().add(grade);

        AllMethod all = new AllMethod();

        double valBefore = all.getExamGrade(exam, student, before);
        double valAfter = all.getExamGrade(exam, student, after);

        assertEquals(10, valBefore);
        assertEquals(15, valAfter);
    }

    @Test
    public void testGetCourseGrade() {
        Tutor tutor = new Tutor(1, "T", "U", "2000", "x", "y", "desc");
        Student student = new Student(1, "Test", "User", "2000", "x", "y", "G1", tutor);

        Grade g1 = new Grade(student, 10);
        Grade g2 = new Grade(student, 20);

        Exam exam1 = new Exam(1, "Exam1", null, "2025", 2, new ArrayList<>());
        Exam exam2 = new Exam(2, "Exam2", null, "2025", 3, new ArrayList<>());

        exam1.getGrades().add(g1);
        exam2.getGrades().add(g2);

        List<Exam> exams = new ArrayList<>();
        exams.add(exam1);
        exams.add(exam2);

        Course course = new Course(1, "Prog2", 6, null, exams);
        course.getExams().addAll(exams);

        AllMethod all = new AllMethod();

        double result = all.getCourseGrade(course, student, Instant.now());

        assertEquals(16.0, result);
    }
}
