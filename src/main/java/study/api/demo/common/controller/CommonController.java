package study.api.demo.common.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import study.api.demo.common.memory.*;
import study.api.demo.common.model.Contents;
import study.api.demo.common.model.User;
import study.api.demo.common.service.UserService;

@RestController
@Slf4j
@Api(value = "CommonController", description = "common api controller")
public class CommonController {

    @Autowired
    private UserService userService;
    //API 정의
    // id 값으로 User 정보 조회
    @ApiOperation(value = "FindUserInfo Api")
    @GetMapping(value = "/getUserInfo/{userId}")
    public User findUserInfoApi(@PathVariable String userId) {
        return userService.getUserInfo(userId);
    }

    // id 값으로 User 정보 조회
    @ApiOperation(value = "AddUser Api")
    @PostMapping(value = "/updateUser")
    public String addUserApi(@RequestBody User user) {
        return userService.addUserInfo(user);
    }

    @ApiOperation(value = "Macro Api")
    @PostMapping(value = "/macro")
    public Contents sendMacroString(@RequestBody User user) {
        return userService.sendMacroString();
    }
//
//    @ApiOperation(value = "test Api")
//    @GetMapping(value = "/test")
//    public String testApi() {
//        return "Hellow";
//    }
//
//    @ApiOperation(value = "test Api2")
//    @GetMapping(value = "/test2/{userId}")
//    public String testApi2(@PathVariable String userId) {
//        return "Hellow "+userId;
//    }
//
//
//    @ApiOperation(value = "test Api3")
//    @GetMapping(value = "/test3/{userId}")
//    public String testApi3(@PathVariable String userId, @RequestParam(value="profile") String profile) {
//        return "Hellow "+userId +" with "+profile;
//    }
//
//    @ApiOperation(value = "test Api4")
//    @GetMapping(value = "/test4/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public User testApi4(@PathVariable String id, User user) {
//        User user2 = new User().builder()
//                .id(user.getId())
//                .nicName(user.getNicName())
//                .build();
//        return user2;
//    }

}
