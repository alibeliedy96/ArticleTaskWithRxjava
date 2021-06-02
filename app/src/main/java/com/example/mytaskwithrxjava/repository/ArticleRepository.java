package com.example.mytaskwithrxjava.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.example.mytaskwithrxjava.constant.AppConstant;
import com.example.mytaskwithrxjava.data.ArticleClient;
import com.example.mytaskwithrxjava.data.ArticleInterface;
import com.example.mytaskwithrxjava.model.ArticleResponse;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleRepository {

    private final ArticleInterface articleInterface;

    public ArticleRepository() {
        articleInterface = ArticleClient.getApi();
    }

    public LiveData<ArticleResponse> getArticle() {
        final MutableLiveData<ArticleResponse> data = new MutableLiveData<>();
        Observable observable = articleInterface.getArticle(AppConstant.API_KEY).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        Observer<ArticleResponse> observer = new Observer<ArticleResponse>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull ArticleResponse articleResponse) {
                data.setValue(articleResponse);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                data.setValue(null);
            }

            @Override
            public void onComplete() {

            }
        };
        observable.subscribe(observer);
        return data;
    }
}
