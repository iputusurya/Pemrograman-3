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
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Shio extends Activity implements OnItemSelectedListener{
/** Called when the activity is first created. */
Spinner spinnerTanggal;
String[] tanggal = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", 
					"11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
					"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
Spinner spinnerBulan;
String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
				"Agustus", "September", "Oktober", "November", "Desember"};
Spinner spinnerTahun;
String[] tahun = {"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", 
				"1980","1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
				"1990","1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000"};
public Button btnHasil;
public Button btExit;
public Button btnReset;
ImageView gambar;

@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.shio);

spinnerTanggal = (Spinner) findViewById(R.id.tanggal);
ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,tanggal);
aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnerTanggal.setAdapter(aa);
spinnerTanggal.setOnItemSelectedListener(this);

spinnerBulan = (Spinner) findViewById(R.id.bulan);
ArrayAdapter<String> ab = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,bulan);
ab.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnerBulan.setAdapter(ab);
spinnerBulan.setOnItemSelectedListener(this);

spinnerTahun = (Spinner) findViewById(R.id.tahun);
ArrayAdapter<String> ac = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,tahun);
ac.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinnerTahun.setAdapter(ac);
spinnerTahun.setOnItemSelectedListener(this);

gambar = (ImageView) findViewById(R.id.gambar);
gambar.setEnabled(false);
btnHasil = (Button)findViewById(R.id.BtnHasil);
btnReset = (Button)findViewById(R.id.BtnReset);

btnReset.setOnClickListener(new OnClickListener() {
	
	public void onClick(View view) {
		finish();
		
	Intent intent = new Intent(Shio.this, Shio.class);
		startActivity(intent);
		
	} }); }


