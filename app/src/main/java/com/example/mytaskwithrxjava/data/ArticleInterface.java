package com.example.mytaskwithrxjava.data;

import com.example.mytaskwithrxjava.model.ArticleResponse;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ArticleInterface {
    @GET("mostpopular/v2/viewed/30.json")
    Observable<ArticleResponse> getArticle(@Query("api-key") String api_key);
}
