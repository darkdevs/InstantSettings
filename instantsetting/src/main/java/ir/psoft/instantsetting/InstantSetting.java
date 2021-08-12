package ir.psoft.instantsetting;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;



/**
 * Created by pouyadark on 8/4/18.
 */


public class InstantSetting {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context _context;
    private HashMap<String,Object> dictionary = new HashMap<>();
    protected String PREF_NAME;

    protected void setupSetting(String prefname) {
        if(pref==null) {
            _context = InstantSettingLoader.getInstance();
            this.PREF_NAME=prefname;
            pref = _context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
            editor = pref.edit();
        }
    }
    //boolean
    protected Boolean getBoolean(String key){
        if(dictionary.containsKey(key)){
            return (Boolean) dictionary.get(key);
        }
        setupSetting(PREF_NAME);
        boolean val=pref.getBoolean(key, false);
        dictionary.put(key,val);
        return val;
    }

    protected Boolean getBoolean(String key, boolean defaultvalue){
        if(dictionary.containsKey(key)){
            return (Boolean) dictionary.get(key);
        }
        setupSetting(PREF_NAME);
        boolean val= pref.getBoolean(key, defaultvalue);
        dictionary.put(key,val);
        return val;
    }

    protected void setBoolean(String key, boolean value) {
        dictionary.put(key,value);
        setupSetting(PREF_NAME);
        editor.putBoolean(key, value);
        editor.commit();
    }

    //string

    protected String getString(String key){
        if(dictionary.containsKey(key)){
            return (String) dictionary.get(key);
        }
        setupSetting(PREF_NAME);
        String val = pref.getString(key, null);
        dictionary.put(key,val);
        return val;
    }

    protected String getString(String key, String defaultvalue){
        if(dictionary.containsKey(key)){
            return (String) dictionary.get(key);
        }
        setupSetting(PREF_NAME);
        String val = pref.getString(key, defaultvalue);
        dictionary.put(key,val);
        return val;
    }

    protected void setString(String key, String value) {

        dictionary.put(key,value);
        setupSetting(PREF_NAME);
        editor.putString(key, value);
        editor.commit();
    }

    //int

    protected int getInt(String key){
        if(dictionary.containsKey(key)){
            return (int) dictionary.get(key);
        }
        setupSetting(PREF_NAME);
        int val = pref.getInt(key, 0);
        dictionary.put(key,val);
        return val;
    }

    protected int getInt(String key, int defaultvalue){
        if(dictionary.containsKey(key)){
            return (int) dictionary.get(key);
        }
        setupSetting(PREF_NAME);
        int val = pref.getInt(key, defaultvalue);
        dictionary.put(key,val);
        return val;
    }
    public void ClearAll(){
        setupSetting(PREF_NAME);
        editor.clear();
        editor.commit();
    }
    protected void setInt(String key, int i) {
        dictionary.put(key,i);
        setupSetting(PREF_NAME);
        editor.putInt(key, i);
        editor.commit();
    }
}
