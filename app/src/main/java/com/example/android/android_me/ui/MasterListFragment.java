package com.example.android.android_me.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by User on 5/10/2017.
 */

public class MasterListFragment extends Fragment {

    private List<Integer> mImageIds = AndroidImageAssets.getAll();
    private int mListIndex;

    public MasterListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_master_list, container, false);

        GridView gridView = (GridView) v.findViewById(R.id.fragment_master_grid_view);
        gridView.setAdapter(new MasterListAdapter(getContext(), mImageIds));

        return v;
    }

}
