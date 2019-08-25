package study.api.demo.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.*;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User Á¤º¸")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User {
    private String id;
    private String nicName;

}