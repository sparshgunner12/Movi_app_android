package app.baba.com.movi.rest;

import java.util.List;

/**
 * Created by arsenal on 8/5/15.
 */
public class LoginWrapper {

        public  LoginWrapper(){
        }

        public List<LoginResults> getResults() {
            return results;
        }

        public void setResults(List<LoginResults> results) {
            this.results = results;
        }

        private List<LoginResults> results;

    }
