package com.example.krase.meme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class bottomFragment extends Fragment{
    private static TextView topView;
    private static TextView bottomView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);

        topView = (TextView) view.findViewById(R.id.topView);
        bottomView = (TextView) view.findViewById(R.id.bottomView);

        return view;
    }

    public void setMemeText(String top, String bottom) {
        topView.setText(top);
        bottomView.setText(bottom);
    }
}