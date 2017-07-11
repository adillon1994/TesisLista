package com.alberto.tesisjunta;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Menus extends AppCompatActivity {

    WebView pagina;
    int pag;
    public Intent vamos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        ActionBar flecha= getSupportActionBar();
        flecha.setDisplayHomeAsUpEnabled(true);

        Bundle extra =getIntent().getExtras();
        pag =extra.getInt("menus");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.multicamara, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                vamos = new Intent(Menus.this, MulticamaraActivity.class);
                startActivity(vamos);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
    protected void onResume(){
        super.onResume();

        switch (pag){
            case 1:
                pagina= (WebView)findViewById(R.id.webview);

                pagina.loadUrl("http://mlb.mlb.com/stats/sortable.jsp#elem=%5Bobject+Object%5D&tab_level=child&click_text=Sortable+Player+hitting&game_type='R'&season=2017&season_type=ANY&league_code='MLB'&sectionType=sp&statType=hitting&page=1&ts=1497045416474");

                pagina.setWebViewClient(new WebViewClient(){
                    public boolean shouldOverrideUrlloading(WebView view,String url){
                        return false;

                    }
                });
                break;
            case 2:
                pagina= (WebView)findViewById(R.id.webview);

                pagina.loadUrl("http://m.mlb.com/news/");

                pagina.setWebViewClient(new WebViewClient(){
                    public boolean shouldOverrideUrlloading(WebView view,String url){
                        return false;

                    }
                });
                break;
            case 3:
                pagina= (WebView)findViewById(R.id.webview);

                pagina.loadUrl("http://mlb.mlb.com/mlb/schedule/index.jsp?src=rs#date=04/02/2017");

                pagina.setWebViewClient(new WebViewClient(){
                    public boolean shouldOverrideUrlloading(WebView view,String url){
                        return false;

                    }
                });
                break;



        }
    }
}