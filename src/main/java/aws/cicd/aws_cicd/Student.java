package aws.cicd.aws_cicd;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

  private String id;

  private String name;
}
