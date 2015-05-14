package app.baba.com.domain;

import app.baba.com.model.entities.LoginWrapper;
/**
 * Created by arsenal on 8/5/15.
 */
public interface GetLoginUsecase extends Usecase {

    /**
     * Callback used to be notified when the most popular Movies have been
     * received
     *
     * @param response the response containing a list with movies
     */
    public void onLoginReceived(LoginWrapper response);

    /**
     * Request datasource the most popular movies
     */
    public void requestLogin();

    /**
     * Sends the PopularMoviesApiResponse thought the communication system
     * to be received by the presenter in another module
     *
     * @param response the response containing a list with movies
     */
    public void sendLoginToPresenter (MoviesWrapper response);

    public void unRegister ();
}

