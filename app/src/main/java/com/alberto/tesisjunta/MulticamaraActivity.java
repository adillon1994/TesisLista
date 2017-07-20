package com.alberto.tesisjunta;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.alberto.tesisjunta.DataStandings.American;
import com.alberto.tesisjunta.DataStandings.National;
import com.alberto.tesisjunta.DataWeather.Weather;
import com.alberto.tesisjunta.LOGIN.Controladores.Controlador;
import com.alberto.tesisjunta.LOGIN.LoginActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import butterknife.Bind;

public class MulticamaraActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public Intent ir;
    public Intent vamos;
    VideoView video1;
    VideoView video2;
    VideoView video3;
    VideoView video4;
    VideoView video5;
    AdView Publicidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multicamara);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        View cabecera =navigationView.getHeaderView(0);
        TextView nombre = (TextView)cabecera.findViewById(R.id.Nombre);
        String  [] dato = Controlador.perfil.split(":");
        nombre.setText(dato[2]);
        TextView correo = (TextView)cabecera.findViewById(R.id.CORREO);
        correo.setText(dato[1]);

        Publicidad = new AdView(this);
        Publicidad.setAdUnitId(getString(R.string.banner_ad_unit_id));
        Publicidad.setAdSize(AdSize.BANNER);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.Publicidad);
        AdRequest adRequest = new AdRequest.Builder().build();
        Publicidad.loadAd(adRequest);
        linearLayout.addView(Publicidad);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.multicamara, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.stats:
                vamos = new Intent(MulticamaraActivity.this, Menus.class);
                vamos.putExtra("menus", 1);
                startActivity(vamos);
                return true;
            case R.id.news:
                vamos = new Intent(MulticamaraActivity.this, Menus.class);
                vamos.putExtra("menus", 2);
                startActivity(vamos);
                return true;
            case R.id.calendar:
                vamos = new Intent(MulticamaraActivity.this, Menus.class);
                vamos.putExtra("menus", 3);
                startActivity(vamos);
                return true;
            case R.id.americana:
                vamos = new Intent(MulticamaraActivity.this, American.class);
                startActivity(vamos);
                return true;
            case R.id.nacional:
                vamos = new Intent(MulticamaraActivity.this, National.class);
                startActivity(vamos);
                return true;
            case R.id.weather:
                vamos = new Intent(MulticamaraActivity.this,Weather.class);
                startActivity(vamos);
                return true;
            case R.id.action_settings:
                vamos = new Intent(MulticamaraActivity.this, Informacion.class);
                startActivity(vamos);
                return true;
            case R.id.logout:
                vamos = new Intent(MulticamaraActivity.this,LoginActivity.class);
                startActivity(vamos);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    protected void onResume() {
        super.onResume();
        video1 = (VideoView) findViewById(R.id.video11);
        final Uri uri1 = Uri.parse("RTSP://192.168.198.127:5554/vs");
        video1.setVideoURI(uri1);
        video1.requestFocus();
        video1.start();
        video1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ir = new Intent(MulticamaraActivity.this, VideoGrande.class);
                ir.putExtra("camara", 1);
                startActivity(ir);

                return false;
            }
        });
        video2 = (VideoView) findViewById(R.id.video22);
        final Uri uri2 = Uri.parse("RTSP://192.168.198.127:5554/vs");
        video2.setVideoURI(uri2);
        video2.requestFocus();
        video2.start();
        video2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ir = new Intent(MulticamaraActivity.this, VideoGrande.class);
                ir.putExtra("camara", 2);
                startActivity(ir);

                return false;
            }
        });
        video3 = (VideoView) findViewById(R.id.video33);
        final Uri uri3 = Uri.parse("RTSP://192.168.198.127:5554/vs");
        video3.setVideoURI(uri3);
        video3.requestFocus();
        video3.start();
        video3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ir = new Intent(MulticamaraActivity.this, VideoGrande.class);
                ir.putExtra("camara", 3);
                startActivity(ir);

                return false;
            }
        });
        video4 = (VideoView) findViewById(R.id.video44);
        final Uri uri4 = Uri.parse("RTSP://192.168.198.127:5554/vs");
        video4.setVideoURI(uri4);
        video4.requestFocus();
        video4.start();
        video4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ir = new Intent(MulticamaraActivity.this, VideoGrande.class);
                ir.putExtra("camara", 4);
                startActivity(ir);

                return false;
            }
        });
        video5 = (VideoView) findViewById(R.id.video55);
        final Uri uri5 = Uri.parse("RTSP://192.168.198.127:5554/vs");
        video5.setVideoURI(uri5);
        video5.requestFocus();
        video5.start();
        video5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ir = new Intent(MulticamaraActivity.this, VideoGrande.class);
                ir.putExtra("camara", 5);
                startActivity(ir);

                return false;
            }
        });




    }
}