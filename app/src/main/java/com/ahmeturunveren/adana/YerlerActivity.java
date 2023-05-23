package com.ahmeturunveren.adana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.ahmeturunveren.adana.databinding.ActivityYerlerBinding;

public class YerlerActivity extends AppCompatActivity {
    private ActivityYerlerBinding binding;

    public String[] tarihiYerler = {"Seyhan Nehri", "Taşköprü", "Adana Ulu Camii", "Tepebağ", "Ramazanoğlu Konağı"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityYerlerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, tarihiYerler);
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        MainActivity.intent = new Intent(YerlerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "seyhannehri");
                        startActivity(MainActivity.intent);
                        break;
                    case 1:
                        MainActivity.intent = new Intent(YerlerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "taskopru");
                        startActivity(MainActivity.intent);
                        break;
                    case 2:
                        MainActivity.intent = new Intent(YerlerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "ulucami");
                        startActivity(MainActivity.intent);
                        break;
                    case 3:
                        MainActivity.intent = new Intent(YerlerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "tepebag");
                        startActivity(MainActivity.intent);
                        break;
                    case 4:
                        MainActivity.intent = new Intent(YerlerActivity.this, TarihceActivity.class);
                        MainActivity.intent.putExtra("sonuc", "ramazanoglu");
                        startActivity(MainActivity.intent);
                        break;
                }
            }
        });
    }
}