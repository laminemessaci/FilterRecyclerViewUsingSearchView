package com.lamine.filterrecyclerviewusingsearchview.service;

import com.lamine.filterrecyclerviewusingsearchview.model.Country;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * Created by Lamine MESSACI on 02/03/2020.
 */
public abstract  class  DummyCountryGenerator {

   public static List<Country> DUMMY_COUNTRY = Arrays.asList (

           new Country (1, "Algeria", "https://...............", "surface , number of habitant.."),
           new Country (1, "Afghanistan", "https://...............", "surface , number of habitant.."),
           new Country (1, "Angola", "https://...............", "surface , number of habitant.."),
           new Country (1, "France", "https://...............", "surface , number of habitant.."),
           new Country (1, "Algeria", "https://...............", "surface , number of habitant.."),
           new Country (1, "Algeria", "https://...............", "surface , number of habitant.."),
           new Country (1, "Algeria", "https://...............", "surface , number of habitant.."),
           new Country (1, "Algeria", "https://...............", "surface , number of habitant..")

   );

   static List<Country> generateCountry(){
       return new ArrayList<> (DUMMY_COUNTRY);
   }
}
