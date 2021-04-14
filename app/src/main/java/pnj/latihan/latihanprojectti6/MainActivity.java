package pnj.latihan.latihanprojectti6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnPindah, actionBukaWeb,actionTanggal,actionJam;
    TextView txtPesan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Proses : ", "onCreate");
        setContentView(R.layout.activity_main);
        setTitle("Hallo");
        txtPesan = findViewById(R.id.txtPesan);
        actionTanggal = findViewById(R.id.actionTanggal);
        actionJam = findViewById(R.id.actionJam);

        btnPindah = findViewById(R.id.btnPindah);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // event click
                pindah();
//                tampilkanDialog();
            }
        });
        actionBukaWeb = findViewById(R.id.actionBukaWeb);
        actionBukaWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaWeb();
            }
        });

        actionJam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilihJam();
            }
        });

        actionTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilihTanggal();
            }
        });
    }

    void bukaWeb() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(intent);
    }

    void pindah() {
        Intent intent = new Intent(this, Halaman3activity.class);
        intent.putExtra("data_satu", "Ini data Dari Halaman MainActivity");
        intent.putExtra("data_dua", 10);

//        startActivity(intent);
        startActivityForResult(intent, 100);
    }

    void tampilkanDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Halo Apa Kabar?");
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //event click
                tampilkanProgressDialog();
            }
        });

        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //event Click
                tampilkanToast();
            }
        });

        alert.show();
    }

    void tampilkanToast() {
        Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show();
    }

    void tampilkanProgressDialog() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");

        progressDialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.dismiss();
            }
        }, 3000L);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Proses : ", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Proses : ", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Proses : ", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Proses : ", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Proses : ", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Proses : ", "onDestroy");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == 100) {
                Bundle extras = data.getExtras();
                String msg = extras.getString("data_terima", "");
                txtPesan.setText(msg);
            }
        }
    }


    Calendar calendar = Calendar.getInstance();

    DatePickerDialog.OnDateSetListener datePicker = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
            calendar.set(Calendar.MONTH,month);

            txtPesan.setText(simpleDateFormat.format(calendar.getTime()));

        }
    };

    TimePickerDialog.OnTimeSetListener timePicker = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
            calendar.set(Calendar.MINUTE, minute);
            txtPesan.setText(simpleDateFormat.format(calendar.getTime()));
        }
    };

    void pilihTanggal() {
        new DatePickerDialog(this,datePicker,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    void pilihJam() {
        new TimePickerDialog(this,timePicker,calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),true).show();
    }


}