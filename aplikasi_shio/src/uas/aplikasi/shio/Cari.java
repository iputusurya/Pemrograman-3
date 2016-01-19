package uas.aplikasi.shio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Cari extends Activity implements OnItemSelectedListener{
/** Called when the activity is first created. */
Spinner spinnershio_anda;
String[] shio_anda = {"Pilih Shio", "Anjing", "Ayam", "Babi", "Kambing", "Kelinci", "Kerbau", "Kuda",
					"Macan", "Monyet", "Naga", "Tikus", "Ular"};
Spinner spinnershio_pasangan;
String[] shio_pasangan = {"Pilih Shio", "Anjing", "Ayam", "Babi", "Kambing", "Kelinci", "Kerbau", "Kuda",
					"Macan", "Monyet", "Naga", "Tikus", "Ular"};
public Button btnHasil;
public Button btnReset;
public EditText nama_anda;
public EditText nama_pasangan;
public TextView hasil;
public ImageView gambar;

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.cari);

spinnershio_anda = (Spinner) findViewById(R.id.shio_anda);
ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,shio_anda);
aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnershio_anda.setAdapter(aa);
spinnershio_anda.setOnItemSelectedListener(this);

spinnershio_pasangan = (Spinner) findViewById(R.id.shio_pasangan);
ArrayAdapter<String> ab = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,shio_pasangan);
ab.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnershio_pasangan.setAdapter(ab);
spinnershio_pasangan.setOnItemSelectedListener(this);

nama_anda = (EditText) findViewById(R.id.nama1);
nama_pasangan = (EditText) findViewById(R.id.nama2);
gambar = (ImageView) findViewById(R.id.gambar);
gambar.setEnabled(false);
btnHasil = (Button)findViewById(R.id.BtnHasil);
btnReset = (Button)findViewById(R.id.BtnReset);
hasil = (TextView)findViewById(R.id.Hasil);

btnReset.setOnClickListener(new OnClickListener() {
	
	public void onClick(View view) {
		finish();
		
	Intent intent = new Intent(Cari.this, Cari.class);
		startActivity(intent);
		
	} }); }


public void onItemSelected(AdapterView<?> arg0, View arg1, int index,
long arg3) {
	
	try {
// TODO Auto-generated method stub
		if(nama_anda.getText().toString().length() == 0) {
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					nama_anda.setError( "Diisi dulu namanya" );
					}
				});
			}
		else if(nama_pasangan.getText().toString().length() == 0 ) {
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					nama_pasangan.setError( "Diisi dulu namanya" );
					}
				});
			}
		
		else if ((shio_anda[index]=="Pilih Shio") || (shio_pasangan[index]=="Pilih Shio"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Pilih Shio dulu";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Tikus") || (shio_pasangan[index]=="Naga"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Tikus") || (shio_pasangan[index]=="Monyet"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Tikus") || (shio_pasangan[index]=="Kuda"))	{
				btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.tidakjodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();
						} } }); }
		
		else if ((shio_anda[index]=="Tikus") || (shio_pasangan[index]=="Kelinci"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Kerbau") || (shio_pasangan[index]=="Ayam"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kerbau") || (shio_pasangan[index]=="Tikus"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kerbau") || (shio_pasangan[index]=="Macan"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Kerbau") || (shio_pasangan[index]=="Kuda"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Macan") || (shio_pasangan[index]=="Anjing"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Macan") || (shio_pasangan[index]=="Kuda"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Macan") || (shio_pasangan[index]=="Kambing"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Macan") || (shio_pasangan[index]=="Kerbau"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Naga") || (shio_pasangan[index]=="Tikus"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Naga") || (shio_pasangan[index]=="Monyet"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Naga") || (shio_pasangan[index]=="Kerbau"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Naga") || (shio_pasangan[index]=="Kambing"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Ular") || (shio_pasangan[index]=="Kerbau"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Ular") || (shio_pasangan[index]=="Ayam"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Ular") || (shio_pasangan[index]=="Babi"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Ular") || (shio_pasangan[index]=="Monyet"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Kuda") || (shio_pasangan[index]=="Macan"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kuda") || (shio_pasangan[index]=="Anjing"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kuda") || (shio_pasangan[index]=="Kuda"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kuda") || (shio_pasangan[index]=="Tikus"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Kuda") || (shio_pasangan[index]=="Monyet"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Kambing") || (shio_pasangan[index]=="Babi"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kambing") || (shio_pasangan[index]=="Kelinci"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kambing") || (shio_pasangan[index]=="Tikus"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Kambing") || (shio_pasangan[index]=="Kerbau"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Monyet") || (shio_pasangan[index]=="Tikus"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Monyet") || (shio_pasangan[index]=="Naga"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Monyet") || (shio_pasangan[index]=="Kuda"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Monyet") || (shio_pasangan[index]=="Ular"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Ayam") || (shio_pasangan[index]=="Kerbau"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Ayam") || (shio_pasangan[index]=="Ular"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Ayam") || (shio_pasangan[index]=="Kambing"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Ayam") || (shio_pasangan[index]=="Kelinci"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Anjing") || (shio_pasangan[index]=="Kuda"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Anjing") || (shio_pasangan[index]=="Macan"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Anjing") || (shio_pasangan[index]=="Ayam"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Anjing") || (shio_pasangan[index]=="Naga"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Babi") || (shio_pasangan[index]=="Kambing"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Babi") || (shio_pasangan[index]=="Kelinci"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Babi") || (shio_pasangan[index]=="Monyet"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Babi") || (shio_pasangan[index]=="Ular"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Kelinci") || (shio_pasangan[index]=="Babi"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kelinci") || (shio_pasangan[index]=="Anjing"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					{
						gambar.setImageResource(R.drawable.jodoh);
				 		Context context = getApplicationContext();
				 		CharSequence text = "Selamaat!!\n"
								+ nama_anda.getText().toString() + " dan " + nama_pasangan.getText().toString() +
								" kalian pasangan yang cocok";
				 		int duration = Toast.LENGTH_LONG;
				 		
				 		Toast toast = Toast.makeText(context, text, duration);
				 		toast.setGravity(Gravity.CENTER, 1,00);
				 		toast.show();		
					} 	}	});	}
		
		else if ((shio_anda[index]=="Kelinci") || (shio_pasangan[index]=="Ayam"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else if ((shio_anda[index]=="Kelinci") || (shio_pasangan[index]=="Tikus"))	{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Maaf, ternyata kalian bukan pasangan yang cocok :(";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
		
		else{
			btnHasil.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				{
					gambar.setImageResource(R.drawable.tidakjodoh);
			 		Context context = getApplicationContext();
			 		CharSequence text = "Kalian bisa menjadi pasangan yang cocok" +
			 							"\nTetap lanjutkan ya hubungan kalian ^^";
			 		int duration = Toast.LENGTH_LONG;
			 		
			 		Toast toast = Toast.makeText(context, text, duration);
			 		toast.setGravity(Gravity.CENTER, 1,00);
			 		toast.show();
					} } }); }
	
	}catch (Exception e) {
    e.printStackTrace();
	}
}

public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub
Toast.makeText(this, "Nama/Shio belum dipilih" , Toast.LENGTH_LONG).show();
	}
}