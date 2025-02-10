package com.example.myappr;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TransferGoods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_goods);

    //   EdgeToEdge.enable(this); Do not use this if you want to use custom status bar color

        // Set status bar color
        Window window = getWindow();
        getWindow().setStatusBarColor(getResources().getColor(R.color.customStatusBarColor));
        // Force white status bar icons
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        // Set activity name as title (default is the activity label in AndroidManifest.xml)
        getSupportActionBar().setDisplayShowTitleEnabled(true); // Enable title
        getSupportActionBar().setTitle("Transfer Goods");  // Set Title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // show back button

        //  Change the back arrow color
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow); // Set the custom back arrow


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        EditText inputField = findViewById(R.id.et_message);
        Button sendOrder = findViewById(R.id.btn_sendOrder);
        sendOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputText = inputField.getText().toString().trim();
                //  Check the condition
                if (inputText.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter your delivery instruction", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Order submitted successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}