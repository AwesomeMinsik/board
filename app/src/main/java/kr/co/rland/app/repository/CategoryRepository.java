package kr.co.rland.app.repository;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.app.entity.Category;


@Mapper
public interface CategoryRepository {
    List<Category> findAllCategory();

    void save(Category category);
    void update(Category category);
    void delete(long id);
}
