package com.example.mohiqbakkeliandan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import com.example.mohiqbakkeliandan.fragment.Fragment1;
import com.example.mohiqbakkeliandan.fragment.Fragment2;
import com.example.mohiqbakkeliandan.fragment.Fragment3;
import com.example.mohiqbakkeliandan.fragment.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;


public class TabActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        // Inisialisasi Tab Layout dan ViewPager
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Tambahkan fragment ke adapter
        adapter.addFragment(new Fragment1(), "Tab 1");
        adapter.addFragment(new Fragment2(), "Tab 2");
        adapter.addFragment(new Fragment3(), "Tab 3");

        // Set adapter ke ViewPager
        viewPager.setAdapter(adapter);

        // Tambahkan ViewPager ke Tab Layout
        tabLayout.setupWithViewPager(viewPager);


    }
}
