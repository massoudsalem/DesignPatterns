package Structural.Facade;

public class FacadeDriver {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Surrounded wireless amplifier");
        DvdPlayer dvdPlayer = new DvdPlayer("Sony Dvd player", amplifier);
        Lights lights = new Lights("Ceiling Lights");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn maker");
        Projector projector = new Projector("Epsilon projector", dvdPlayer);
        Screen screen = new Screen("Curved LG wide screen");

        HomeCinemaFacade homeCinemaFacade = new HomeCinemaFacade(amplifier, dvdPlayer,
                                            lights, popcornPopper, projector, screen);

        homeCinemaFacade.watchMovie("Parasite 2019");
        homeCinemaFacade.turnCinemaOff();
    }
}
