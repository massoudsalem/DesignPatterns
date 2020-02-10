package Structural.Facade;

public class HomeCinemaFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Lights lights;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;

    public HomeCinemaFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Lights lights, PopcornPopper popcornPopper, Projector projector, Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movieName){
        System.out.println("Getting Cinema ready for watching " + movieName + "...");
        popcornPopper.on();
        popcornPopper.off();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movieName);
    }

    public void turnCinemaOff(){
        System.out.println("Shutting Cinema down...");
        lights.on();
        popcornPopper.off();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }


}
