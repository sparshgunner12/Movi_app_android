package app.baba.com.movi.rest;

import retrofit.RestAdapter;

/**
 * Created by arsenal on 8/5/15.
 */
public class Login {

    //public static RestMovieSource INSTANCE;
    public final RestInterface loginDBApi;

    public Login() {

        RestAdapter loginAPIRest = new RestAdapter.Builder()
                .setEndpoint("http://192.168.1.3:3000/")
                .build();

        loginDBApi = loginAPIRest.create(RestInterface.class);
    }
}
