package study.api.demo.common.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(value = "CommonController", description = "공통 api 컨트롤러")
public class CommonController {

    @ApiOperation(value = "test Api")
    @GetMapping(value = "/test")
    public String testApi() {
        return "Hellow";
    }
}
