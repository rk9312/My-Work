package com.rupesh.mlearning;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Message extends Activity implements View.OnClickListener {
	
	Button sendfeedback;
	EditText sname,body;
	Spinner type;
	CheckBox cb1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.message);
		
		 sname = (EditText) findViewById(R.id.EditTextName);
		 body = (EditText) findViewById(R.id.EditTextFeedbackBody);
		 type = (Spinner) findViewById(R.id.SpinnerFeedbackType);
		 cb1 = (CheckBox) findViewById(R.id.CheckBoxResponse);
		 sendfeedback = (Button) findViewById(R.id.ButtonSendFeedback);
		 sendfeedback.setOnClickListener(new View.OnClickListener() {

		          public void onClick(View view) {
		        	  SendFeedback();
		        	  
			          body.setText("");
		          }
		 
		 });
	}
		 protected void SendFeedback() {
			 
			  		//String emails= "mlearning_v1@gmail.com";
			       //String[] emails = {semail.getText().toString()};
			 
			       Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto: "));
			 
			       // prompts email clients only
			 
			       email.setType("message/rfc822");
			 
			  
			 
			       email.putExtra(Intent.EXTRA_EMAIL, new String[]{"rajnikantjha09@gmail.com"});
			 
			       email.putExtra(Intent.EXTRA_SUBJECT, type.getSelectedItem().toString());
			 
			       email.putExtra(Intent.EXTRA_TEXT, body.getText().toString());
			 
			  
			 
			       try {
			 
			         // the user can choose the email client
			 
			          startActivity(Intent.createChooser(email, "Choose an email client from..."));
			 
			       
			 
			       } catch (android.content.ActivityNotFoundException ex) {
			 
			          Toast.makeText(Message.this, "No email client installed.",Toast.LENGTH_LONG).show();
			 
			       }
			 
		
	}
		
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	


