package kr.co.rland.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.rland.app.entity.Category;
import kr.co.rland.app.entity.Menu;
import kr.co.rland.app.entity.MenuView;
import kr.co.rland.app.service.CategoryService;
import kr.co.rland.app.service.MenuService;


@Controller
@RequestMapping("menu")
public class MenuController  {

    @Autowired
    private MenuService service;
    @Autowired
    private CategoryService categoryserv;

    @GetMapping("list")
    public String list(
        @RequestParam(name="Id",required = false)Long id ,
        @RequestParam(name="q",required = false)String query ,
        @RequestParam(name="p",required = false,defaultValue = "1")Integer page ,//페이지 요청 추가
        Model model){
        Long count = null;

            List<MenuView> list = new ArrayList<>();

            if(id != null){
            list = service.getlist(page,id);
            count = service.getCount(id);
            }  
            else if (query != null){
                list = service.getlist(page,query);
                count = service.getCount(query);
            }
            else{
                list = service.getlist(page);
                count = service.getCount();
            }
            
            
            List<Category> categoryList = categoryserv.getCoffeeList();
        


        //오버로딩 장단점
        model.addAttribute("list", list);
        model.addAttribute("ctg", categoryList);
        
        model.addAttribute("qq",id);
        model.addAttribute("count",count);

        return "menu/list";
    }
    
    // @GetMapping("search")
    // public String list(@RequestParam(name="ss",required = false)String name ,Model model){
        
    //     List<MenuView> searchedMenu = service.getSearchMenu(name);
    //     List<Category> categoryList = categoryserv.getCoffeeList();

    //     model.addAttribute("ctg", categoryList);
    //     model.addAttribute("list", searchedMenu);
    //     return "menu/list";
    // }

    
    @GetMapping("detail")
    public String detail(@RequestParam("MENUid") long ctgId,Model model){
        System.out.println(ctgId);
        Menu menu = service.get(ctgId);
        model.addAttribute("menu",menu);
        return "menu/detail";
    }



}
