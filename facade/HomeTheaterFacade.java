package headFirst.facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    Screen screen;
    Popper popper;
    CdPlayer cdplayer;
    TheaterLights lights;
    DvdPlayer dvd;
    Projector projector;

  public HomeTheaterFacade(
    Amplifier amp,
    Tuner tuner,
    DvdPlayer dvd,
    Screen screen,
    Popper popper,
    CdPlayer cdplayer,
    TheaterLights lights,
    Projector projector
  ) {
    this.amp = amp;
    this.tuner = tuner;
    this.screen = screen;
    this.popper = popper;
    this.cdplayer = cdplayer;
    this.lights = lights;
    this.dvd = dvd;
    this.projector = projector;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    popper.on();
    popper.pop();
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setSurroundSound();
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }

  public void endMovie(){}
  public void listenToCd(){}
  public void endCd(){}
  public void listenToRadio(){}
  public void endRadio(){}
}
