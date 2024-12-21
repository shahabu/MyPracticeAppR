package com.example.myappr.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myappr.R;

public class ContactUsFragment extends Fragment {

    public ContactUsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_us, container, false);

        ImageView call_img = view.findViewById(R.id.call_img);
        ImageView whatapp_img = view.findViewById(R.id.whatsapp_img);
        ImageView mail_img = view.findViewById(R.id.mail_img);
        ImageView x_img = view.findViewById(R.id.x_img);

        call_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+966506081110"));
                startActivity(intent);
            }
        });
        whatapp_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send/?phone=966506081110&text&app_absent=0"));
                startActivity(intent);
            }
        });
        x_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/nasil_ksa"));
                startActivity(intent);
            }
        });
        mail_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:info@nasil.sa"));
                startActivity(intent);
            }
        });


        return view;
    }
}