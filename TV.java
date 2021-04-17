/**
 * TV, a Object using the State design pattern
 * @author Brooks Robinson
 */
public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    /**
     * Constructor for TV object
     */
    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;
    }

    /**
     * Sets the current state to the Home screen
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * Sets the current state to Netflix
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * Sets the current state to Hulu
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * Lists the movies for the current state (if applicable)
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /**
     * Lists the shows for the current state (if applicable)
     */
    public void pressTVButton() {
        state.pressTVButton();
    }

    /**
     * Sets the state based on which State is passed in
     * @param state state which the TV is switching to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Fetches the HomeState
     * @return HomeState state
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * Fetches the NetflixState
     * @return NetflixState state
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /**
     * Fetches the HuluState
     * @return HuluState state
     */
    public State getHuluState() {
        return HuluState;
    }
}
