package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChildActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        this.textView = (TextView) findViewById(R.id.tv_display);
    }

    // Do steps 6 & 7 in ChildActivity.java
    // DONE (6) Create a TextView field to display your message
    // DONE (7) Get a reference to your TextView in Java
}
