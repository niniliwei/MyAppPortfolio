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
     * button Popular Movies onClick listener
     */
    public void showToastPopularMovie(View view) {
        showToast((Button) view);
    }

    /**
     * button Stock Hawk onClick listener
     */
    public void showToastStockHawk(View view) {
        showToast((Button) view);
    }

    /**
     * button Build It Bigger onClick listener
     */
    public void showToastBuildItBigger(View view) {
        showToast((Button) view);
    }

    /**
     * button Make Your App Material onClick listener
     */
    public void showToastMakeYourAppMaterial(View view) {
        showToast((Button) view);
    }

    /**
     * button Go Ubiquitous onClick listener
     */
    public void showToastGoUbiquitous(View view) {
        showToast((Button) view);
    }

    /**
     * button Capstone onClick listener
     */
    public void showToastCapstone(View view) {
        showToast((Button) view);
    }

    /**
     * extracted universal showToast method
     */
    private void showToast(Button button) {
        String buttonName = button.getText().toString();
        String text = String.format("This button will launch my %s app!", buttonName);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
