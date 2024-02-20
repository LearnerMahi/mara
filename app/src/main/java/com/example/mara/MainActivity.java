package com.example.mara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.tb);
        setSupportActionBar(toolbar);
    }
   @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }
   @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId()==R.id.search){
            Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,Drawer.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.notify){
            Toast.makeText(this, "notifications", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this, Bottom.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
   }

}