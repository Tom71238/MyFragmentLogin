package com.tbrey1gmail.myfragmentlogin;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GolfCoursePicFragmant extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // specify the XML file to use for this fragmant
        View view = inflater.inflate(R.layout.golfcourse_pic, container, false);
        Log.d("GolfCoursePicFragmant","here");
        return view;
    }
}
