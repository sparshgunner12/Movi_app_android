package app.baba.com.movi.view.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import app.baba.com.movi.R;
import app.baba.com.movi.rest.LoginResults;
import app.baba.com.movi.rest.Rest;

/**
 * Created by arsenal on 8/5/15.
 */
public class Login_Activity extends ActionBarActivity {
    private boolean ret=false;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                CheckLogin a=new CheckLogin(getParent());
                TextView b=(TextView)findViewById(R.id.editText);
                TextView c=(TextView)findViewById(R.id.editText2);
                a.execute();
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //View rootView = inflater.inflate(R.layout.activity_main, container, false);

        return true;
    }
    public class CheckLogin extends AsyncTask<String, String, Boolean> {
        private  String res="";
        private Activity activity;
        public CheckLogin(Activity activity) {
            this.activity = activity;
        }
        protected Boolean doInBackground(String... params) {
            Rest abc=new Rest();
            TextView b=(TextView)findViewById(R.id.editText);
            TextView c=(TextView)findViewById(R.id.editText2);
            try {
                LoginResults loginwrapper = abc.RestApi.checkvalid(b.getText().toString(), c.getText().toString());
                res = loginwrapper.getUserId();
                if (res != "") {
                    ret = true;
                } else {
                    ret = false;
                }
                Log.e("CheckLogin", res);
            }
            catch(Exception e) {
                ret = false;
            }
            return true;
        }
        @Override
        protected void onPostExecute(Boolean result) {
            if(ret==false)
            {

                Toast.makeText(Login_Activity.this, "Login Unsuccessfull", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(Login_Activity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login_Activity.this, ListOfMovies.class));
            }
        }
    }
}
