package bedjong.android;

import com.jme3.app.AndroidHarness;
import bedjong.game.Bedjong;


public class AndroidLauncher extends AndroidHarness {

    public AndroidLauncher() {
        appClass = Bedjong.class.getCanonicalName();
    }
}
