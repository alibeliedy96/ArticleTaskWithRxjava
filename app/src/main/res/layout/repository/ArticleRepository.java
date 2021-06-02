package com.example.mytaskwithrxjava.repository.;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mytask.constant.AppConstant;
import com.example.mytask.data.ArticleClient;
import com.example.mytask.data.ArticleInterface;
import com.example.mytask.model.ArticleResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleRepository {

    private final ArticleInterface articleInterface;

    public ArticleRepository()
    {
    articleInterface=ArticleClient.getApi();
    }

    public LiveData<ArticleResponse> getArticle()
    {
       final MutableLiveData<ArticleResponse> data=new MutableLiveData<>();

       articleInterface.getArticle(AppConstant.API_KEY).enqueue(new Callback<ArticleResponse>() {
           @Override
           public void onResponse(Call<ArticleResponse> call, Response<ArticleResponse> response) {
               if (response.body()!=null && response.isSuccessful())
               {
                   data.setValue(response.body());


               }
           }

           @Override
           public void onFailure(Call<ArticleResponse> call, Throwable t) {
                data.setValue(null);
           }
       });
       return data;
    }
}
