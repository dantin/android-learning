package com.example.HelloDroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity extends Activity {
    private TextView message;
    private ImageView droid;
    private View.OnClickListener droidTapListener;
    private int counter = 0;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        initializeApp();
    }

    private void initializeApp() {
        this.message = (TextView) findViewById(R.id.message);
        this.droid = (ImageView) findViewById((R.id.imageView));

        this.droidTapListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapDroid();
            }
        };
        this.droid.setOnClickListener(this.droidTapListener);
    }

    private void tapDroid() {
        counter++;
        String temp;
        switch (counter) {
            case 1:
                temp = "once";
                break;
            case 2:
                temp = "twice";
                break;
            default:
                temp = String.format("%d times", counter);
        }
        message.setText(String.format("You touched the droid %s", temp));
    }
}
