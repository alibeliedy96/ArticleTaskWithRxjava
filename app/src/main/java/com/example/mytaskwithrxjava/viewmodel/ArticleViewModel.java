package com.example.mytaskwithrxjava.viewmodel;



import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mytaskwithrxjava.model.ArticleResponse;
import com.example.mytaskwithrxjava.repository.ArticleRepository;


public class ArticleViewModel extends ViewModel {

    private ArticleRepository articleRepository;
    private LiveData<ArticleResponse> articleResponseLiveData;

    public ArticleViewModel()
    {

        articleRepository=new ArticleRepository();
        articleResponseLiveData=articleRepository.getArticle();
    }

    public LiveData<ArticleResponse> getArticlesData()
    {
        return articleResponseLiveData;
    }

}