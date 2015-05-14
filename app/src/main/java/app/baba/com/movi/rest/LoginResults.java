package app.baba.com.movi.rest;

/**
 * Created by arsenal on 8/5/15.
 */
public class LoginResults {
    private String userId="";
   // private String password;
   private String error="";
    public String getUserId()
    {
        return userId;
    }
    public void setUserId(String x)
    {
        userId=x;
    }
    public String getError()
    {
        return error;
    }
    public void setError(String x)
    {
        error=x;
    }
}