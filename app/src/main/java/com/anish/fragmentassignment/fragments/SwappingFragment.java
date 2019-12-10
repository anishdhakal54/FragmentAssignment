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
public class SwappingFragment extends Fragment implements View.OnClickListener {
    private EditText etnumber1,etnumber2;
    private Button btnSwap;

    public SwappingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);
        etnumber1 = view.findViewById(R.id.etnumber1);
        etnumber2=view.findViewById(R.id.etnumber2);
        btnSwap = view.findViewById(R.id.btnSwap);

        btnSwap.setOnClickListener(this);

        return view;    }


    @Override
    public void onClick(View v) {

    }
}
