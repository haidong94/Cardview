package com.example.dong.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dong.cardview.adapter.CardAdapter;
import com.example.dong.cardview.model.Model;
import com.huxq17.swipecardsview.SwipeCardsView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SwipeCardsView swipeCardsView;
    private List<Model> modelList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeCardsView= (SwipeCardsView) findViewById(R.id.cardView);
        swipeCardsView.retainLastCard(false);
        swipeCardsView.enableSwipe(true);

        getData();
    }

    private void getData() {
        modelList.add(new Model("captain",R.drawable.captain));
        modelList.add(new Model("cyclops",R.drawable.cyclops));
        modelList.add(new Model("daredevil",R.drawable.daredevil));
        modelList.add(new Model("falcon",R.drawable.falcon));
        modelList.add(new Model("leesin",R.drawable.leesin));
        modelList.add(new Model("lucian",R.drawable.lucian));
        modelList.add(new Model("spiderman",R.drawable.spiderman));

        CardAdapter cardAdapter=new CardAdapter(modelList,MainActivity.this);
        swipeCardsView.setAdapter(cardAdapter);
    }
}
