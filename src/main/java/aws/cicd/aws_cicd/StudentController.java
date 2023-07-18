package aws.cicd.aws_cicd;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @GetMapping("api/students/")
  public ResponseEntity<List<Student>> getStudents (){
    return ResponseEntity.status(HttpStatus.OK)
        .body(studentService.getStudents());
  }
}
