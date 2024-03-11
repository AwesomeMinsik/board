package kr.co.rland.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.co.rland.app.entity.Menu;
import kr.co.rland.app.entity.MenuView;
import kr.co.rland.app.repository.MenuRepository;

@Service
public class MenuServiceImp implements MenuService {
  
  @Autowired
    private MenuRepository repository;

    // @Override
    // public List<Menu> getlist() {
		// List<Menu> list = repository.findAll();
		// return list;
    // }
    
    @Override
    public List<MenuView> getlist(Integer page){
      return getlist(page,null,null);
    }
    
    @Override
    public List<MenuView> getlist(Integer page,Long id) {
      return getlist(page,id,null);
    }

    @Override
    public List<MenuView> getlist(Integer page,String query) {
      // List<MenuView> list= repository.findAll(null,query,1);
      return getlist (page,null,query);
    }
    
    // service 집중화 조건식에 따라 인자값이 다른 getlist()를 반환한다

    public List<MenuView> getlist(Integer page,Long id, String query) {
      int size = 6;
      int offset = (page-1)*size;
      List<MenuView> list = repository.findAll(id, query,offset,size); //반환해서 사용할 인자값
      return list;
    }

    //------------------------------------------------------//
    @Override
    public Menu get(long id) {
      Menu menu = repository.findById(id);
      return menu;
    }


    // @Override
    // public List<MenuView> getSearchMenu(String name) {

    //   List<MenuView>menu=repository.findBySearchId(name);

    //   return menu;
    // }


    //--------------------------count 구하는 함수---------------//

    public Long getCount(Long id, String query) {
      
      Long count = repository.Count(id,query);

      return count;
    }

    @Override
    public Long getCount(Long id) {
      
      return repository.Count(id,null);
    }

    @Override
    public Long getCount(String query) {
      return repository.Count(null,query);

    }

    @Override
    public Long getCount() {
      return repository.Count(null,null);
    }



}
