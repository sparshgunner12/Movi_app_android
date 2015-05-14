package app.baba.com.common.utils;

/**
 * Created by arsenal on 8/5/15.
 */
import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;


public class BusProvider {

    private static final Bus REST_BUS = new Bus(ThreadEnforcer.ANY);
    private static final Bus UI_BUS = new Bus();

    private BusProvider() {};

    public static Bus getRestBusInstance() {

        return REST_BUS;
    }

    public static Bus getUIBusInstance () {

        return UI_BUS;
    }
}