public void onItemSelected(AdapterView<?> arg0, View arg1, int index,
long arg3) {
	
	try {
// TODO Auto-generated method stub
		
	if (tahun[index]=="1972" || tahun[index]=="1984"  || tahun[index]=="1996")	{
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					
					gambar.setImageResource(R.drawable.tikus);
					TextView judul = (TextView)findViewById(R.id.Judul);
					judul.setText("SHIO TIKUS" +
		             		"\n\nTahun 1960, 1972, 1984, 1996, 2008");
					
					TextView hasil = (TextView)findViewById(R.id.Hasil);
					hasil.setText("Kepribadian shio tikus"+
		             		"\n\nShio Tikus melambangkan karakter seperti kecerdasan, imajinasi dan rasa ingin tahu. "+
		             		"Shio Tikus memiliki kemampuan pengamatan yang tajam dan dengan keterampilan-keterampilan itu mereka dapat menyimpulkan banyak tentang orang lain dan situasi lain. "+
		             		"Shio Tikus penuh nasihat yang baik tetapi mereka tidak pernah akan berbagi masalah dengan orang lain. "+
		             		"Mereka adalah orang-orang jujur dan mereka menikmati hidup untuk saat ini. "+
		             		
		             		"\n\nKesehatan shio tikus"+
		             		"\n\nShio Tikus Secara keseluruhan menikmati kesehatan yang baik. "+
		             		"Mereka sangat aktif yang membantu menjaga mereka dalam bentuk dan mampu melawan penyakit. "+
		             		"Olahraga teratur yang dirancang untuk menenangkan akan menguntungkan Shio Tikus. "+
		             		
		             		"\n\nKarir shio tikus"+
		             		"\n\nSangat perseptif dan bijaksana, Shio Tikus bisa fokus pada gambaran besar. "+
		             		"Bahwa kemampuan bersama dengan penilaian baik mereka memungkinkan Shio Tikus untuk memecahkan masalah sebelum mereka muncul. "+
		             		"Pilihan karir yang baik meliputi : administrator, direktur, manajer, pengusaha, penyiar, penulis, musisi, pelawak, politisi, pengacara, peneliti, dan pembalap mobil. "+
		             		
		             		"\n\nPergaulan shio tikus"+
		             		"\n\nShio Tikus sangat menawan. "+
		             		"Mereka menikmati kegiatan sosial karena mereka selalu bertemu orang baru. " +
		             		"Siapapun berharap untuk bermitra dengan Shio Tikus harus mampu bersaing dengan sifat aktif Shio Tikus itu. "+
		             		
		             		"\n\nPasangan cocok shio tikus = Naga dan Monyet. "+
		             		"\nPasangan tidak cocok shio tikus = Kuda dan Shio Kelinci. ");
		    	}
			});
				}
		
		else if (tahun[index]=="1973" || tahun[index]=="1985" || tahun[index]=="1997"){
			btnHasil.setOnClickListener(new OnClickListener() {
				
				public void onClick(View view) {
					
					gambar.setImageResource(R.drawable.kerbau);
					TextView judul = (TextView)findViewById(R.id.Judul);
					judul.setText("SHIO KERBAU" +
		             		"\n\nTahun 1961, 1973, 1985, 1997, 2009");
					TextView hasil = (TextView)findViewById(R.id.Hasil);
					hasil.setText("Kepribadian Shio Kerbau"+
		             		"\n\nShio Kerbau memiliki karakter seperti ketergantungan, kekuatan dan tekad. "+
		             		"Shio Kerbau adalah toleran yang percaya bahwa jalan menuju keberhasilan melibatkan kerja keras dan perilaku teliti, mereka tidak percaya pada mengambil jalan pintas. "+
		             		"Mereka juga mampu membuat orang lain percaya dan akan mendengarkan pendapat mereka dengan pikiran terbuka. "+
		             		"Namun, Shio Kerbau suka membuat keputusan yang didasarkan pada penelitian mereka sendiri. "+
		             		
		             		"\n\nkesehatan Shio Kerbau"+
		             		"\n\nShio Kerbau adalah individu yang kuat secara keseluruhan sehat dan hidup panjang, memenuhi hidup. "+
		             		"Namun, mereka cenderung bekerja terlalu banyak, jarang membiarkan diri mereka cukup waktu untuk bersantai. "+
		             		
		             		"\n\nKarir Shio Kerbau"+
		             		"\n\nShio Kerbau lebih suka pekerjaan yang rutin. "+
		             		"Mereka mengambil pendekatan metodologis untuk tugas pekerjaan yang khusus. "+
		             		"Pilihan karir yang baik untuk meliputi Shio Kerbau: desainer, interior, pelukis, tukang kayu, pekerja tambang, arkeolog, ahli perkebunan, montir, insinyur, penggambar, bankir, broker, agen real estat dan perwira tentara. "+
		             		
		             		"\n\npergaulan Shio Kerbau"+
		             		"\n\nShio Kerbau tidak begitu suka bergaul dan jarang berpartisipasi dalam kegiatan kelompok. "+
		             		"Mereka benci berbasa-basi dan tidak akan membuang-buang waktu mereka menggoda. "+
		             		"Ketika Shio Kerbau menyadari bahwa kemitraan yang melibatkan dua orang dan dua sudut pandang, memuaskan pertandingan yang mungkin. "+
		             		
		             		"\n\nPasangan cocok shio kerbau = Tikus dan Ayam."+
		             		"\nPasangan tidak cocok shio kerbau = Macan dan Kuda");
		    	}
			});
				}
		
		
		else if (tahun[index]=="1974" || tahun[index]=="1986" || tahun[index]=="1998"){
	btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.macan);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO MACAN" +
             		"\n\nTahun 1965, 1974, 1986, 1998, 2010");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Macan"+
						"\n\nShio Macan melambangkan karakter seperti keberanian, daya saing dan tidak dapat diprediksi. "+
						"Shio Macan suka ditantang dan akan menerima tantangan apapun jika itu berarti melindungi orang yang dicintai atau melindungi kehormatan mereka. "+
						"Mereka tidak khawatir tentang hasilnya karena mereka tahu bahwa mereka akan selalu mendarat di kaki mereka. "+ 
						"Shio Macan bisa keras kepala jika mereka menyadari bahwa mereka tidak bertanggung jawab. "+ 
						"Mereka memiliki sedikit kecenderungan untuk mementingkan diri sendiri tapi secara keseluruhan, Shio Macan sangat murah hati. "+
						
						"\n\nKesehatan Shio Macan"+
						"\n\nSeperti yang mereka lakukan musuh-musuh mereka, Shio Macan memiliki kecenderungan untuk menerkam pekerjaan mereka. Setelah itu, mereka meninggalkan merasa lelah. "+
						"Meskipun mereka akan segera bangkit kembali, dari waktu ke waktu pendekatan ini dapat menyebabkan masalah dengan kesehatan mereka. "+
						"Shio Macan perlu mengembangkan pendekatan yang lebih seimbang untuk hidup sehingga mereka dapat memanfaatkan energi mereka lebih efisien. "+
					
						"\n\nKarir Shio Macan"+
						"\n\nShio Macan memiliki kebutuhan terus-menerus untuk ditantang yang mungkin menjelaskan mengapa mereka melompat dari satu pekerjaan ke pekerjaan. "+
						"Beberapa karir yang cocok untuk meliputi Shio Macan: agen iklan, manajer kantor, agen perjalanan, aktor, penulis, seniman, pilot, pramugari, musisi, pelawak dan sopir. "+
					
						"\n\nPergaulan Shio Macan"+
						"\n\nKreatif dalam gairah mereka, Shio Macan tidak akan pernah dikenakan pasangan mereka. "+
						"Mereka ekspresif,sopan dan dapat dipercaya, tapi hati-hati. "+
						"Shio Macan cenderung mendominasi hubungan mereka. "+
						"Kecenderungan ini naluriah dan ketika dipantau ketat, perilaku tersebut dapat dikendalikan. "+
					
						"\n\nPasangan cocok shio Macan = Anjing dan Kuda."+
						"\nPasangan tidak cocok shio Macan = Kambing dan Shio Kerbau. ");
    	}
	});
		}

