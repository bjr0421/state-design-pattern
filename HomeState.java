public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv) {
        this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("TV is already on the home screen");
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        System.out.println("You must pick an app to show movies.");
    }

    @Override
    public void pressTVButton() {
        System.out.println("You must pick an app to show TV shows.");
    }
}