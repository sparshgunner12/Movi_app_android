package app.baba.com.domain;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import java.sql.Wrapper;

import app.baba.com.common.utils.BusProvider;
import app.baba.com.model.rest.RestLoginSource;

/**
 * Created by arsenal on 8/5/15.
 */
public class GetLoginUsecaseController implements GetLoginUsecase {

    private final RestLoginSource mDataSource;
    private final Bus mUiBus;
    private final String muser="";
    //private int mCurrentPage = 1;

    /**
     * Constructor of the class.
     *
     * @param uiBus The bus to communicate the domain module and the app module
     * @param dataSource The data source to retrieve the list of movies
     */
    public void GetLoginUsecaseController(String user,RestLoginSource dataSource, Bus uiBus) {

        if (dataSource == null)
            throw new IllegalArgumentException("MediaDataSource cannot be null");

        if (uiBus == null)
            throw new IllegalArgumentException("Bus cannot be null");

        mDataSource = dataSource;
        mUiBus = uiBus;
        muser=user;

        BusProvider.getRestBusInstance().register(this);
    }


    @Override
    public void requestLogin() {

        mDataSource.IsValid(muser);
    }

    @Subscribe
    @Override
    public void onLoginReceived(LoginWrapper response) {

        sendLoginToPresenter(response);
    }

    @Override
    public void sendLoginToPresenter (LoginWrapper response) {

        mUiBus.post(response);
    }

    @Override
    public void unRegister() {

        BusProvider.getRestBusInstance().unregister(this);
    }

    @Override
    public void execute() {

        requestLogin();
    }
}
