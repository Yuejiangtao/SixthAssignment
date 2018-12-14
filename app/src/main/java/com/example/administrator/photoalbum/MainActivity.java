package com.example.administrator.photoalbum;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Tilemap> tilemapList = new ArrayList<>();
    private RightFragment rightFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] imageIds={R.drawable.ic_cat,R.drawable.ic_dog,R.drawable.ic_monkey,R.drawable.ic_elephant,
                R.drawable.ic_lion,R.drawable.ic_tiger,R.drawable.ic_snake,R.drawable.ic_hippo,R.drawable.ic_crocodile,
                R.drawable.ic_eagle,R.drawable.ic_parrot,R.drawable.ic_panda,R.drawable.ic_deer};
        initTilemaps();
        rightFragment=(RightFragment) getSupportFragmentManager().findFragmentById(R.id.fm_1);
        RecyclerView recyclerView = findViewById(R.id.recylcer_view1);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        TilemapAdapter adapter = new TilemapAdapter(tilemapList, new Mainlistener() {
            @Override
            public void onClick(int i) {
                rightFragment.setData(imageIds[i]);
            }
        });
        recyclerView.setAdapter(adapter);

    }

    private void initTilemaps() {
        Tilemap cat = new Tilemap("猫");
        tilemapList.add(cat);
        Tilemap dog = new Tilemap("狗");
        tilemapList.add(dog);
        Tilemap monkey = new Tilemap("猴子");
        tilemapList.add(monkey);
        Tilemap elephant = new Tilemap("大象");
        tilemapList.add(elephant);
        Tilemap lion = new Tilemap("狮子");
        tilemapList.add(lion);
        Tilemap tiger = new Tilemap("老虎");
        tilemapList.add(tiger);
        Tilemap snake = new Tilemap("蛇");
        tilemapList.add(snake);
        Tilemap hippo = new Tilemap("河马");
        tilemapList.add(hippo);
        Tilemap crocodile = new Tilemap("鳄鱼");
        tilemapList.add(crocodile);
        Tilemap eagle = new Tilemap("老鹰");
        tilemapList.add(eagle);
        Tilemap parrot = new Tilemap("鹦鹉");
        tilemapList.add(parrot);
        Tilemap panda = new Tilemap("熊猫");
        tilemapList.add(panda);
        Tilemap deer = new Tilemap("鹿");
        tilemapList.add(deer);
    }
}
