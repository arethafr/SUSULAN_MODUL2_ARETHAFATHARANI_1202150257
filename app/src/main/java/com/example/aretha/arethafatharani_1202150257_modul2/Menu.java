package com.example.aretha.arethafatharani_1202150257_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Ayam Goreng");
            foods.add("Nasi Goreng");
            foods.add("Mie Goreng");
            foods.add("Omelet");
            foods.add("Sandwich");
            foods.add("Siomay");

            priceses.add(15000);
            priceses.add(15000);
            priceses.add(15000);
            priceses.add(7000);
            priceses.add(7000);
            priceses.add(7000);

            photos.add(R.drawable.ayamgoreng);
            photos.add(R.drawable.nasigoreng);
            photos.add(R.drawable.miegoreng);
            photos.add(R.drawable.omelet);
            photos.add(R.drawable.sandwich);
            photos.add(R.drawable.siomay);
        }
    }
}
