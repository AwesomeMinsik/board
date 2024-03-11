package kr.co.rland.app.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller("adminHomeController")
@RequestMapping("admin")
public class HomeController {
    
     @GetMapping("index")
    public String index(
        // HttpSession session
        // HttpServletRequest request
        @CookieValue(required = false) Long uid
        ){
        
            System.out.println(uid);
        if(uid==null)
            return "redirect:/user/signin";

        return "admin/index";
    }
//path,
//     @PostMapping("signin")
//     public String signin(
//         String username,
//         String password,
//         HttpSession session) {

//             // session.setAttribute("hi", "hello");

//         return "redirect:/index";
//     }

}
