package com.example.suiyue.service;

import com.example.suiyue.entity.Book;
import com.example.suiyue.entity.User;

import java.util.ArrayList;

public interface SearchService {
    //获取最热搜索书籍
    ArrayList<Book> GetHotBooks();
    //获取推荐搜索书籍
    ArrayList<Book> GetSuitableBooks(User user);
    //获取搜索书籍（最优and匹配）
    ArrayList<Book> GetSearchBooks(String scontent, String swhat);
}
