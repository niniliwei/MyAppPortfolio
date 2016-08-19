package com.niniliwei.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * onClick listener of all the buttons
     */
    public void showToast(View view) {
        Button button = (Button) view;
        // If we tap the "popular movies" button, then we will get "Popular Movies".
        // The same goes for all the other buttons.
        String appName = button.getText().toString();
        // display the Toast message
        Toast.makeText(this, appName, Toast.LENGTH_SHORT).show();
    }
}
