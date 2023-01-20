package com.springmvc_maven.controller.user;

import com.springmvc_maven.service.user.UserService;
import com.springmvc_maven.vo.user.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//REST Contoller vs Controller 차이
/*
 * Controller 는 요청을 보내고 응답을 받는 기능
 *   (Controller는 주로 View를 반환하기 위해 사용한다.)
 * REST Controller는 REST API를 사용하여 요청만 보내는 기능
 *  ->
 *
 * */
@Controller
/* 메인, 사용자 관련 */
public class UserController {

    @Autowired
    UserService userService;
/*
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
*/

    /**
     * 메인 화면
     *
     * @return
     */
    @RequestMapping("/")
    public String main() {
        return "main";
    }

    /**
     * 로그인 단순 화면 요청
     * @param request
     * @return
     */
    @RequestMapping(value = "/loginView", method = RequestMethod.GET)
    public String loginView() {
        return "/user/login";
    }

    /**
     * 회원가입 단순 화면 요청
     *
     * @return
     */
    @RequestMapping(value = "/registerUserView", method = RequestMethod.GET)
    public String registerUserView() {
        return "/user/registerUser";
    }

    /**
     * 회원가입 등록 요청
     *
     * @param userInfo : 입력받은 정보 VO
     * @param model    : 회원가입 결과 메세지 전달
     * @return
     */
    @RequestMapping(value = "/user/registerAsk", method = RequestMethod.POST)
    public String registerAsk(@ModelAttribute UserInfoVO userInfo, Model model) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        userInfo.setUserInitTime(date.format(new Date()));
        // 회원정보 및 디폴트 권한 입력
        boolean result = userService.insertUserInfo(userInfo);
        if (result) {
            model.addAttribute("loginMsg", "회원 가입이 완료되었습니다. 로그인해주세요");
            return "/main";

        } else {
            model.addAttribute("registerUserMsg", "이미 존재하는 아이디입니다.");
            return "/user/registerUser";
        }
    }

    /**
     * 회원정보 조회 요청
     *
     * @param model : 회원정보 전달
     * @return
     */
    @RequestMapping(value = "/user/userInfoAsk", method = RequestMethod.GET)
    public String userInfoAsk(Model model, String userId) {
        if (userService.selectUserInfoOne(userId) != null) {
            UserInfoVO userInfo = userService.selectUserInfoOne(userId);
            model.addAttribute("userInfo", userInfo);
            return "/user/userInfo";
        } else {
            model.addAttribute("confirmMsg", "사용자 없음");
            return "/user/userInfo";
        }
    }

    @RequestMapping(value = "/user/userListLAll", method = RequestMethod.GET)
    @ResponseBody
    public String userListLAll() {
//        System.out.println(userService.selectUserInfoList());
        userService.selectUserInfoList().forEach(System.out::println);
        return "";
    }


    @RequestMapping(value = "/user/uniqueUserInfo", method = RequestMethod.GET)
    public String uniqueUserInfo(Model model, @RequestParam("unique") String unique) {
        List<UserInfoVO> userInfoVO = userService.uniqueUserInfo(unique);
        model.addAttribute("unique", userInfoVO);
        userInfoVO.forEach(e -> System.out.println(e.getUserId()));
//        for (UserInfoVO infoVO : userInfoVO) {
//            System.out.println(infoVO.getUserName());
//        }
        return "/user/uniqueUserInfo";
    }

    /*
     *
     * 리소스를 삭제하는 데 GET 메서드를 사용하는 것은 안전하지 않고
     * 멱등성 메서드가 아니므로 권장하지 않습니다(부작용이 없어야 하며 다른 결과 없이 반복 가능해야 함).
     *  그러나 리소스를 삭제하기 위해 GET 메서드를 사용해야 하는 경우 다음과 같은 방법으로 수행할 수 있습니다.
     * JSP :  <a href="<c:url value='/users/delete/${user.id}'/>">Delete User</a>
     */
/*
    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable String id) {
        userService.deleteUserInfo(id);
        return "redirect:/users";
    }
*/

//    @DeleteMapping("/user/delete/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
//        userService.deleteUserInfo(id);
//        return ResponseEntity.noContent().build();
//    }


    @PostMapping("/user/delete/{userId}")
    @ResponseBody
    public String deleteUser(@PathVariable("userId") String userId, Model model) {
        userService.deleteUserInfo(userId);
        model.addAttribute("result", "delete success");
        return "success";
    }
}