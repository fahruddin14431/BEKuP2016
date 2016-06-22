package com.fahruddin.bekupdua;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Fahruddin on 6/21/2016.
 */
public class ListviewAdapeter extends ArrayAdapter<String> {

    public ListviewAdapeter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

}
