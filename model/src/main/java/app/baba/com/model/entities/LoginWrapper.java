package app.baba.com.model.entities;

import java.io.Serializable;

/**
 * Created by arsenal on 8/5/15.
 */

public class LoginWrapper implements Serializable {
    private boolean isvalid;

    public boolean isvalid() {
        return isvalid;
    }

    public void setIsvalid(boolean isvalid) {
        this.isvalid = isvalid;
    }
}

