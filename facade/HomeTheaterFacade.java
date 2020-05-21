package headFirst.facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    Screen screen;
    Popper popper;
    CdPlayer cdplayer;
    TheaterLights theaterLights;
    DvdPlayer dvdPlayer;
    Projector projector;

  public HomeTheaterFacade(
    Amplifier amp,
    Tuner tuner,
    Screen screen,
    Popper popper,
    CdPlayer cdplayer,
    TheaterLights theaterLights,
    DvdPlayer dvdPlayer,
    Projector projector
  ) {
    this.amp = amp;
    this.tuner = tuner;
    this.screen = screen;
    this.popper = popper;
    this.cdplayer = cdplayer;
    this.theaterLights = theaterLights;
    this.dvdPlayer = dvdPlayer;
    this.projector = projector;
  }

  public void watchMovie(){}
  public void endMovie(){}
  public void listenToCd(){}
  public void endCd(){}
  public void listenToRadio(){}
  public void endRadio(){}
}
