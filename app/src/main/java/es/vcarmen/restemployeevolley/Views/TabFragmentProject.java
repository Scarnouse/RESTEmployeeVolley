package es.vcarmen.restemployeevolley.Views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.vcarmen.restemployeevolley.R;

/**
 * Created by Lolo on 17/01/2017.
 */

public class TabFragmentProject extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment_project, container, false);
    }
}
