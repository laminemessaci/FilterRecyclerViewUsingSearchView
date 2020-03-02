package com.lamine.filterrecyclerviewusingsearchview.events;

import android.content.Intent;
import android.view.View;

import com.lamine.filterrecyclerviewusingsearchview.model.Country;
import com.lamine.filterrecyclerviewusingsearchview.service.DetailCountryActivity;

import java.io.Serializable;

/**
 * Created by Lamine MESSACI on 02/03/2020.
 */
public class DetailCountryEvent {

    public Country mCountry;

    public DetailCountryEvent (Country country, View v) {
        this.mCountry = country;

        Intent intent = new Intent (v.getContext (), DetailCountryActivity.class);
        intent.putExtra (DetailCountryActivity.COUNTRY, (Serializable)mCountry);
        v.getContext ().startActivity (intent);

    }
}
