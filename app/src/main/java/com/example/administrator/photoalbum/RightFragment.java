package com.example.administrator.photoalbum;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class RightFragment extends Fragment {
    ImageView mImage;

    public void setData(int resId) {
        mImage.setImageResource(resId);
    }
    @Override
    public View onCreateView (@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        View view =inflater.inflate(R.layout.fragment,container);
        mImage = view.findViewById(R.id.image_view);
        return view;
    }
}
