package com.example.zhafirtubes.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zhafirtubes.R;

// 10116336 KAIZER NUGRAHA IF-8  8/14/2019

public class About2Fragment extends Fragment {


    public About2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about2, container, false);
    }

    public interface OnFragmentInteractionListener {
    }
}
