package app.baba.com.movi.rest;

/**
 * Created by arsenal on 8/5/15.
 */
/*
The JSON string received is of form.
{
    userId: xxx,
    id:xxx,
    error(optional): ""
}
Read this link:-
http://docs.strongloop.com/display/public/LB/Registering+users#Registeringusers-Creatinganewuser

So this highlights the optional parsing feature of retrofit
So if the JSON string has 4 attributes and you only want to parse three
you can create an object creating those three variables.
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