else if (tahun[index]=="1975" || tahun[index]=="1987" || tahun[index]=="1999"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.kelinci);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO KELINCI" +
             		"\n\nTahun 1963, 1975, 1987, 1999, 2011");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Kelinci"+
						"\n\nShio Kelinci melambangkan karakter seperti kreativitas, kasih sayang, dan sensitivitas. "+
						"Shio Kelinci yang ramah, keluar dan lebih menyukai perusahaan orang lain. "+
						"Mereka juga lebih memilih untuk menghindari konflik. "+
						"Dalam situasi konfrontatif, Shio Kelinci pendekatan tenang dan dengan pertimbangan untuk pihak lain. "+
						"Shio Kelinci percaya pada teman-teman dan keluarga dan obligasi tersebut kurang dapat mengakibatkan masalah emosional. "+
						"Karena mereka hewan tenang, Shio Kelinci mudah dimanfaatkan. "+ 
						"sifat sensitif mereka membuat mereka menghindar dari situasi agresif atau kompetitif. "+
						"Mereka secara keseluruhan konservatif dan tidak tertarik untuk mengambil risiko. "+
						"Shio Kelinci terus mengambil risiko yang kadang-kadang menyebabkan mereka kehilangan kesempatan yang baik. "+
					
						"\n\nKesehatan Shio Kelinci"+
						"\n\nMeskipun Shio Kelinci biasanya tidak terlihat marah atau stres, mereka cenderung untuk menjaga perasaan didalamnya. "+
						"Ketika mereka tidak mengungkapkan perasaan ini, perasaan seperti itu dapat menyebabkan Shio Kelinci menjadi sakit. "+
						"Shio Kelinci dapat mengambil manfaat dari kegiatan sehari-hari lebih banyak yang makan mengurangi tingkat stres mereka dan lebih baik kesehatan mereka. "+
					
						"\n\npergaulan Shio Kelinci"+
						"\n\nShio Kelinci sangat seksual, tetapi cenderung memberikan lebih banyak diri mereka dari yang seharusnya. Hal ini dapat menyebabkan harapan tidak realistis dan situasi yang tidak sehat. "+
						"Shio Kelinci membutuhkan mitra yang tidak akan mengambil keuntungan dari sifat mereka memberi. "+
						
						"\n\nkarir Shio Kelinci"+
						"\n\nShio Kelinci adalah mengartikulasikan dan komunikator yang baik yang mengapa teman-teman dan kenalan mencari nasihat mereka. "+ 
						"Karir bagus lain untuk Shio Kelinci adalah: penulis, penerbit, aktor, perancang busana, terapis, dokter, administrator, hubungan masyarakat, dan guru. "+
					
						"\n\nPasangan cocok shio Shio Kelinci = Babi dan Anjing. "+
						"\nPasangan tidak cocok shio Shio Kelinci = Ayam dan Tikus. ");
    	}
	});
}
		
