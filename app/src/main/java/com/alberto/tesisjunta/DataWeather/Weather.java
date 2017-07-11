package com.alberto.tesisjunta.DataWeather;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.alberto.tesisjunta.DataWeather.Remote.WeatherAPI;
import com.alberto.tesisjunta.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Callback;
import retrofit2.Response;

public class Weather extends AppCompatActivity {

   // @Bind(R.id.textView_city) TextView textView_city;
    @Bind(R.id.textView_temperature) TextView textView_temperature;
    @Bind(R.id.textView_lastUpdate) TextView textView_lastupdate;
    @Bind(R.id.textView_condition) TextView textView_condition;
    @Bind(R.id.weather_icon)
    ImageView weatherIcon;

    String texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ButterKnife.bind(this);
        ActionBar flecha= getSupportActionBar();
        flecha.setDisplayHomeAsUpEnabled(true);

    }
    @Override
    protected void onResume(){
        super.onResume();
        WeatherAPI.Factory.getIstance().getWeather().enqueue(new Callback<com.alberto.tesisjunta.DataWeather.Model.Weather>() {
            @Override
            public void onResponse(Response<com.alberto.tesisjunta.DataWeather.Model.Weather> response) {
                textView_temperature.setText(response.body().getQuery().getResults().getChannel().getItem().getCondition().getTemp()+ "°C");
               // textView_city.setText(response.body().getQuery().getResults().getChannel().getLocation().getCity());
                textView_lastupdate.setText(response.body().getQuery().getResults().getChannel().getLastBuildDate());
                textView_condition.setText(response.body().getQuery().getResults().getChannel().getItem().getCondition().getText());


                int resourceid = getResources().getIdentifier("drawable/i" + response.body().getQuery().getResults().getChannel().getItem().getCondition().getCode(), null,getPackageName());
                @SuppressWarnings("deprecation")
                Drawable weatherIconDrawable = getResources().getDrawable(resourceid);

                weatherIcon.setImageDrawable(weatherIconDrawable);

            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("Failed",t.getMessage());


            }
        });

    }

}