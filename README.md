# InstantSettings
A android code for Faster and Better Preferences saving with cache mechanism using Android SharedPreferences.

```
public class MyInstantSetting extends InstantSetting {
  @override
  boolean defaultBoolean = false;
  void setupSetting(String prefname) {
    super.setupSetting("mysetting");
  }
  
  public boolean getMyBoolSetting(){
    return getBoolean("myboolean",defaultresult);
  }
  public boolean setMyBoolSetting(boolean mybool){
    return setBoolean("myboolean",mybool);
  }
}
```
