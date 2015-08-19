package com.rupesh.mlearning;

import android.app.Activity;
//import android.app.ProgressDialog;
//import android.content.ActivityNotFoundException;
import android.content.Intent;
//import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
//import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
 
public class SignUPActivity extends Activity
{

    EditText editTextUserName,editTextPassword,editTextConfirmPassword;
    Button btnCreateAccount,btnBacktoLogin;
 
    LoginDataBaseAdapter loginDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
 
        // get Instance  of Database Adapter
        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();
 
        // Get References of Views
        editTextUserName=(EditText)findViewById(R.id.editTextUserName);
        editTextPassword=(EditText)findViewById(R.id.editTextPassword);
        editTextConfirmPassword=(EditText)findViewById(R.id.editTextConfirmPassword);
 
        btnCreateAccount=(Button)findViewById(R.id.buttonCreateAccount);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
        	 
        public void onClick(View v) {
            // TODO Auto-generated method stub
 
            String userName=editTextUserName.getText().toString();
            String password=editTextPassword.getText().toString();
            String confirmPassword=editTextConfirmPassword.getText().toString();
            
        
            // check if any of the fields are vaccant
            if(userName.equals("")||password.equals("")||confirmPassword.equals(""))
            {
                    Toast.makeText(getApplicationContext(), "Field Vacant", Toast.LENGTH_LONG).show();
                    return;
            }
            // check if both password matches
            if(!password.equals(confirmPassword))
            {
                Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
                return;
            }
            else
            {
                // Save the Data in Database
                loginDataBaseAdapter.insertEntry(userName, password);
                Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_LONG).show();
                
				
            }
        }
    
    });
        
        btnBacktoLogin=(Button)findViewById(R.id.buttonBacktoLogin);
        btnBacktoLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i= new Intent(SignUPActivity.this,HomeActivity.class);
				startActivity(i);
				finish();
				
			}
		});
}
    
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
 
        loginDataBaseAdapter.close();
    }
}