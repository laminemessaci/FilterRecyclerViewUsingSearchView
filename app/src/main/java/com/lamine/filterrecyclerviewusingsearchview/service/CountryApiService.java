package com.lamine.filterrecyclerviewusingsearchview.service;

import com.lamine.filterrecyclerviewusingsearchview.model.Country;

import java.util.List;

/**
 * Created by Lamine MESSACI on 02/03/2020.
 */
public interface CountryApiService {

    List<Country> getCountry();

    void deleteCountry(Country country);

    void addCountryFavorite(Country country);

    Boolean isFavorite(Country country);

    List<Country> getFavoriteCountry();

    void rmoveFavoriteCountry(Country country);

    void createCountry(Country country);


}
