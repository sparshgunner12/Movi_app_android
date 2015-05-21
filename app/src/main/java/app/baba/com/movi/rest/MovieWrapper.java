package app.baba.com.movi.rest;

/**
 * Created by arsenal on 15/5/15.
 */
/*
The JSON string received is of form.
{
    id: xxx,
    name: ""
}
 */
public class MovieWrapper {
    private int id;
    private String name;
    public int getId()
    {
        return id;
    }
    public void setId(int x)
    {
        id=x;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String x)
    {
        name=x;
    }
}