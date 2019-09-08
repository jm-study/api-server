package study.api.demo.common.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import study.api.demo.common.memory.*;
import study.api.demo.common.model.User;

@RestController
@Slf4j
@Api(value = "CommonController", description = "common api controller")
public class CommonController {
    //API 정의
    // id 값으로 User 정보 조회
    @ApiOperation(value = "FindUserInfo Api")
    @GetMapping(value = "/FindUserInfo/{userId}")
    public User FindUserInfoApi(@PathVariable String userId) {

        //임의 메모리 데이터 User
        UserData userData = UserData.Instance();

        System.out.println(userId);
        User user = userData.FindToIdFromUserList(userId);
        return user;
    }

    // id 값으로 User 정보 조회
    @ApiOperation(value = "AddUser Api")
    @PostMapping(value = "/AddUser")
    public String AddUserApi(@RequestBody User user) {

        //임의 메모리 데이터 User
        UserData userData = new UserData();

        boolean result = userData.AddUserList(user);

        if (result){
            return userData.toString();
        } else {
            return "";
        }
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
