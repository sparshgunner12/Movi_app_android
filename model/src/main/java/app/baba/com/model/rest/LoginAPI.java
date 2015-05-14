package app.baba.com.model.rest;

import app.baba.com.model.entities.LoginWrapper;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Path;

/**
 * Created by arsenal on 8/5/15.
 */
public class LoginAPI {
    @GET("/user/popular")
    void getPopularMovies(@Path("api_key") String apiKey, Callback<LoginWrapper> callback);
}
