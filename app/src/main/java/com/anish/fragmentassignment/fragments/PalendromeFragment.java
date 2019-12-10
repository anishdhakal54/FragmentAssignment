package com.anish.fragmentassignment.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.anish.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalendromeFragment extends Fragment implements View.OnClickListener {

    private Button btnPalindrome;
    private EditText etnumber;
    private TextView etResult;
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
        etResult=view.findViewById(R.id.tvResult);
        btnPalindrome.setOnClickListener(this);

        return view;    }


    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etnumber.getText())) {
            etnumber.setError("please enter a Number");
            return;
        }

        int num = Integer.parseInt(etnumber.getText().toString());

        int i;
        int r = 0;

        int initialNum = num;

        for (i = 0; i <= num; i++) {
            r = r * 10;
            r = r + num % 10;
            num = num / 10;
            i = 0;
        }

        if (r == initialNum) {
            etResult.setText("The number is a PALINDROME number");
        } else {
            etResult.setText("The number is NOT A PALINDROME number.");
        }

    }


    }

