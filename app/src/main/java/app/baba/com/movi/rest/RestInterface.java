package app.baba.com.movi.rest;
/**
 * Created by arsenal on 8/5/15.
 */

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/**
 * Interface representing the MovieDatabaseAPI endpoints
 * used by retrofit
 */
public interface RestInterface{
    @FormUrlEncoded
    @POST("/api/Users/login")
    LoginResults checkvalid(
            @Field("email") String user,
            @Field("password") String password
            );

}
