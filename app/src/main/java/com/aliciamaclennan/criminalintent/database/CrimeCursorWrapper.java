package com.aliciamaclennan.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by amac on 10/2/16.
 */

public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper (Cursor cursor){
    super(cursor);
    }
}
