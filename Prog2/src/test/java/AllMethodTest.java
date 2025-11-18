import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllMethodTest {

    private Student student;
    private Course course;
    private Exam exam1;
    private Exam exam2;
    private AllMethod all;

    private Instant t0;
    private Instant t1;
    private Instant t2;

    @BeforeEach
    void setup() {
        t0 = Instant.parse("2024-01-01T00:00:00Z");
        t1 = Instant.parse("2024-01-02T00:00:00Z");
        t2 = Instant.parse("2024-01-03T00:00:00Z");
        student = new Student(1, "Doe", "John", "2000-01-01",
                "john@test.com", "0000", "A1", null);
        course = new Course(10, "Math", 5, null, List.of());
        exam1 = new Exam(100, "DS1", course, "2024-01-10", 2, List.of());
        exam2 = new Exam(101, "DS2", course, "2024-01-12", 3, List.of());
        course.getExams().add(exam1);
        course.getExams().add(exam2);
        Grade g1 = new Grade(student, 10.0);
        Grade g2 = new Grade(student, 8.0);
        g1.getHistory().add(new GradeHistory(10.0, 12.0, "Correction", t1));
        g1.getHistory().add(new GradeHistory(12.0, 14.0, "Re-evaluation", t2));
        g2.getHistory().add(new GradeHistory(8.0, 9.0, "Correction", t2));
        exam1.getGrades().add(g1);
        exam2.getGrades().add(g2);

        all = new AllMethod();
    }

    @Test
    void testGetExamGrade_beforeAnyChange() {
        double grade = all.getExamGrade(exam1, t0);
        assertEquals(10.0, grade);
    }

    @Test
    void testGetExamGrade_afterFirstChange() {
        double grade = all.getExamGrade(exam1, t1);
        assertEquals(12.0, grade);
    }

    @Test
    void testGetExamGrade_afterSecondChange() {
        double grade = all.getExamGrade(exam1, t2);
        assertEquals(14.0, grade);
    }

    @Test
    void testGetCourseGrade() {
        double result = all.getCourseGrade(course, t2);
        assertEquals(11.0, result);
    }
}
