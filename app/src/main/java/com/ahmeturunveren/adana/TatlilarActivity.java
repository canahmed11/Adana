package com.ahmeturunveren.adana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.ahmeturunveren.adana.databinding.ActivityTatlilarBinding;

public class TatlilarActivity extends AppCompatActivity {
    private ActivityTatlilarBinding binding;
    public String[] yoreselTatlilar = {"Bici Bici", "Şıllık", "Künefe", "Baklava", "Kazandibi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTatlilarBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, yoreselTatlilar);
        binding.listView4.setAdapter(arrayAdapter);

        binding.listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        MainActivity.intent = new Intent(TatlilarActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "bicibici");
                        startActivity(MainActivity.intent);
                        break;
                    case 1:
                        MainActivity.intent = new Intent(TatlilarActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "sillik");
                        startActivity(MainActivity.intent);
                        break;
                    case 2:
                        MainActivity.intent = new Intent(TatlilarActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "kunefe");
                        startActivity(MainActivity.intent);
                        break;
                    case 3:
                        MainActivity.intent = new Intent(TatlilarActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "baklava");
                        startActivity(MainActivity.intent);
                        break;
                    case 4:
                        MainActivity.intent = new Intent(TatlilarActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "kazandibi");
                        startActivity(MainActivity.intent);
                        break;
                }
            }
        });
    }
}