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
import android.widget.TextView;
import android.widget.Toast;

import com.anish.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArmstrongFragment extends Fragment implements View.OnClickListener {
    private Button btncalcarmstrong;
    private EditText etnumber;
    private TextView etResult;

    public ArmstrongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);

        etnumber = view.findViewById(R.id.etnumber);
        btncalcarmstrong = view.findViewById(R.id.btnArmstrong);
        etResult=view.findViewById(R.id.tvResult);
        btncalcarmstrong.setOnClickListener(this);

        return view;    }


    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(etnumber.getText().toString());
        int temp=num;
        String t=temp+"";
        int length = t.length();
        int sum = 0;
        while (temp!=0){
            int digit=temp%10;
            sum = sum+(int)Math.pow(digit, length);
            temp=temp/10;
        }
        if (sum==num){
etResult.setText("The Given number is ARMSTRONG number.");
        }else {

etResult.setText("The given number is NOT A ARMSTRONG number.");        }


    }


    }