else if (tahun[index]=="1976" || tahun[index]=="1988" || tahun[index]=="2000"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.naga);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO NAGA" +
             		"\n\nTahun 1964, 1976, 1988, 2000, 2012");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Naga"+
						"\n\nShio Naga melambangkan karakter seperti dominasi dan ambisi. "+
						"Shio Naga lebih suka hidup dengan aturan mereka sendiri dan jika dibiarkan sendiri, biasanya sukses. "+
						"Mereka didorong, tidak takut tantangan, dan bersedia mengambil risiko. "+
						"Mereka bergairah dalam segala yang mereka lakukan dan mereka melakukan hal-hal dalam mode grand. "+
						"Sayangnya, gairah dan antusiasme bisa meninggalkan naga merasa lelah dan menarik, tidak terpenuhi. "+
						"Shio Naga lebih suka menyendiri, mungkin itu adalah karena mereka yang paling sukses ketika bekerja sendirian. "+
						"preferensi mereka sendirian bisa tampil sebagai kesombongan atau kegagahan, namun kualitas ini tidak berlaku. "+
					
						"\n\nKesehatan Shio Naga"+
						"\n\nMengingat sifat mereka yang bekerja keras, Shio Naga sehat secara keseluruhan. "+
						"Mereka merasa tertekan dan menderita ketegangan periodik / sakit kepala, mungkin karena mereka mengambil risiko begitu banyak. "+
						"Shio Naga dapat mengambil manfaat dari kegiatan ringan memasukkan ke dalam kehidupan mereka. "+
						"Yoga atau akan berjalan baik kegiatan ini dapat bekerja baik pikiran mereka dan tubuh mereka. "+
						
						"\n\nKarir Shio Naga"+
						"\n\nShio Naga lebih mengarah ke yang dipimpin. "+
						"Pekerjaan yang memungkinkan mereka untuk mengekspresikan kreativitas mereka adalah pilihan yang baik ."+
						"Beberapa karir yang baik meliputi: penemu, manajer, analis komputer, pengacara, insinyur, arsitek, broker, dan orang penjualan. "+
					
						"\n\nPasangan cocok shio naga = Monyet atau Tikus. "+
						"\nPasangan tidak cocok shio naga = Kerbau dan Kambing. ");
    	}
	});
}

else if (tahun[index]=="1977" || tahun[index]=="1989"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.ular);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO ULAR" +
             		"\n\nTahun 1965, 1977, 1989, 2001");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Ular"+
						"\n\nShio Ular melambangkan karakter seperti kecerdasan, keanggunan dan materialisme. "+
						"Ketika datang untuk pengambilan keputusan, Shio Ular sangat analitis dan sebagai hasilnya, mereka tidak melompat ke dalam situasi. "+
						"Mereka efektif mendapatkan hal-hal yang mereka inginkan, bahkan jika itu berarti mereka harus skema dan plot sepanjang jalan. "+
						"Shio Ular adalah makhluk yang sangat materialistis, memilih untuk mengelilingi diri dengan kehidupan terbaik yang ditawarkan. "+
						
						"\n\nKesehatan Shio Ular"+
						"\n\nShio Ular lebih memilih hidup ketenangan, lebih suka ketenangan atas kebisingan dan beban kerja yang dikelola daripada jadwal yang terlalu-dipesan. "+
						"Shio Ular menjadi mudah stres ketika hidup mereka tidak damai atau dalam rangka. "+
						
						"\n\nKarir Shio Ular"+
						"\n\nShio Ular bekerja sangat keras. "+
						"Sikap mereka agak santai menyebabkan mereka menjadi keliru dikategorikan sebagai pemalas, tidak bisa lebih jauh dari kebenaran. "+
						"Ular sangat kreatif dan sangat rajin. "+
						"Pilihan karir yang baik untuk Shio Ular meliputi: ilmuwan, analis, penyidik, pelukis, potter, perhiasan, peramal, penyihir, ahli gizi, dan sosiolog. "+
					
						"\n\nPergaulan Shio Ular"+
						"\n\nShio Ular adalah mereka yang menjadi orang-orang untuk memutuskan kapan suatu hubungan memiliki potensi dan ketika itu tidak. "+
						"Begitu mereka telah memilih pasangan, sisi tidak aman sebuah Shio Ular akan mulai menunjukkan melalui. "+
						"Shio Ular lebih memilih untuk menjaga perasaan mereka kepada diri mereka sendiri. "+
					
						"\n\nPasangan cocok shio ular = Ayam dan Shio Kerbau. "+
						"\nPasangan tidak cocok shio ular = Babi dan Monyet. ");
    	}
	});
}
		
