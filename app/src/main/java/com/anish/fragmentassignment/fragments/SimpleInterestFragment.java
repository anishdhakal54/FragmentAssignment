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

import com.anish.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {
        private Button btnSimpleinterest;
        private EditText etPrinciple,etRate,etTime;
        private TextView tvResult;

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
        etTime= view.findViewById(R.id.etTime);
        tvResult=view.findViewById(R.id.tvResult);
        btnSimpleinterest = view.findViewById(R.id.btnSimpleinterest);

        btnSimpleinterest.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etPrinciple.getText())){
            etPrinciple.setError("please enter Principal");
            return;
        }else if (TextUtils.isEmpty(etRate.getText())) {
            etRate.setError("Please enter Rate");
            return;
        }else if(TextUtils.isEmpty(etTime.getText())){
            etTime.setError("Please enter Time");
            return;
        }
        float P, T, R, Result;
        P = Float.parseFloat(etPrinciple.getText().toString());
        T = Float.parseFloat(etRate.getText().toString());
        R = Float.parseFloat(etTime.getText().toString());
        Result = P * T * R / 100;
        tvResult.setText("The Simple Interest Of the given details is: "+Result +"");

    }

    }

