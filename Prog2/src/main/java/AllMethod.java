import java.time.Instant;
import java.util.Comparator;

public class AllMethod {

    public double getExamGrade(Exam exam, Instant t) {
        return exam.getGrades()
                .stream()
                .filter(grade -> grade.getStudent().equals(this))
                .findFirst()
                .map(grade -> grade.getHistory().stream()
                        .filter(gradeHistory -> gradeHistory.getTimestamp().isBefore(t))
                        .max(Comparator.comparing(GradeHistory::getTimestamp))
                        .map(GradeHistory::getNewValue)
                        .orElse(grade.getValue()))
                .orElse(0.0);
    }

    private int getSumExamCoefficient (Course course) {
        return course.getExams()
                .stream()
                .mapToInt(Exam::getCoefficient)
                .sum();
    }

    private double getAverage (Course course, Instant t) {
        return course.getExams()
                .stream()
                .mapToDouble(exam -> getExamGrade(exam, t) * exam.getCoefficient())
                .sum();
    }

    public double getCourseGrade(Course course, Instant t) {
        return getAverage(course, t) / getSumExamCoefficient(course);
    }
}
