package com.lifeistech.android.dev_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String name;
    String[] people={"ベイマックス","ちゅい","けんちゃん","なり"};
    String[] food={"かれー","ちゃーはん","すし","えびちり"};
    TextView nameTextView,foodTextView,verbTextView;
    ImageView imageView,imageView2,imageView3,imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView=(TextView) findViewById(R.id.nameTextView);
        foodTextView=(TextView) findViewById(R.id.foodTextView);
        verbTextView=(TextView) findViewById(R.id.verbTextView);
        //imageView=(ImageView)findViewById(R.id.imageView);
        //imageView2=(ImageView)findViewById(R.id.imageView2);
        //imageView3=(ImageView)findViewById(R.id.imageView3);
        //imageView4=(ImageView)findViewById(R.id.imageView4);
        //imageView.setImageResource(R.drawable.baymax);
        //imageView2.setImageResource(R.drawable.chui);
        //imageView3.setImageResource(R.drawable.kensan);
        //imageView4.setImageResource(R.drawable.nary);

    }

    public void serveFood(View v){
        Random rn=new Random();
        String name=people[rn.nextInt(4)];
        nameTextView.setText(name+"に");

        Random rf=new Random();
        foodTextView.setText(food[rf.nextInt(4)]+"を");

        Random r=new Random();
        if(r.nextInt(100)>50){
            verbTextView.setText("よそえませんでした");
        }
        else{
            verbTextView.setText("よそえました");
        }
    }
}
