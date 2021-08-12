package ir.psoft.instantsetting;

import android.app.Application;
import android.content.Context;

/**
 * Created by pouyadark on 10/27/18.
 */

public class InstantSettingLoader extends Application {
    private static Context instance;

    public static void Initate(Context context) {
        InstantSettingLoader.instance=context;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance= this;
    }

    public static Context getInstance() {
        return instance;
    }
}
