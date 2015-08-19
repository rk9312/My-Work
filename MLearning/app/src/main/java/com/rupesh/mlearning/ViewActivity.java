package com.rupesh.mlearning;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
 
public class ViewActivity extends Activity {
     
    SQLiteDatabase myDB = null;
    String TableName = "user";
    String Data = "";
    String Vata ="";
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
         
        try {
 
            myDB = this.openOrCreateDatabase("test", MODE_PRIVATE, null);
             
            //getting the cursor object 
             
            Cursor c = myDB.rawQuery("SELECT * FROM " + TableName, null);
            
            //int Column1 = c.getColumnIndex("UserId");
            int Column1 = c.getColumnIndex("Name");
            int Column2 = c.getColumnIndex("Age");
 
            c.moveToFirst();
             
            if (c != null) {
 
                do {
                    //String UserId = c.getString(Column1);
                    String Name = c.getString(Column1);
                     
                    int Age = c.getInt(Column2);
                     
                   //Data = "\n"+Data +"\n" + Name + "\n" + Age + "\n";
                    Data = Data +Name;
                    Vata = Vata +Age;
                     
                } while (c.moveToNext());
            }
 
            TextView tv = new TextView(this); // creating Text View to show data in the app
            tv.setTextColor(Color.WHITE);
            tv.setBackgroundResource(R.drawable.bg1);
            tv.setTextSize(20F);
            //tv.setText("\n"+"Name \t\t | Age \n ----------------------\n\n"+Data);
            tv.setText("\n\t" +"Name : "+Data+"\n\n\t Age : "+Vata);
            setContentView(tv);  // set created text view as Content View 
             
        }
 
        catch (Exception e) {
             
            Log.e("Error", "Error", e);
             
            Toast.makeText(getBaseContext(), "No Data found   ", Toast.LENGTH_LONG).show();
             
        } finally {
            if (myDB != null)
                myDB.close();
        }
    }
 
     
 
}
