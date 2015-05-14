package app.baba.com.movi.view.activities;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.baba.com.movi.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ListOfMoviesFragment extends Fragment {

    public ListOfMoviesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_of_movies, container, false);
    }
}
