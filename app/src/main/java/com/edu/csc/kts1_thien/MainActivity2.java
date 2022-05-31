package com.edu.csc.kts1_thien;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle(data);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.data);
        textView.setText("new page"+data);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }
        return super.onOptionsItemSelected(item);
    }


}