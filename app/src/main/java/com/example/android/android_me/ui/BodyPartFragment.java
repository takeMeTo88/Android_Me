package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by User on 5/8/2017.
 */

public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // inflate the android_me fragment layout in the fragment
        View v = inflater.inflate(R.layout.fragment_body_part, container, false);

        // get reference to ImageView in fragment's layout
        ImageView imageView = (ImageView) v.findViewById(R.id.body_part_image_view);

        // set imageView's image with placeholder value for now
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return v;

    }
}
