import java.time.Instant;
import java.util.Comparator;

public class AllMethod {

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return exam.getGrades().stream()
                .filter(g -> g.getStudent().equals(student))
                .findFirst()
                .map(grade -> {
                    return grade.getHistory().stream()
                            .filter(h -> h.getTimestamp().isBefore(t))
                            .reduce((a, b) -> b)
                            .map(GradeHistory::getNewValue)
                            .orElse(grade.getValue());
                })
                .orElse(0.0);
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        return course.getExams().stream()
                .map(exam -> {
                    double grade = getExamGrade(exam, student, t);
                    return new double[]{ grade, exam.getCoefficient() };
                })
                .filter(arr -> arr[1] > 0)
                .map(arr -> arr)
                .reduce(
                        new double[]{0.0, 0.0},
                        (acc, arr) -> {
                            acc[0] += arr[0] * arr[1];
                            acc[1] += arr[1];
                            return acc;
                        }
                )[0] / ( course.getExams().stream()
                .mapToInt(Exam::getCoefficient)
                .sum()
        );
    }

}
