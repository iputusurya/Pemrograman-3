package uas.aplikasi.shio;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class TentangKita extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tentangkita);
		TextView tentang = (TextView)findViewById(R.id.tentangkita1);
		tentang.setText("Nama" +
					  "\nCruz Ridho Pradana" +
				      "\n\nKelas" +
				      "\nTS-17" +
				      "\n\nNIM" +
				      "\n4511215042" +
				      "\n\nTanggal Lahir" +
				      "\nJakarta, 19 Oktober 1990" +
				      "\n\nAlamat" +
				      "\nPerumahan Beji Permai Blok S-11, Tanah Baru Depok" +
				      "\n\nNo Telp" +
				      "\n085782313562" +
				      "\n\nEmail" +
				      "\ncruzridho@gmail.com");
		
		TextView tentang2 = (TextView)findViewById(R.id.tentangkita2);
		tentang2.setText("Nama" +
					  "\nRieza Devi Anggraini" +
				      "\n\nKelas" +
				      "\nTS-17" +
				      "\n\nNIM" +
				      "\n4511215045" +
				      "\n\nTanggal Lahir" +
				      "\nJakarta, 17 Desember 1990" +
				      "\n\nAlamat" +
				      "\nJalan Nuri Blok W-1, Perumahan Pondok Mekarsari" +
				      "\n\nNo Telp" +
				      "\n085717350855" +
				      "\n\nEmail" +
				      "\nriezadevi@gmail.com");
		}
	}