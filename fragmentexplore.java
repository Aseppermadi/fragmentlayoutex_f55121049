package com.example.F55121049;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragmentexplore extends Fragment {
    View view;
    public fragmentexplore(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle saveinstanceState){
        view = inflater.inflate(R.layout.explore_fragment, container, false);
        return view;
    }
}
