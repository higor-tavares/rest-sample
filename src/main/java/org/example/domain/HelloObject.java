package org.example.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloObject {

  private int priority;
  private String message;
  @JsonFormat(pattern = "dd/MM/yyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
  private LocalDateTime createdAt;

}