else if (tahun[index]=="1978" || tahun[index]=="1990"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.kuda);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO KUDA" +
             		"\n\nTahun 1966, 1978, 1990, 2002");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Kuda"+
						"\n\nShio Kuda melambangkan karakter seperti kekuatan, energi, dan alam keluar. "+
						"Sangat animasi, Shio Kuda berkembang ketika mereka menjadi pusat perhatian. "+
						"Selalu mencari waktu yang baik, Shio Kuda menjaga orang banyak senang dengan humor dan kecerdasan mereka. "+
						"Shio Kuda sangat cerdas sehingga mereka mampu memahami subyek baru dengan mudah. "+
						"Shio Kuda jujur, ramah dan berpikiran terbuka. "+
						"Mereka mungkin agak terlalu berpusat pada diri mereka sendiri dan telah dikenal untuk membuat ulah ketika situasi tidak pergi jalan mereka. "+
					
						"\n\nKesehatan Shio Kuda"+
						"\n\nShio Kuda sangat sehat, kemungkinan besar karena mereka mempertahankan pandangan positif terhadap kehidupan dan karena mereka atletik. "+
						"Shio Kuda Mengarah ke lebar, ruang terbuka dan menonton mereka berlari bebas!"+
						"Shio Kuda biasanya akan hanya merasa sakit ketika mereka sedang terperangkap di dalam. "+
					
						"\n\nKarir Shio Kuda"+
						"\n\nShio Kuda menikmati posisi di mana mereka dapat berinteraksi dengan orang lain. "+
						"Mereka tidak suka menerima perintah dan mereka akan lari dari pekerjaan yang mereka anggap rutin. "+
						"Mereka mampu memahami subyek baru dengan mudah membuat mereka mampu menangani sebagian besar pekerjaan apa pun. "+
						"Mereka komunikator yang efektif dan mereka menikmati kekuasaan. "+
						"pilihan karir Baik untuk Shio Kuda meliputi: humas, perwakilan, penjualan, wartawan, instruktur bahasa, penerjemah, bartender, artis, operator tur, pustakawan atau pilot. "+
						"Mereka mampu memahami subyek baru dengan mudah membuat mereka mampu menangani sebagian besar pekerjaan apa pun. "+
					
						"\n\nPergaulan Shio Kuda"+
						"\n\nShio Kuda, yang spontan memiliki kecenderungan untuk jatuh cepat dan sulit bagi orang lain. "+
						"Mereka cenderung menyerahkan diri sepenuhnya dalam setiap hubungan baru. "+
					
						"\n\nPasangan cocok shio kuda = anjing atau Shio Macan. "+
						"\nPasangan tidak cocok shio kuda = Tikus atau Monyet. ");
    	}
	});
}
		
