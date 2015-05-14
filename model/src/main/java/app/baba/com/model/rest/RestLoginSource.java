package app.baba.com.model.rest;

import app.baba.com.common.utils.BusProvider;
import app.baba.com.common.utils.Constants;
import app.baba.com.model.entities.LoginWrapper;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by arsenal on 8/5/15.
 */
public class RestLoginSource {
    public static RestLoginSource INSTANCE;
    private final LoginAPI loginDBApi;

    private RestLoginSource() {

        RestAdapter loginAPIRest = new RestAdapter.Builder()
                .setEndpoint(Constants.MOVIE_DB_HOST)
                .build();

        loginDBApi = loginAPIRest.create(LoginAPI.class);
    }

    public static RestLoginSource getInstance() {

        if (INSTANCE == null)
            INSTANCE = new RestLoginSource();

        return INSTANCE;
    }

    public  void Isvalid(String user) {

        loginDBApi.getvalidity(user,retrofitCallback);
    }
    public Callback retrofitCallback=new Callback(){
        @Override
        public void success(Object o,Response response)
        {
            if (o instanceof LoginWrapper) {

                LoginWrapper detailResponse = (LoginWrapper) o;
                BusProvider.getRestBusInstance().post(detailResponse);

            }
        }
        @Override
        public void failure(RetrofitError error) {

            System.out.printf("[DEBUG] RestMovieSource failure - " + error.getMessage());
        }
    };
}
