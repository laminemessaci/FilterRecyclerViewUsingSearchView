package com.lamine.filterrecyclerviewusingsearchview.service;

import com.lamine.filterrecyclerviewusingsearchview.model.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lamine MESSACI on 02/03/2020.
 */
public class DummyCountryApiService  implements CountryApiService{

    private List<Country> mCountryList = DummyCountryGenerator.generateCountry ();

    @Override
    public List<Country> getCountry () {
        return mCountryList;
    }

    @Override
    public void deleteCountry (Country country) {
        mCountryList.remove (country);

    }

    @Override
    public void addCountryFavorite (Country country) {
        mCountryList.get (mCountryList.indexOf (country)).setFavorite(true);

    }

    @Override
    public Boolean isFavorite (Country country) {
        return mCountryList.get (mCountryList.indexOf (country)).getFavorite ();
    }

    @Override
    public List<Country> getFavoriteCountry () {
        List<Country> favoriteCountry = new ArrayList<> ();
        for (Country fav : mCountryList){
            if (fav.getFavorite ()){
                favoriteCountry.add(fav);
            }
        }
        return favoriteCountry;
    }

    @Override
    public void rmoveFavoriteCountry (Country country) {
        mCountryList.get (mCountryList.indexOf (country)).setFavorite (false);

    }

    @Override
    public void createCountry (Country country) {
        mCountryList.add (country);

    }
}
