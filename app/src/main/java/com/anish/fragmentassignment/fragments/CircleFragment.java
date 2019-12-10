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
public class CircleFragment extends Fragment  implements View.OnClickListener {
    private Button btnareaofcircle;
    private EditText etRadius;
    private TextView tvResult;

    public CircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_circle,container,false);
        etRadius=view.findViewById(R.id.etRadius);
        btnareaofcircle = view.findViewById(R.id.btnCircle);
        tvResult=view.findViewById(R.id.tvResult);
        btnareaofcircle.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etRadius.getText())) {
            etRadius.setError("please enter a Number");
            return;
        }

        float radius = Float.parseFloat(etRadius.getText().toString());
        float area = 3.143f  * radius * radius;
        String result="The Area of the circle is:"+area+"";

        tvResult.setText(result);

        etRadius.setText("");
    }
}
