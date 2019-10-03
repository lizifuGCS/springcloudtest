package com.qst.mapper;

import com.qst.entity.Menu;

import java.util.List;

public interface MenuRepository {

    int count();

    List<Menu> findAll(int i, int limit);

    void save(Menu menu);

    Menu findById(long id);

    void update(Menu menu);

    void deleteById(long id);
}
