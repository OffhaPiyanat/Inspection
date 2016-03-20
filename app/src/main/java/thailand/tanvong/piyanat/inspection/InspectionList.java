package thailand.tanvong.piyanat.inspection;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class InspectionList extends AppCompatActivity {

    //Explicit
    private ImageView iconImageView;
    private TextView titleTextView;
    private ListView inspectorListView;
    private String chooseCategoryString;
    private int chooseIconAnInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspection_list);

        //Bind Widget
        bindWidget();

        //Show View
        showView();

        //Create ListView
        createListview();


    }   //Main Method

    private void createListview() {

        //Read Data From SQLite
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " +
                MyManage.Inspection_table + " WHERE " +
                MyManage.column_Catagory + " = " + "'" + chooseCategoryString + "'", null);

        cursor.moveToFirst();
        int intCount = cursor.getCount();
        Log.d("Spect", "intCount ==> " + intCount);


    }   // createListView

    private void showView() {

        chooseCategoryString = getIntent().getStringExtra("Title");
        chooseIconAnInt = getIntent().getIntExtra("Icon", R.drawable.build3);

        titleTextView.setText(chooseCategoryString);
        iconImageView.setImageResource(chooseIconAnInt);


    }

    private void bindWidget() {

        iconImageView = (ImageView) findViewById(R.id.imageView3);
        titleTextView = (TextView) findViewById(R.id.textView4);
        inspectorListView = (ListView) findViewById(R.id.listView);

    }


}   // Main Class
