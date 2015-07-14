package com.brunobuccolo.interactivestory.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.brunobuccolo.interactivestory.R;
import com.brunobuccolo.interactivestory.model.Page;
import com.brunobuccolo.interactivestory.model.Story;


public class StoryActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        int pageIndex = intent.getIntExtra(getString(R.string.page), 0);

        final Page currentPage = Story.getPage(pageIndex);

        TextView greeting = (TextView) findViewById(R.id.storyText);
        greeting.setText(currentPage.getText());

        Button choice1 = (Button) findViewById(R.id.choice1);
        if (currentPage.getChoice1() != null) {
            choice1.setText(currentPage.getChoice1().getText());
            choice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), StoryActivity.class);
                    intent.putExtra(getString(R.string.page), currentPage.getChoice1().getPage());
                    startActivity(intent);
                }
            });
        } else {
            choice1.setVisibility(View.INVISIBLE);
        }

            Button choice2 = (Button) findViewById(R.id.choice2);
            choice2.setText(currentPage.getChoice2().getText());

            choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), StoryActivity.class);
                    intent.putExtra(getString(R.string.page), currentPage.getChoice2().getPage());
                    startActivity(intent);
                }
            });


        ImageView image = (ImageView) findViewById(R.id.image);
        image.setImageDrawable(getResources().getDrawable(currentPage.getImageId()));
    }
}
