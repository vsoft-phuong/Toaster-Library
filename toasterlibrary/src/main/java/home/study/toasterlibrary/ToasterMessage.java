package home.study.toasterlibrary;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.widget.Toast;

public class ToasterMessage {
    public static void toastMessage(Context ctx, String message){
        Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
    }
    public static void toastMessage(Context ctx, int message){
        Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
    }

}
