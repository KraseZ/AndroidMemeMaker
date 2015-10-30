package com.example.krase.meme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment{

    TopListener activityCommander;

    public interface TopListener {
        void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopListener) activity;
        }catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    private static EditText topText;
    private static EditText bottomText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        topText = (EditText) view.findViewById(R.id.topText);
        bottomText = (EditText) view.findViewById(R.id.bottomText);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }

    public void buttonClicked(View view) {
        activityCommander.createMeme(topText.getText().toString(), bottomText.getText().toString());
    }
}
