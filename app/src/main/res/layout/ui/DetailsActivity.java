package com.example.mytask.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.mytask.R;

public class DetailsActivity extends AppCompatActivity {

    private ImageView mImage;
    private TextView mPublishedBy;
    private TextView mDate;
    private TextView mTitle;
    private TextView mDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        init();
        getDataFromIntent();
}

    private void getDataFromIntent()
    {
        Intent intent=getIntent();
        String title=intent.getStringExtra("title");
        String date=intent.getStringExtra("date");
        String publishedBy=intent.getStringExtra("publishedBy");
        String imageURL=intent.getStringExtra("imageURL");
        String description=intent.getStringExtra("description");

        mTitle.setText(title);
        mPublishedBy.setText(publishedBy);
        mDate.setText(date);
        mDescription.setText(description);
        Glide.with(this).load(imageURL).into(mImage);
    }

 private void init()
 {

     mImage = findViewById(R.id.image_details);
     mPublishedBy = findViewById(R.id.published_by_details);
     mDate = findViewById(R.id.date_details);
     mTitle = findViewById(R.id.title_details);
     mDescription = findViewById(R.id.description);
 }
 }
