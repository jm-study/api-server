package study.api.demo.common.controller.request;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CommonRequest {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ApiModel(description = "매크로 요청")
    public static class GetMacroApiRequest {

        @ApiModelProperty(value = "user 정보")
        private String userId;
        @ApiModelProperty(value = "매크로 번호")
        private Integer macroContentsNo;
    }
}
