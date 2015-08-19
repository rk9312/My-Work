package com.rupesh.mlearning;
import java.io.File;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
//import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Library extends Activity {
	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.library);
		b1=(Button)findViewById(R.id.btnbook1);
		b1.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				//(this is to get root path of sdcard,but not used in this code) 
				//String root=Environment.getExternalStorageDirectory().toString();
				
				//fetching pdf from sdcard
				//inside File() write complete path of pdf
				
				File file=new File("/storage/sdcard0/Download/books/c/c.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
			}
			});
				
		
		b2=(Button)findViewById(R.id.btnbook2);
		b2.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				//(this is to get root path of sdcard,but not used in this code) 
				//String root=Environment.getExternalStorageDirectory().toString();
				
				//fetching pdf from sdcard
				//inside File() write complete path of pdf
				
				File file=new File("/storage/sdcard0/Download/books/co/co.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "root", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		
		b3=(Button)findViewById(R.id.button3);
		b3.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				//(this is to get root path of sdcard,but not used in this code) 
				//String root=Environment.getExternalStorageDirectory().toString();
				
				//fetching pdf from sdcard
				//inside File() write complete path of pdf
				
				File file=new File("/storage/sdcard0/Download/books/ppm/ppm.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		
		b4=(Button)findViewById(R.id.button4);
		b4.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/se/se.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		
		b5=(Button)findViewById(R.id.button5);
		b5.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/dm/dm.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b6=(Button)findViewById(R.id.button6);
		b6.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/os/os.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b7=(Button)findViewById(R.id.button7);
		b7.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/dbms/dbms.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b8=(Button)findViewById(R.id.button8);
		b8.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/cpp/cpp.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b9=(Button)findViewById(R.id.button9);
		b9.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/mis/mis.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b10=(Button)findViewById(R.id.button10);
		b10.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/erp/erp.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b11=(Button)findViewById(R.id.button11);
		b11.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/ds/ds.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b12=(Button)findViewById(R.id.button12);
		b12.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/wt/wt.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b13=(Button)findViewById(R.id.button13);
		b13.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/dccn/dccn.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b14=(Button)findViewById(R.id.button14);
		b14.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/ooad/ooad.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b15=(Button)findViewById(R.id.button15);
		b15.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/adbms/adbms.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b16=(Button)findViewById(R.id.button16);
		b16.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/ot/ot.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b17=(Button)findViewById(R.id.button17);
		b17.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/mc/mc.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b18=(Button)findViewById(R.id.button18);
		b18.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/java/java.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b19=(Button)findViewById(R.id.button19);
		b19.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/isa/isa.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		b20=(Button)findViewById(R.id.button20);
		b20.setOnClickListener(new View.OnClickListener()
		{
		
			@Override
			public void onClick(View arg0) 
			{
				
				File file=new File("/storage/sdcard0/Download/books/daa/daa.pdf");
				if(file.exists()){
					Uri path=Uri.fromFile(file);
					Intent intent=new Intent(Intent.ACTION_VIEW);
					
					intent.setDataAndType(path,"application/pdf");
					intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					try
					{
						startActivity(intent);
						
					}
					catch(ActivityNotFoundException e)
					{
						Toast.makeText(Library.this, "Cannot open pdf", Toast.LENGTH_SHORT).show();
					}
					
				}
				else
				{
					Toast.makeText(Library.this, "not found", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
	}
/*public void pdfOpen(){
		File file = new File("/sdcard0/anju.pdf");
		Intent intent = new Intent(Intent.ACTION_VIEW);
	
		intent.setDataAndType(Uri.fromFile(file),"application/pdf");
	
		intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
	
		startActivity(intent);
	}*/
//}
}