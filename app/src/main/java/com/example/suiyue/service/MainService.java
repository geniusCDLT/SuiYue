package com.example.suiyue.service;

import com.example.suiyue.entity.Book;
import com.example.suiyue.entity.User;

import java.util.ArrayList;

public interface MainService {
    //获取用户书架分类
    ArrayList<String> GetShelfSort(User user);
    //获取用户某书架分类下的小说列表
    ArrayList<Book> GetSortShelf(String sort);
}
