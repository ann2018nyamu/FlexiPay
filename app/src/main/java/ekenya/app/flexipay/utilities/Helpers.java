package ekenya.app.flexipay.utilities;

import android.content.Context;
import android.widget.Toast;

public class Helpers {

    public void showToast(Context ctx,String message){
        Toast.makeText(ctx,message,Toast.LENGTH_SHORT).show();
    }
}
