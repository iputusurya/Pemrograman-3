package uas.aplikasi.shio;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;




public class MainActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.main);
         
       Button btnShio = (Button)findViewById(R.id.BtnShio);
 
       Button btnCari = (Button)findViewById(R.id.BtnCari);
       
       Button btnTentangKita = (Button)findViewById(R.id.BtnTentangKita);
       
       Button btnKeluar = (Button)findViewById(R.id.BtnKeluar);
       btnKeluar.setOnClickListener(this);
       
       
       
       btnShio.setOnClickListener(new OnClickListener() {
    		
    			public void onClick(View view) {
	
            	Intent intent = new Intent(MainActivity.this, Shio.class);
            		startActivity(intent);
            	}
    		});
        
    	
       btnCari.setOnClickListener(new OnClickListener() {
		
			public void onClick(View view) {	
				
        	Intent intent = new Intent(MainActivity.this, Cari.class);
        		startActivity(intent);
        	}
		
    });
    
       btnTentangKita.setOnClickListener(new OnClickListener() {
        
	       public void onClick(View view) {
	    
	    Intent intent = new Intent(MainActivity.this, TentangKita.class);
    	       startActivity(intent);
	       }
});
    
    }

public void onClick(View arg0) {
	// TODO Auto-generated method stub
	AlertDialog.Builder ab = new AlertDialog.Builder(this)
	.setMessage("Apakah Anda ingin keluar?").setTitle("Konfirmasi Exit")
	.setPositiveButton("Ya", new DialogInterface.OnClickListener() {

	public void onClick(DialogInterface dialog, int which) {
	// TODO Auto-generated method stub
	finish();
	}
	}).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {

	public void onClick(DialogInterface dialog, int which) {
	// TODO Auto-generated method stub

	}
	});
	ab.show();
	}
}