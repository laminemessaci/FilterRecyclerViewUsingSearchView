package com.lamine.filterrecyclerviewusingsearchview.events;

import com.lamine.filterrecyclerviewusingsearchview.model.Country;

/**
 * Created by Lamine MESSACI on 02/03/2020.
 */
public class DeleteCountryEvent {

    /**
     * Country to delete
     */
    public Country mCountry;

    /**
     * Constructor
     * @param country
     */
    public DeleteCountryEvent (Country country) { mCountry = country; }
}
