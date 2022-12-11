package com.example.suiyue.service;

import com.example.suiyue.entity.Book;

import java.util.ArrayList;

public interface RankingListService {
    //获取分类排行榜
    ArrayList<Book> GetCategoryRank(String category);
}
