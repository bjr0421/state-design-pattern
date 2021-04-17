/**
 * HuluState, a State for TV
 * @author Brooks Robinson
 */
public class HuluState implements State {
    private TV tv;

    /**
     * Constructor for HuluState object
     * @param tv TV which will be changing its state
     */
    public HuluState(TV tv) {
        this.tv = tv;
    }

    /**
     * Switches the TV state to the Home screen
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
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
     * Informs the user that the TV is already at the Hulu state
     */
    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    /**
     * Lists the movies available in the Hulu state
     */
    @Override
    public void pressMovieButton() {
        String[] movies = {"The Godfather", "Spetters", "RoboCop", "No Country for Old Men", "Robot"};
        System.out.println("Hulu Movies:");
        for (String i : movies) {
            System.out.println("- " + i);
        }
        System.out.println();
    }

    /**
     * Lists the shows available in the Hulu state
     */
    @Override
    public void pressTVButton() {
        String[] shows = {"The Sopranos", "Silicon Valley", "Beef House", "Awesome Show!", "Sesame Street"};
        System.out.println("Hulu TV Shows:");
        for (String i : shows) {
            System.out.println("- " + i);
        }
        System.out.println();
    }
}