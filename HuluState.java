public class HuluState implements State {
    private TV tv;

    public HuluState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu");
    }

    @Override
    public void pressMovieButton() {
        String[] movies = {"The Godfather", "Spetters", "RoboCop", "No Country for Old Men", "Robot"};
        System.out.println("Hulu Movies:");
        for (String i : movies) {
            System.out.println("- " + i);
        }
    }

    @Override
    public void pressTVButton() {
        String[] shows = {"The Sopranos", "Silicon Valley", "Beef House", "Awesome Show!", "Sesame Street"};
        System.out.println("Hulu TV Shows:");
        for (String i : shows) {
            System.out.println("- " + i);
        }
    }
}