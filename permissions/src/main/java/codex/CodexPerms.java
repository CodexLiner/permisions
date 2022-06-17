package codex;

import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

public class CodexPerms {
    private final Activity activity;

    public CodexPerms(Activity activity) {
        this.activity = activity;
    }
    public boolean hasPermision( String [] permissions){
        for (String s : permissions){
            if (ActivityCompat.checkSelfPermission(activity , s) != PackageManager.PERMISSION_GRANTED){
                return false;
            }
        }
        return true;
    }
    public void requestPerms(String [] permissions){
        ActivityCompat.requestPermissions(activity, permissions, 0);
    }
}
