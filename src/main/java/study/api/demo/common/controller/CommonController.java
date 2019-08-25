package study.api.demo.common.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import study.api.demo.common.model.User;

@RestController
@Slf4j
@Api(value = "CommonController", description = "공통 api 컨트롤러")
public class CommonController {

    @ApiOperation(value = "test Api")
    @GetMapping(value = "/test")
    public String testApi() {
        return "Hellow";
    }

    @ApiOperation(value = "test Api2")
    @GetMapping(value = "/test2/{userId}")
    public String testApi2(@PathVariable String userId) {
        return "Hellow "+userId;
    }


    @ApiOperation(value = "test Api3")
    @GetMapping(value = "/test3/{userId}")
    public String testApi3(@PathVariable String userId, @RequestParam(value="profile") String profile) {
        return "Hellow "+userId +" with "+profile;
    }

    @ApiOperation(value = "test Api4")
    @GetMapping(value = "/test4/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User testApi4(@PathVariable String id, User user) {
        User user2 = new User().builder()
                .id(user.getId())
                .nicName(user.getNicName())
                .build();
        return user2;
    }




}
