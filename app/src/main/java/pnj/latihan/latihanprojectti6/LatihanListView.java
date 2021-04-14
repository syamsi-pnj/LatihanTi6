package pnj.latihan.latihanprojectti6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import pnj.latihan.latihanprojectti6.adapter.AdapterBerita;
import pnj.latihan.latihanprojectti6.data.BeritaModel;

public class LatihanListView extends AppCompatActivity {

    GridView listView;
    ArrayList<BeritaModel> datas = new ArrayList<>();
    AdapterBerita adapterBerita;
    String[] data = {"data 1", "data 2", "data 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_list_view);
        listView = findViewById(R.id.listView);
        adapterBerita = new AdapterBerita(this,R.layout.item_berita_layout);
        listView.setAdapter(adapterBerita);
        buatData();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, data);
//        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BeritaModel dataKlik = (BeritaModel) parent.getAdapter().getItem(position);

                Toast.makeText(LatihanListView.this, dataKlik.getJudul(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    void buatData() {
        BeritaModel data1 = new BeritaModel();
        data1.setGambar("https://akcdn.detik.net.id/community/media/visual/2021/04/13/mulia-buka-warung-ayam-remaja-ini-berikan-makanan-gratis-ke-lansia.jpeg?w=700&q=90");
        data1.setDeskripsi("Jakarta - Meski baru merintis usaha warung makan kecil-kecilan. Remaja ini rajin berikan makanan gratis ke orang-orang yang membutuhkan, terutama lansia.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Seorang remaja bernama Muhammad Hanif Asyraf Mohammad Ali, sukses membuat netizen kagum dengan ketulusan hatinya.\" +\n" +
                "                \"Remaja yang baru berusia 19 tahun ini, diketahui baru saja membuka warung ayam panggang yang masih berusia hitungan minggu.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Dilansir dari MalayMail (13/04), Hanif yang tinggal di Kota Bharu, Kelantan, memiliki tujuan yang mulia saat mendirikan Ayam Golek. Warung makan miliknya.");
        data1.setJudul("Mulia! Buka Warung Ayam, Remaja Ini Berikan Makanan Gratis ke Lansia");
        data1.setTanggal("Rabu, 14 Apr 2021 11:00 WIB");

        BeritaModel data2 = new BeritaModel();
        data2.setGambar("https://akcdn.detik.net.id/community/media/visual/2021/04/13/mulia-buka-warung-ayam-remaja-ini-berikan-makanan-gratis-ke-lansia.jpeg?w=700&q=90");
        data2.setDeskripsi("Jakarta - Meski baru merintis usaha warung makan kecil-kecilan. Remaja ini rajin berikan makanan gratis ke orang-orang yang membutuhkan, terutama lansia.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Seorang remaja bernama Muhammad Hanif Asyraf Mohammad Ali, sukses membuat netizen kagum dengan ketulusan hatinya.\" +\n" +
                "                \"Remaja yang baru berusia 19 tahun ini, diketahui baru saja membuka warung ayam panggang yang masih berusia hitungan minggu.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Dilansir dari MalayMail (13/04), Hanif yang tinggal di Kota Bharu, Kelantan, memiliki tujuan yang mulia saat mendirikan Ayam Golek. Warung makan miliknya.");
        data2.setJudul("Mulia! Buka Warung Ayam, Remaja Ini Berikan Makanan Gratis ke Lansia");
        data2.setTanggal("Rabu, 14 Apr 2021 11:00 WIB");

        BeritaModel data3 = new BeritaModel();
        data3.setGambar("https://akcdn.detik.net.id/community/media/visual/2021/04/13/mulia-buka-warung-ayam-remaja-ini-berikan-makanan-gratis-ke-lansia.jpeg?w=700&q=90");
        data3.setDeskripsi("Jakarta - Meski baru merintis usaha warung makan kecil-kecilan. Remaja ini rajin berikan makanan gratis ke orang-orang yang membutuhkan, terutama lansia.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Seorang remaja bernama Muhammad Hanif Asyraf Mohammad Ali, sukses membuat netizen kagum dengan ketulusan hatinya.\" +\n" +
                "                \"Remaja yang baru berusia 19 tahun ini, diketahui baru saja membuka warung ayam panggang yang masih berusia hitungan minggu.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Dilansir dari MalayMail (13/04), Hanif yang tinggal di Kota Bharu, Kelantan, memiliki tujuan yang mulia saat mendirikan Ayam Golek. Warung makan miliknya.");
        data3.setJudul("Mulia! Buka Warung Ayam, Remaja Ini Berikan Makanan Gratis ke Lansia");
        data3.setTanggal("Rabu, 14 Apr 2021 11:00 WIB");

        BeritaModel data4 = new BeritaModel();
        data4.setGambar("https://akcdn.detik.net.id/community/media/visual/2021/04/13/mulia-buka-warung-ayam-remaja-ini-berikan-makanan-gratis-ke-lansia.jpeg?w=700&q=90");
        data4.setDeskripsi("Jakarta - Meski baru merintis usaha warung makan kecil-kecilan. Remaja ini rajin berikan makanan gratis ke orang-orang yang membutuhkan, terutama lansia.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Seorang remaja bernama Muhammad Hanif Asyraf Mohammad Ali, sukses membuat netizen kagum dengan ketulusan hatinya.\" +\n" +
                "                \"Remaja yang baru berusia 19 tahun ini, diketahui baru saja membuka warung ayam panggang yang masih berusia hitungan minggu.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Dilansir dari MalayMail (13/04), Hanif yang tinggal di Kota Bharu, Kelantan, memiliki tujuan yang mulia saat mendirikan Ayam Golek. Warung makan miliknya.");
        data4.setJudul("Mulia! Buka Warung Ayam, Remaja Ini Berikan Makanan Gratis ke Lansia");
        data4.setTanggal("Rabu, 14 Apr 2021 11:00 WIB");

        BeritaModel data5 = new BeritaModel();
        data5.setGambar("https://akcdn.detik.net.id/community/media/visual/2021/04/13/mulia-buka-warung-ayam-remaja-ini-berikan-makanan-gratis-ke-lansia.jpeg?w=700&q=90");
        data5.setDeskripsi("Jakarta - Meski baru merintis usaha warung makan kecil-kecilan. Remaja ini rajin berikan makanan gratis ke orang-orang yang membutuhkan, terutama lansia.\n" +
                "\n" +
                "Seorang remaja bernama Muhammad Hanif Asyraf Mohammad Ali, sukses membuat netizen kagum dengan ketulusan hatinya." +
                "Remaja yang baru berusia 19 tahun ini, diketahui baru saja membuka warung ayam panggang yang masih berusia hitungan minggu.\n" +
                "\n" +
                "Dilansir dari MalayMail (13/04), Hanif yang tinggal di Kota Bharu, Kelantan, memiliki tujuan yang mulia saat mendirikan Ayam Golek. Warung makan miliknya.");
        data5.setJudul("Mulia! Buka Warung Ayam, Remaja Ini Berikan Makanan Gratis ke Lansia");
        data5.setTanggal("Rabu, 14 Apr 2021 11:00 WIB");

        datas.add(data1);
        datas.add(data2);
        datas.add(data3);
        datas.add(data4);
        datas.add(data5);

        adapterBerita.addAll(datas);
        adapterBerita.notifyDataSetChanged();

    }
}