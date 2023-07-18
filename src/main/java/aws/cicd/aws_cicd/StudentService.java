package aws.cicd.aws_cicd;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private static final List<Student> students = List.of(
      new Student("01", "Công Minh"),
      new Student("02", "Hoàng Hưng")
  );

  public List<Student> getStudents() {
    return students;
  }
}
