package com.lamine.filterrecyclerviewusingsearchview.model;

import android.annotation.SuppressLint;

import java.io.Serializable;
import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by Lamine MESSACI on 02/03/2020.
 */
public class Country implements Serializable {
    //Identifier
    private long mId;
    //Full name
    private String mName;
    //Avatar
    private String mAvatarUrl;
    //About me
    private String mAboutMe;
    //favorite
    private Boolean mFavorite;

    public Country (long id, String name, String avatarUrl, String aboutMe) {
        mId = id;
        mName = name;
        mAvatarUrl = avatarUrl;
        mAboutMe = aboutMe;
        this.mFavorite = false;
    }

    //Getter
    public long getId () {
        return mId;
    }

    public String getName () {
        return mName;
    }

    public String getAvatarUrl () {
        return mAvatarUrl;
    }

    public String getAboutMe () {
        return mAboutMe;
    }

    //Setter
    public void setId (long id) {
        mId = id;
    }

    public void setName (String name) {
        mName = name;
    }

    public void setAvatarUrl (String avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    public void setAboutMe (String aboutMe) {
        mAboutMe = aboutMe;
    }

    public Boolean getFavorite () {
        return mFavorite;
    }


    @SuppressLint ("NewApi")
    @Override
    public boolean equals (@Nullable Object obj) {
        if (this == null || getClass () != obj.getClass ()) return false;
        Country country = (Country) obj;
        return Objects.equals (mId, country.mId);
    }

    @Override
    public int hashCode () {
        return super.hashCode ();
    }


    public void setFavorite (boolean b) {
        this.mFavorite = b;

    }
}


