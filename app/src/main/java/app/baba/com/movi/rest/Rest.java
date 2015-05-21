package app.baba.com.movi.rest;

import retrofit.RestAdapter;

/**
 * Created by arsenal on 8/5/15.
 */
/*
The class that extends the REST Interface. This creates the RestInteface object
which will be used to sent the requests.
 */
public class Rest {

    //public static RestMovieSource INSTANCE;
    public final RestInterface RestApi;

    public Rest() {

        RestAdapter loginAPIRest = new RestAdapter.Builder()
                .setEndpoint("http://192.168.1.3:3000/")
                .build();

        RestApi = loginAPIRest.create(RestInterface.class);
    }
}
