package kr.co.rland.app.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.app.entity.Menu;
import kr.co.rland.app.entity.MenuView;

@Mapper
public interface MenuRepository {
    
    List<MenuView> findAll(Long id, String query, int offset, int size);

    Menu findById(long id);

    Long Count(Long id, String query);
    // void save(Menu menu);
    // void udate(Menu menu);
    // void delete(Long id);
}
