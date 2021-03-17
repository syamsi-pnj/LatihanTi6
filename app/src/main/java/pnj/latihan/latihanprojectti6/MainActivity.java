package pnj.latihan.latihanprojectti6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Proses : ", "onCreate");
        setContentView(R.layout.activity_main);
        setTitle("Hallo");
        btnPindah = findViewById(R.id.btnPindah);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // event click
//               pindah();
                tampilkanDialog();
            }
        });
    }

    void pindah(){
        Intent intent = new Intent(this, Halaman2.class);
        startActivity(intent);
    }

    void tampilkanDialog(){
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

    void tampilkanToast(){
        Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show();
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
}