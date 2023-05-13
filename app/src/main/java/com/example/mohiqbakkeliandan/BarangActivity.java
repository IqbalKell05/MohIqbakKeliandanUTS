package com.example.mohiqbakkeliandan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mohiqbakkeliandan.model.Barang;
import com.example.mohiqbakkeliandan.model.BarangAdapter;

import java.util.ArrayList;
import java.util.List;

public class BarangActivity extends AppCompatActivity {
    private List<Barang> listBarang = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

        // Inisialisasi RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        BarangAdapter adapter = new BarangAdapter(listBarang);
        recyclerView.setAdapter(adapter);

        // Tambahkan data barang ke list
      /*  listBarang.add(new Barang("HP", 3000000, R.drawable.img1));
        listBarang.add(new Barang("Laptop", 8000000, R.drawable.img2));
        listBarang.add(new Barang("WIFI", 350000, R.drawable.img3));
        listBarang.add(new Barang("Charrger", 300000, R.drawable.img4));
        listBarang.add(new Barang("EarPhone", 200000, R.drawable.img5));*/

        listBarang.add(new Barang("Helm Carglos", 1000000, R.drawable.helm));
        listBarang.add(new Barang("Velg V rosi", 350000, R.drawable.velg));
        listBarang.add(new Barang("Spion", 50000, R.drawable.spion));
        listBarang.add(new Barang("Knlapot CMS", 180000, R.drawable.knalpot));
        listBarang.add(new Barang("Stop Lamp", 80000, R.drawable.stoplamp));

        // Beri tahu adapter bahwa data telah berubah
        adapter.notifyDataSetChanged();
    }
}