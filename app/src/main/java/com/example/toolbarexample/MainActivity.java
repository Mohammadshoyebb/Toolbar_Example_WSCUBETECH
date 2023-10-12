package com.example.toolbarexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbr;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbr = findViewById(R.id.toolbar);

        setSupportActionBar(toolbr);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Mohd ShoaiB");
        toolbr.setSubtitle("My name @shaikh");





    }

    @Override
    public boolean onCreateOptionsMenu(Menu mnu) {

        new MenuInflater(this).inflate(R.menu.menu,mnu);
        return super.onCreateOptionsMenu(mnu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        int id = item.getItemId();
        if (id == R.id.save) {
            Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.edit) {
            Toast.makeText(this, "Edited Successfully", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.neew) {
            Toast.makeText(this, "Secelect New Item", Toast.LENGTH_SHORT).show();

        } else {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}