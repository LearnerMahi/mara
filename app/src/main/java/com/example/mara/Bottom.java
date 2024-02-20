package com.example.mara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Bottom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        BottomNavigationView bottomNavigationView;
        bottomNavigationView=findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.settings){
                    Toast.makeText(Bottom.this, "settings is clicked", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId()==R.id.search){
                    Toast.makeText(Bottom.this, "search is clicked", Toast.LENGTH_SHORT).show();
                }
                if(item.getItemId()==R.id.notify){
                    Toast.makeText(Bottom.this, "notifications clicked", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}