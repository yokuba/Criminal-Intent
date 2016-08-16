package com.aliciamaclennan.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by amac on 8/15/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
