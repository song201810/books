package com.song.books.controller;
import com.song.books.entity.BooksUser;
import com.song.books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    /**
     * 登陆接口，先验证用户名密码
     * @param userName 用户名
     * @param passWord 密码
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestParam(value = "userName",required = true,defaultValue = "") String userName,
                        @RequestParam(value = "passWord",required = true,defaultValue = "") String passWord){
        BooksUser booksUser=userService.selectUser(userName,passWord);
        return "login";
    }

    /**
     * 注册接口
     * @param user
     * @return
     */
    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public String regist(@RequestBody BooksUser user){
        return "reg";
    }
}
