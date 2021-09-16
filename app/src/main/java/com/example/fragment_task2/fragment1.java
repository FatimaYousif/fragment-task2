package com.example.fragment_task2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment1 extends Fragment {

    String s1[] ={"one","two","three"};
    public fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_fragment1, container, false);

        //recyclerview
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));

        adapter myAdapter=new adapter(container.getContext(),s1);
        recyclerView.setAdapter(myAdapter);
        // Inflate the layout for this fragment
        return view;
    }
}