else if (tahun[index]=="1979" || tahun[index]=="1991"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.kambing);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO KAMBING" +
             		"\n\nTahun 1967, 1979, 1991, 2003");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Kambing"+
						"\n\nShio Kambing melambangkan karakter seperti kreativitas, kecerdasan dan ketenangan. "+
						"Nyaman berada sendirian untuk merenungkan kerja pikiran batin mereka, shio Kambing menikmati menjadi bagian dari grup, tapi lebih suka sela-sela daripada pusat. "+ 
						"Mereka cukup dan pendiam karena mereka menghabiskan banyak waktu tenggelam dalam pikiran mereka. "+
						"Ketika bepergian atau mencari hiburan, Shio Kambing lebih memilih kelompok atau tempat yang terus banyak orang. "+
					
						"\n\nkesehatan Shio Kambing"+
						"\n\nMungkin karena pada dasarnya Shio Kambing tenang, mereka cenderung memiliki lebih sedikit masalah kesehatan. "+
						"rapuh mereka menyembunyikan fakta eksterior mereka biasanya sangat sehat. "+
						"Ketika mereka senang,mereka sehat. "+
						"Ketika Shio Kambing menjadi tidak bahagia, terutama sebagai akibat dari asmara, mereka cepat menjadi sakit. "+
						
						"\n\npergaulan Shio Kambing"+
						"\n\nShio Kambing cenderung swasta, sehingga dapat mengambil upaya untuk mengenal satu. "+
						"Shio Kambing adalah orang yang akan memutuskan kapan dan dengan siapa ia akan berbagi kehidupan pribadinya. "+
						"Akibatnya, Shio Kambing yang paling memiliki sedikit “dekat” teman-teman, namun mereka akan bekerja keras bagi mereka yang mereka cintai. "+
					
						"\n\nkarir Shio Kambing"+
						"\n\nShio Kambing di tempat kerja kekuasaan dan status tidak penting. "+
						"Shio Kambing hanya akan menganggap peran kepemimpinan ketika ditanya langsung. "+
						"Mereka tidak akan pernah relawan. "+
						"Pilihan karir yang baik untuk Shio Kambing meliputi: florist, desainer interior, guru tempat penitipan anak, dokter anak, aktor, editor, penata rambut, ilustrator, musisi, dan guru seni sejarah. "+
						
						"\n\nPasangan cocok shio kambing = Shio Kelinci dan Babi. "+
						"\nPasangan tidak cocok shio kambing = Tikus atau kerbau. ");
    	}
	});
}
		
else if (tahun[index]=="1980" || tahun[index]=="1992"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.monyet);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO MONYET" +
             		"\n\nTahun 1968, 1980, 1992, 2004");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Monyet"+
						"\n\nShio Monyet memiliki karakter seperti rasa ingin tahu, kenakalan, dan kepandaian. "+
						"Meskipun niat mereka selalu baik, keinginan untuk menjadi orang iseng ini memiliki kecenderungan untuk membuat sakit akan dan melukai perasaan. "+
						"Shio Monyet lebih suka kehidupan kota ke desa, dan hobi favorit mereka adalah orang-orang-menonton. "+
					
						"\n\nKesehatan Shio Monyet"+
						"\n\nPercaya bahwa menjadi sakit adalah limbah dari hari yang berharga, Shio Monyet sangat jarang merasa sakit. "+
						"gaya hidup mereka terus aktif kemungkinan apa yang membantu Shio Monyet tetap dalam kesehatan yang baik. "+
						"Ketika Shio Monyet lakukan menjadi sakit, perasaan seperti umumnya hasil dari perasaan gugup. "+
					
						"\n\nKarir Shio Monyet"+
						"\n\nKetika datang untuk bekerja, Shio Monyet bisa melakukan apa saja. "+
						"Mereka beradaptasi dengan baik terhadap lingkungan yang berubah dan mereka sangat cerdas. "+
						"Karir untuk Shio Monyet meliputi: ilmuwan, insinyur, pedagang pasar saham, pengendali lalu lintas udara, dealer, sutradara film, perhiasan dan perwakilan penjualan. "+
					
						"\n\nPergaulan Shio Monyet"+
						"\n\nKetika datang ke hubungan, Shio Monyet yang tidak cepat untuk menetap. "+
						"Bahkan, mereka umumnya kecenderungan yang mungkin ada hubungannya dengan fakta bahwa Shio Monyet mudah bosan. "+
					
						"\n\nPasangan cocok shio monyet = Tikus atau Naga. "+
						"\nPasangan tidak cocok shio monyet = Kuda atau Ular. ");
    	}
	});
}
		
