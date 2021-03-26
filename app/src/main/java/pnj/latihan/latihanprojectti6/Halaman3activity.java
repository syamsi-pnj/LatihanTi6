package pnj.latihan.latihanprojectti6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Halaman3activity extends AppCompatActivity {

    TextView txtPesan;
    Button actionPindah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3activity);
        txtPesan = findViewById(R.id.txtPesan);
        actionPindah = findViewById(R.id.actionPindah);
        actionPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selesai();
            }
        });
    }

    void selesai() {
        Intent intent = new Intent();
        intent.putExtra("data_terima", "Ini data dari halaman 3");
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("data_satu","");
        int dataDua = extras.getInt("data_dua",0);
        txtPesan.setText(msg +" : "+dataDua);
    }
}