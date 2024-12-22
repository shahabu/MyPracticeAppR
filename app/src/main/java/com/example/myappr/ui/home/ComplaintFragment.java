package com.example.myappr.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myappr.R;

public class ComplaintFragment extends Fragment {

    public ComplaintFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_complaint, container, false);

        EditText inputField = view.findViewById(R.id.et_message);
        Button send = view.findViewById(R.id.btn_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputText = inputField.getText().toString().trim();
            //  Check the condition
                if (inputText.isEmpty()) {
                    Toast.makeText(getActivity(), "You have not entered any complaint", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getActivity(), "Successfully Submitted", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}