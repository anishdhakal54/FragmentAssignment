package com.anish.fragmentassignment.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.anish.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {
        private Button btnSimpleinterest;
        private EditText etPrinciple,etRate,etInterest;

    public SimpleInterestFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);
        etPrinciple = view.findViewById(R.id.etPrinciple);
        etRate = view.findViewById(R.id.etRate);
        etInterest = view.findViewById(R.id.etInterest);
        btnSimpleinterest = view.findViewById(R.id.btnSimpleinterest);

        btnSimpleinterest.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
