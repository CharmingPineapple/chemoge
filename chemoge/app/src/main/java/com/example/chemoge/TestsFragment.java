package com.example.chemoge;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class TestsFragment extends Fragment {

    TestDBHelper testDBHelper;

    TestAdapter testAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tests, container, false);

        // getContext or getActivivty???
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        RecyclerView recyclerTest = (RecyclerView) view.findViewById(R.id.id_RV_test);
        testAdapter = new TestAdapter();
        recyclerTest.setAdapter(testAdapter);
        recyclerTest.setLayoutManager(layoutManager);

        return view;
    }
}