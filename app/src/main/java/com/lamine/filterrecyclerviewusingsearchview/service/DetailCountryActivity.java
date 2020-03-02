package com.lamine.filterrecyclerviewusingsearchview.service;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lamine.filterrecyclerviewusingsearchview.R;

public class DetailCountryActivity extends AppCompatActivity {

    public static final String COUNTRY = "COUNTRY";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_detail_country);
    }
}
