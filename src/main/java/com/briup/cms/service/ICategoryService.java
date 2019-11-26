package com.briup.cms.service;

import com.briup.cms.bean.Category;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface ICategoryService {

    void  saveOrupdataCategory(Category category) throws CustomerException;

    void deleteById(int id) throws CustomerException;

    Category findByid(int id) throws CustomerException;

    List<Category> findAll() throws CustomerException;

}
