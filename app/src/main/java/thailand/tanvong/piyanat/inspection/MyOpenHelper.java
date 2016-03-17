package thailand.tanvong.piyanat.inspection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by OFFHA on 17/3/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String database_name = "Inspection.db";
    private static final int database_version = 1;

    private static final String create_inspection_table = "create table inspectionTABLE (" +
            "_id integer primary key, " +
            "_Catagory text, " +
            "_Item text, " +
            "_Status text, " +
            "_Date text, " +
            "_Operator text);";


    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(create_inspection_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   // Main class
