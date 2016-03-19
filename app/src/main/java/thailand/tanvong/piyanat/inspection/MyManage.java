package thailand.tanvong.piyanat.inspection;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by OFFHA on 17/3/2559.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase;

    public static final String Inspection_table = "inspectionTABLE";
    public static final String column_id = "_id";
    public static final String column_Catagory = "Catagory";
    public static final String column_Item = "Item";
    public static final String column_Status = "Status";
    public static final String column_Date = "Date";
    public static final String column_Operator = "Operator";

    public MyManage(Context context) {

        //Create & Connected SQLite
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();

    }   // Constructor

    public long addCatAndItem(String strCategory,
                              String strItem) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(column_Catagory,strCategory);
        contentValues.put(column_Item,strItem);


        return writeSqLiteDatabase.insert(Inspection_table,null,contentValues);
    }


}   // Main Class
