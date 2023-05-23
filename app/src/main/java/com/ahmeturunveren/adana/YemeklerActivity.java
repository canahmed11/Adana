package com.ahmeturunveren.adana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.ahmeturunveren.adana.databinding.ActivityYemeklerBinding;

public class YemeklerActivity extends AppCompatActivity {
    private ActivityYemeklerBinding binding;
    public String[] yoreselYemekler = {"Adana Kebap", "Şırdan", "İçli Köfte", "Oruk", "Ali Nazik"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityYemeklerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, yoreselYemekler);
        binding.listView3.setAdapter(arrayAdapter);

        binding.listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        MainActivity.intent = new Intent(YemeklerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "kebap");
                        startActivity(MainActivity.intent);
                        break;
                    case 1:
                        MainActivity.intent = new Intent(YemeklerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "sirdan");
                        startActivity(MainActivity.intent);
                        break;
                    case 2:
                        MainActivity.intent = new Intent(YemeklerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "iclikofte");
                        startActivity(MainActivity.intent);
                        break;
                    case 3:
                        MainActivity.intent = new Intent(YemeklerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "oruk");
                        startActivity(MainActivity.intent);
                        break;
                    case 4:
                        MainActivity.intent = new Intent(YemeklerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "alinazik");
                        startActivity(MainActivity.intent);
                        break;
                }
            }
        });
    }
}