/**
 * HomeState, a State for TV
 * @author Brooks Robinson
 */
public class HomeState implements State {
    private TV tv;

    /**
     * Constructor for HomeState object
     * @param tv TV which will be changing its state
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Informs user the TV is already at the Home state
     */
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen\n");
    }

    /**
     * Switches the TV state to Netflix
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * Switches the TV state to Hulu
     */
    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * Informs the user that they must pick an app to view a movie list
     */
    @Override
    public void pressMovieButton() {
        System.out.println("You must pick an app to show movies.\n");
    }

    /**
     * Informs the user that they must pick an app to view a show list
     */
    @Override
    public void pressTVButton() {
        System.out.println("You must pick an app to show TV shows.\n");
    }
}