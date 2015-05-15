package app.baba.com.movi.view.activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.baba.com.movi.R;
import app.baba.com.movi.rest.Login;
import app.baba.com.movi.rest.MovieWrapper;

/**
 * A placeholder fragment containing a simple view.
 */
public class ListOfMoviesFragment extends Fragment {

    ArrayAdapter<String> abc;
    public ListOfMoviesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_of_movies, container, false);
        String[] populate = {"dassa", "dsadsa", "dsadsa", "fsafas", "dsfdsfd", "fdhfdgf", "yuguyg"};
        List<String> week_forecast = new ArrayList<String>(Arrays.asList(populate));
        abc = new ArrayAdapter<String>(getActivity(), R.layout.list_movie_item, week_forecast);
        ListView listView = (ListView) rootView.findViewById(R.id.listView_movies);
        listView.setAdapter(abc);
        GetMovies a=new GetMovies();
        a.execute();
        return rootView;
    }

    public class GetMovies extends AsyncTask<Void,Void,List<String>>{
        @Override
        public List<String> doInBackground(Void ... params){
            Login abc=new Login();
            try {
                List<MovieWrapper> movie_list = abc.loginDBApi.get_movie();
                List<String> res=new ArrayList<String>();
                String x="";
                for(MovieWrapper m:movie_list)
                {
                    res.add(m.getName());
                    x+=m.getName()+" ";
                }
                Log.e("GetMovies", x);
                return res;
            }
            catch(Exception e)
            {
                Log.e("GetMovies", "Not able to fetch String");
            }
            return null;
        }

        @Override
        public  void onPostExecute(List<String> result)
        {
            Log.e("GetMovies", "Hell yeah");
            if(result!=null)
            {
                abc.clear();
                for(String str:result) {
                    abc.add(str);
                }
            }
        }

    }
}
