package thailand.tanvong.piyanat.inspection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by OFFHA on 17/3/2559.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase;


    public MyManage(Context context) {

        //Create & Connected SQLite
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();

    }   // Constructor

}   // Main Class
