package bedjong.desktopmodule;

import bedjong.game.Bedjong;
import com.jme3.system.AppSettings;

/**
 * Used to launch a jme application in desktop environment
 *
 */
public class DesktopLauncher {
    public static void main(String[] args) {
        final Bedjong game = new Bedjong();

        final AppSettings appSettings = new AppSettings(true);

        game.setSettings(appSettings);
        game.setShowSettings(false); //Settings dialog not supported on mac
        game.start();
    }
}
