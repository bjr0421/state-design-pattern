/**
 * NetflixState, a State for TV
 * @author Brooks Robinson
 */
public class NetflixState implements State {
    private TV tv;

    /**
     * Constructor for NetflixState object
     * @param tv TV which will be changing its state
     */
    public NetflixState(TV tv) {
        this.tv = tv;
    }

    /**
     * Switches the TV to the Home screen
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    /**
     * Informs the user that the TV is already at the Netflix state
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    /**
     * Switches the TV to the Hulu state
     */
    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * Lists the movies available in the Netflix state
     */
    @Override
    public void pressMovieButton() {
        String[] movies = {"Lethal Weapon 2", "Beverly Hills Cop", "Blade Runner 2049", "The Shining", "The Dark Knight"};
        System.out.println("Netflix Movies:");
        for (String i : movies) {
            System.out.println("- " + i);
        }
        System.out.println();
    }

    /**
     * Lists the shows available in the Netflix state
     */
    @Override
    public void pressTVButton() {
        String[] shows = {"South Park", "The Boondocks", "Euphoria", "Black Mirror", "Chappelle's Show"};
        System.out.println("Netflix TV Shows:");
        for (String i : shows) {
            System.out.println("- " + i);
        }
        System.out.println();
    }
}