else if (tahun[index]=="1981" || tahun[index]=="1993"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.ayam);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO AYAM" +
             		"\n\nTahun 1969, 1981, 1993, 2005");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Ayam"+
						"\n\nShio ayam melambangkan karakter seperti kepercayaan, dan motivasi. "+
						"Keterusterangan mereka tidak berasal dari yang berarti tapi dari bersikap jujur, suatu sifat yang Shio Ayam diharapkan dari orang lain. "+
						"Shio Ayam sangat ramah dan suka menjadi pusat perhatian, selalu membual tentang diri mereka sendiri dan prestasi mereka. "+
						"Mereka sangat terorganisir individu yang dibuktikan dengan fakta bahwa rumah mereka selalu rapi. "+
					
						"\n\nKesehatan Shio Ayam"+
						"\n\nSecara keseluruhan, Shio Ayam adalah individu yang aktif yang menjaga mereka dalam kesehatan yang baik. "+
						"Ketika mereka sakit, mereka merasa lebih baik dengan cepat. "+ 
					
						"\n\nKarir Shio Ayam"+
						"\n\nShio Ayam bermotivasi tinggi dan pekerja keras, ciri-ciri yang memungkinkan Shio sebagian besar untuk memiliki karir yang sukses. "+
						"Tidak mengherankan, Shio Ayam membuat aktor yang baik, musisi dan penari. "+
						"pilihan karir lain yang baik untuk Ayam Jantan meliputi: CPA, bankir, dokter gigi, agen asuransi, sekretaris, dan penjaga buku. "+
					
						"\n\nPergaulan Shio Ayam"+
						"\n\nShio Ayam perlu bermitra dengan mereka yang berkulit keras. "+
						"Mereka individu yang paling mampu menyadari bahwa di balik eksterior yang sulit besar, hati peduli meluap dengan cinta. "+
					
						"\n\nPasangan cocok shio ayam = Kerbau atau Ular. "+
						"\nPasangan tidak cocok shio ayam = Kambing dan Shio Kelinci. ");
    	}
	});
}
		
else if (tahun[index]=="1970" || tahun[index]=="1982" || tahun[index]=="1994"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.anjing);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO ANJING" +
             		"\n\nTahun 1970, 1982, 1994, 2006");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Anjing"+
						"\n\nShio Anjing melambangkan sifat-sifat karakter seperti kesetiaan, kompatibilitas dan kebaikan. "+
						"Shio Anjing sering menawarkan kata-kata baik dan saran yang berguna, selalu mendengarkan dan pinjaman bahu ketika diperlukan. "+
						"Shio Anjing memiliki nilai persahabatan, mereka setia, jujur, dapat dipercaya dan dapat diandalkan dan memiliki moral dan etika. "+
						"Shio Anjing bisa mendapatkan keuntungan dengan belajar untuk rileks dan menjadi lebih rasional. "+
					
						"\n\nKesehatan Shio Anjing"+
						"\n\nShio Anjing sehat dan mudah bercerita karena Shio Anjing ulet, terutama ketika melawan penyakit. "+
					
						"\n\nPergaulan Shio Anjing"+
						"\n\nWalaupun Shio Anjing dapat dipercaya, mereka mengalami kesulitan mempercayai orang lain. "+
						"Ini dapat mengambil waktu lama sebelum Shio Anjing merasa nyaman dengan orang lain. "+
						"Ketika Shio Anjing tidak membangun kepercayaan mereka menghakimi dan kasar terhadap orang lain. "+
						"Shio Anjing dikenal dingin emosional dan kritis. "+
					
						"\n\nKarir Shio Anjing"+
						"\n\nRekan kerja selalu bisa mengandalkan Shio Anjing untuk membantu, terutama jika itu berarti Shio Anjing belajar sesuatu yang baru atau meringankan beban kerja orang lain. "+
						"Shio Anjing dilihat sebagai karyawan yang berharga. "+
						"Pilihan karir yang baik untuk anjing adalah: polisi, ilmuwan, konselor, desainer interior, profesor, politikus, pendeta, perawat, pegawai dan Hakim. "+
					
						"\n\nPasangan cocok shio anjing = Kuda atau Shio Macan. "+
						"\nPasangan tidak cocok shio anjing = Ayam dan Naga. ");
    	}
	});
}	
		
