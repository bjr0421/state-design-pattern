public class NetflixState implements State {
    private TV tv;

    public NetflixState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        String[] movies = {"Lethal Weapon 2", "Beverly Hills Cop", "Blade Runner 2049", "The Shining", "The Dark Knight"};
        System.out.println("Netflix Movies:");
        for (String i : movies) {
            System.out.println("- " + i);
        }
    }

    @Override
    public void pressTVButton() {
        String[] shows = {"South Park", "The Boondocks", "Euphoria", "Black Mirror", "Chappelle's Show"};
        System.out.println("Netflix TV Shows:");
        for (String i : shows) {
            System.out.println("- " + i);
        }
    }
}
