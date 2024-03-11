package kr.co.rland.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.co.rland.app.entity.Category;
import kr.co.rland.app.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    private CategoryRepository repository;
    
    @Override
    public List<Category> getCoffeeList(){
        List<Category> coffeeList = repository.findAllCategory();
        return coffeeList;

    }
    

    
}
