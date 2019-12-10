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
public class PalendromeFragment extends Fragment implements View.OnClickListener {

    private Button btnPalindrome;
    private EditText etnumber;
    public PalendromeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palendrome, container, false);
        etnumber = view.findViewById(R.id.etnumber);
        btnPalindrome= view.findViewById(R.id.btnPalindrome);

        btnPalindrome.setOnClickListener(this);

        return view;    }


    @Override
    public void onClick(View v) {

    }
}
