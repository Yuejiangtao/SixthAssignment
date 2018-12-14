package com.example.administrator.photoalbum;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TilemapAdapter extends RecyclerView.Adapter<TilemapAdapter.ViewHolder> {
    private List<Tilemap> mTilemapList;
    private Mainlistener mainlistener;

    public TilemapAdapter(List<Tilemap> tilemapList,Mainlistener mainlistener) {
        mTilemapList = tilemapList;
        this.mainlistener=mainlistener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tilemap, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final int i) {
        Tilemap tilemap = mTilemapList.get(i);
        viewHolder.tilemapname.setText(tilemap.getName());
        viewHolder.tilemapname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainlistener.onClick(i);
//                Toast.makeText(v.getContext(),mTilemapList.get(i).getName(),Toast.LENGTH_SHORT).show();
//                List<RightFragment>  fragmentList =new ArrayList<>();
//                RightFragment rightFragment =new RightFragment();
//                int[] imageIds={R.drawable.ic_cat,R.drawable.ic_dog,R.drawable.ic_monkey,R.drawable.ic_elephant,
//                R.drawable.ic_lion,R.drawable.ic_tiger,R.drawable.ic_snake,R.drawable.ic_hippo,R.drawable.ic_crocodile,
//                        R.drawable.ic_eagle,R.drawable.ic_parrot,R.drawable.ic_panda,R.drawable.ic_deer};
//                rightFragment.setData(imageIds[i]);
//                fragmentList.add(rightFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTilemapList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        View tilemapView;
        TextView tilemapname;

        ViewHolder(View view) {
            super(view);
            tilemapView = view;
            tilemapname = view.findViewById(R.id.tv_sort);
        }
    }
}
