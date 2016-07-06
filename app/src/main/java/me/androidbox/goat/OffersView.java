package me.androidbox.goat;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class OffersView extends Fragment {
    public OffersView() {
        // Required empty public constructor
    }

    public static OffersView getNewInstance() {
        return new OffersView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.offers_view, container, false);
    }

}
