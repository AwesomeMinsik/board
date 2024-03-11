package kr.co.rland.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("index")
    // @ResponseBody
    public String hello(Model model){
        // List<Menu> list = service.getlist();
        // List<MenuView> list = service.getlist(null);
        // model.addAttribute("list", list);
        return "index";
    }

}
