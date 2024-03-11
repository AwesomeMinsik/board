package kr.co.rland.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.app.service.MemberService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("user")
public class UserController {
    
    @Autowired
    private MemberService service;

    @GetMapping("signin")
    public String signin(){
        
        return "user/signin";
    }

    @PostMapping("signin")
    public String signin(
        String username,
        String password,
        HttpServletResponse response
        ) {


        boolean valid = service.validate(username, password);
        
        System.out.println(valid);

            if(!valid)
                return "redirect:signin?error";
            
        Cookie uidCookie = new Cookie("uid","1");
        uidCookie.setPath("/");
        Cookie usernameCookie = new Cookie("username",username);
        usernameCookie.setPath("/");
        // session.setAttribute("usename", "newlec");

        response.addCookie(uidCookie);
        response.addCookie(usernameCookie);

        return "redirect:../index";
    }
    


}