else if (tahun[index]=="1971" || tahun[index]=="1983" || tahun[index]=="1995"){
	
btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			
			gambar.setImageResource(R.drawable.babi);
			TextView judul = (TextView)findViewById(R.id.Judul);
			judul.setText("SHIO BABI" +
             		"\n\nTahun 1971, 1983, 1995, 2007");
			TextView hasil = (TextView)findViewById(R.id.Hasil);
			hasil.setText("Kepribadian Shio Babi"+
						"\n\nShio Babi melambangkan karakter seperti ketekunan, kasih sayang, dan kemurahan hati. "+
						"Shio Babi memberikan kenikmatan jiwa dan menuai banyak ketika mereka membantu orang lain, tapi kadang-kadang mereka memberi terlalu banyak. "+
						"Shio Babi mencari perdamaian dan akan melakukan apa yang diperlukan untuk mempertahankannya. "+
						"Sifat ini, sementara mengagumkan, kadang membuat mudah bagi orang lain untuk mengambil keuntungan dari Shio Babi. "+
						"Shio Babi selalu melakukan untuk orang lain, membantu pula mereka bisa, tapi jarang akan mereka meminta orang lain untuk bantuan. "+
						"Hal ini dapat membanjiri dan stres mereka, tetapi Shio Babi tidak keberatan. "+
					
						"\n\nKesehatan Shio Babi"+
						"\n\nSelalu mencari menyenangkan, Shio Babi sering memanjakan lebih dari yang seharusnya, makan minum, berlebihan dan merokok dapat menyebabkan penyakit. "+
						"Shio Babi tidak sangat aktif dan, dikombinasikan dengan perilaku berlebihan mereka, menyebabkan mereka untuk mendapatkan berat badan. "+
					
						"\n\nKarir Shio Babi"+
						"\n\nShio Babi menikmati tempat kerja dan selalu bisa diandalkan. "+
						"Mereka menikmati kesempatan yang memungkinkan mereka untuk mengekspresikan kreativitas mereka. "+
						"Shio Babi mempunyai sifat yang dikagumi oleh manajemen. "+
						"Shio Babi tidak takut untuk mengambil tanggung jawab. "+
						"Beberapa pilihan karir yang baik untuk Babi meliputi: penghibur, katering, dokter, dokter hewan, atau dekorator interior. "+
						"Mereka akan melakukannya dengan baik di eceran atau perhotelan. "+
					
						"\n\nPergaulan Shio Babi"+
						"\n\nMendukung dan memberi, Shio Babi membuat mitra besar. "+
						"Mereka sayang dan seksual dan lebih memilih tinggal di rumah daripada untuk pergi keluar. "+
						"Mereka menikmati apa yang mereka miliki, terutama rumah mereka dan keluarga. "+ 
						"Begitu mereka menemukan mitra yang tepat, mereka biasanya dilakukan untuk jangka panjang. "+
					
						"\n\nPasangan cocok shio babi = Shio Kelinci atau Kambing. "+
						"\nPasangan tidak cocok shio babi = Monyet dan Ular. ");
    	}
	});
}
	else{
	btnHasil.setOnClickListener(new OnClickListener() {
		
		public void onClick(View view) {
			{
		 		Context context = getApplicationContext();
		 		CharSequence text = "Pilih tanggal/bulan/tahun dulu :)";
		 		int duration = Toast.LENGTH_LONG;
		 		
		 		Toast toast = Toast.makeText(context, text, duration);
		 		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0,15);
		 		toast.show();
				} } }); }
	
	}catch (Exception e) {
    e.printStackTrace();
	}
}

public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub
Toast.makeText(this, "Tanggal/Bulan/Tahun belum dipilih" , Toast.LENGTH_LONG).show();
	}
}