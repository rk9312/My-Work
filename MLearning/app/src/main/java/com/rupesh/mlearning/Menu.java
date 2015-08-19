package com.rupesh.mlearning;

//import java.io.File;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
//import android.content.SharedPreferences;
//import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends Activity {
	
	SQLiteDatabase myDB = null;
    String TableName = "user";
    String Data = "";
   // EditText userName;
    //EditText userAge;
    
	TextView tv1;
	Button b1,b2,b3,b4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		tv1 = (TextView)findViewById(R.id.textView1);
		Bundle extras = getIntent().getExtras();
	    if (extras != null)
	    {
	        String topic = extras.getString("topic");
	        tv1.setText("Hi Mr."+topic);
	        
	    }
	    else
	    {
	        //..oops!
	    }
		 
		b1=(Button)findViewById(R.id.gotolibrary);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent lib= new Intent(Menu.this,Library.class);
				startActivity(lib);
				
								
			}
		});
        
       
		
       /* b2=(Button)findViewById(R.id.goodreads);
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent gr= new Intent(Menu.this,GoodReads.class);
				startActivity(gr);
				
			}
		});*/
			
        
     /*   b3=(Button)findViewById(R.id.btnlogout);
        b3.setOnClickListener(new View.OnClickListener() {
        	
        	 
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(Menu.this, "Logout Successfull", Toast.LENGTH_LONG).show();
				Intent logout= new Intent(Menu.this,HomeActivity.class);
				startActivity(logout);
				finish();
				
			}
		});*/
        
        b4=(Button)findViewById(R.id.feedback);
        b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent msz= new Intent(Menu.this,Message.class);
				startActivity(msz);
				
				
			}
		});
	}
	
	// this method will trigger when user clicked " CreateDB & Table " button 
	 public void createDB(View v) { 
    	 
        try 
        {
             // Get the database if database is not exists create new database 
             // Database name is " test " 
              
             myDB = this.openOrCreateDatabase("test", MODE_PRIVATE, null);
              
             // Create table with tow columns (Name and Age)
          
             myDB.execSQL("CREATE TABLE IF NOT EXISTS " + TableName
                     + " (Name VARCHAR, Age INT(3));");
  
            // Toast.makeText(getBaseContext(), "Database & Table Created",Toast.LENGTH_LONG).show();
              
         } 
        catch (Exception e) {
  
             Log.e("Error", "Error", e);
  
            // Toast.makeText(getBaseContext(),"Error in creating database or Table", Toast.LENGTH_LONG).show();
  
         }
         Intent gr= new Intent(Menu.this,Profile.class);
         gr.putExtra("topic",tv1.getText().toString());
         startActivity(gr);
  
     }
	 
	// this method will trigger when user clicked " Drop DB " button 
	 
	    public void drop(View v) {
	 
	        try 
	        {
	            // we use deleteDatabse("Database name ") method to delete database 
	            // we have to pass String parameter to give the name of database
	             
	            deleteDatabase("test"); 
	            Toast.makeText(Menu.this, "Logout Successfull", Toast.LENGTH_LONG).show();
	            //Toast.makeText(getBaseContext(), "Data Deleted", Toast.LENGTH_LONG).show();
	        } 
	        catch (Exception e) 
	        {
	 
	            Log.e("Error", "Error", e);
	 
	            Toast.makeText(getBaseContext(), "Error in logout",Toast.LENGTH_LONG).show();
	 
	        }
	        
	        Toast.makeText(Menu.this, "Logout Successfull", Toast.LENGTH_LONG).show();
			Intent logout= new Intent(Menu.this,HomeActivity.class);
			startActivity(logout);
			finish();
	 
	    }


}
