package com.example.mytask.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytask.R;
import com.example.mytask.adapters.ArticleAdapter;
import com.example.mytask.model.ArticlesItem;
import com.example.mytask.viewmodel.ArticleViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

        ArticleViewModel articleViewModel;
        private RecyclerView articleRecyclerView;
        private RecyclerView.LayoutManager layoutManager;
        private ArticleAdapter adapter;
        private ArrayList<ArticlesItem> articleArrayList=new ArrayList<>();
        private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getArticles();




    }

    private void getArticles()
    {
        articleViewModel.getArticlesData().observe(this,articleResponse -> {

            if (articleResponse != null && articleResponse.getResults() !=null && !articleResponse.getResults().isEmpty())
            {
                progressBar.setVisibility(View.GONE);
                List<ArticlesItem> articleList= articleResponse.getResults();
                articleArrayList.addAll(articleList);
                adapter.changeData(articleArrayList);
            }
        });
    }

    private void init()
    {
        progressBar=findViewById(R.id.progress_bar);
        articleRecyclerView=findViewById(R.id.main_recycler_view);
        articleRecyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        articleRecyclerView.setLayoutManager(layoutManager);
        adapter=new ArticleAdapter(this,articleArrayList);
        articleRecyclerView.setAdapter(adapter);
        articleViewModel=new ViewModelProvider(this).get(ArticleViewModel.class);
    }
}

