package pnj.latihan.latihanprojectti6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import pnj.latihan.latihanprojectti6.page.dashboard.DashboardFragment;
import pnj.latihan.latihanprojectti6.page.home.HomeFragment;
import pnj.latihan.latihanprojectti6.page.notification.NotificationFragment;

public class HalamanDepan extends AppCompatActivity {

    DashboardFragment dashboardFragment = new DashboardFragment();
    HomeFragment homeFragment = new HomeFragment();
    NotificationFragment notificationFragment = new NotificationFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_depan);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.containerFragment, homeFragment);
        fragmentTransaction.commit();

        BottomNavigationView navMenu = findViewById(R.id.navMenu);

        navMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.navigation_dashboard:
                        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.containerFragment, dashboardFragment);
                        fragmentTransaction1.commit();
                        break;
                    case R.id.navigation_home:
                        FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.containerFragment, homeFragment);
                        fragmentTransaction2.commit();
                        break;
                    case R.id.navigation_notifications:
                        FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.containerFragment, notificationFragment);
                        fragmentTransaction3.commit();
                        break;


                }

                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.contoh_menu_option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_menu1:
                Toast.makeText(this, "Menu 1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_menu2:
                Toast.makeText(this, "Menu 2", Toast.LENGTH_SHORT).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}