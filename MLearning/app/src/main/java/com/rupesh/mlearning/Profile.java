package com.rupesh.mlearning;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends Activity {

	SQLiteDatabase myDB = null;
    String TableName = "user";
    String Data = "";
    String Vata = "";
    String userName;
    EditText userAge,UserName;
    TextView UserId;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         
        super.onCreate(savedInstanceState);
         
        setContentView(R.layout.profile);
         
        UserName = (EditText)findViewById(R.id.fullName); // getting text fields (Edit Text)
         
        userAge = (EditText)findViewById(R.id.age);
        
        UserId = (TextView)findViewById(R.id.userId);
        Bundle extras = getIntent().getExtras();
	    if (extras != null)
	    {
	        String topic = extras.getString("topic");
	        UserId.setText(topic);
	        
	    }
	    else
	    {
	        //..oops!
	    }
        
        
    }
     

     
    // this method will trigger when user clicked " Drop DB " button 
 
    public void drop(View v) {
 
        try {
            // we use deleteDatabse("Database name ") method to delete database 
            // we have to pass String parameter to give the name of database
             
            deleteDatabase("test"); 
 
            Toast.makeText(getBaseContext(), "Data Deleted", Toast.LENGTH_LONG)
                    .show();
        } catch (Exception e) {
 
            Log.e("Error", "Error", e);
 
            Toast.makeText(getBaseContext(), "Error in deleting",Toast.LENGTH_LONG).show();
 
        }
 
    }
 
    // this method will trigger when user clicked " Save Data " button 
 
     
    public void addData(View v) {
         
        try{
             
            // getting created database or if database is not exists create new database
             
        myDB = this.openOrCreateDatabase("test", MODE_PRIVATE, null);
 
       // String userid =UserId.getText().toString();
        String name = UserName.getText().toString();
        int age = Integer.parseInt(userAge.getText().toString().trim());
 
        myDB.execSQL("INSERT INTO " + TableName + " (Name, Age)" + " VALUES ('"+ name + "', " + age + ");");
 
        Toast.makeText(getBaseContext(), "Date Saved ", Toast.LENGTH_LONG).show();
        }
         
        catch(Exception e){
             
            Log.e("Error", "Error", e);
             
            Toast.makeText(getBaseContext(), "No Database found   ", Toast.LENGTH_LONG).show();
             
        }
    }
 
    // this method will trigger when user clicked " View Data " button 
 
    public void viewData(View v) {
         
        // creating new intent using ViewActivity Class and start activity to show table data
 
        Intent i = new Intent(this,ViewActivity.class);
        startActivity(i);
 
    }
    
}
