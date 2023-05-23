package com.ahmeturunveren.adana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.ahmeturunveren.adana.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    public static Intent intent;
    public String[] menu = {"Adana Tarihçesi", "Adanada Bulunan Tarihi Yerler", "Adana Yöresel Yemekleri", "Adana Yöresel Tatlıları"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, menu);
        binding.listView2.setAdapter(arrayAdapter);

        binding.listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, TarihceActivity.class);
                        intent.putExtra("sonuc", "tarihce");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, YerlerActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, YemeklerActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, TatlilarActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}