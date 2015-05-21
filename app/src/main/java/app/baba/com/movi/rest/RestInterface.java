package app.baba.com.movi.rest;
/**
 * Created by arsenal on 8/5/15.
 */

import java.util.List;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/*
This exposes the Retrofit interface.
Here we can declare all the GET/POST/PUT/DELETE requests we want to make to  the API
 Now the API will return a JSON object. So we can declare a class to parse the JSON object.
 Suppose we get a JSON string { userID : xxx , error: xxx}
 We can declare a class to receive this JSON String directly.Just declare the variables userID, error in
 the API and the JSON string is directly converted to object. Do not forget to rename the get/set methods.
 */
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

    @GET("/api/movies")
    List<MovieWrapper> get_movie(
    );
    

}
