package study.api.demo.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.*;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User 정보")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User {
    private String id;
    private String nicName;

}