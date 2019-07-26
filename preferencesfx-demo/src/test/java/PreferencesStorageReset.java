import com.dlsc.preferencesfx.demo.AppStarter;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class PreferencesStorageReset {
  /**
   * Clears the currently saved preferences.
   * For testing purposes only.
   */
  public static void main(String[] args) throws BackingStoreException {
    Preferences preferences = Preferences.userNodeForPackage(AppStarter.class);
    preferences.clear();
  }
}
