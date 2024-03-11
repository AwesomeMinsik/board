package kr.co.rland.app.service;

import java.util.List;



import kr.co.rland.app.entity.Menu;
import kr.co.rland.app.entity.MenuView;

public interface MenuService {

    // List<Menu> getlist();
    // List<MenuView> getlist(Long id);
    List<MenuView> getlist(Integer page);
    List<MenuView> getlist(Integer page,Long id);
    List<MenuView> getlist(Integer page,String query);
    // List<MenuView> getlist(Integer page,Long id, String query);
    // List<MenuView> getlist(int offset, int size);
    Menu get(long id);
    // List<MenuView> getSearchMenu(String name);
    
    Long getCount();
    Long getCount(Long id);
    Long getCount(String query);
    
}
