package com.alberto.tesisjunta.DataStandings;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.alberto.tesisjunta.DataStandings.Model.SOService;
import com.alberto.tesisjunta.DataStandings.Remote.StandingsAPI;
import com.alberto.tesisjunta.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Callback;
import retrofit2.Response;

public class National extends AppCompatActivity {

    @Bind(R.id.equipos)
    TextView equipos;
    @Bind(R.id.ganados) TextView ganados;
    @Bind(R.id.perdidos) TextView perdidos;
    @Bind(R.id.Juegos) TextView juegos;
    @Bind(R.id.Ultimos) TextView ultimos;
    @Bind(R.id.fecha) TextView fecha;

    @Bind(R.id.equipos1) TextView equipos1;
    @Bind(R.id.ganados1) TextView ganados1;
    @Bind(R.id.perdidos1) TextView perdidos1;
    @Bind(R.id.Juegos1) TextView juegos1;
    @Bind(R.id.Ultimos1) TextView ultimos1;


    @Bind(R.id.equipos2) TextView equipos2;
    @Bind(R.id.ganados2) TextView ganados2;
    @Bind(R.id.perdidos2) TextView perdidos2;
    @Bind(R.id.Juegos2) TextView juegos2;
    @Bind(R.id.Ultimos2) TextView ultimos2;

    int i=0;

    //  @Bind(R.id.button_refresh) Button button_refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national);
        ButterKnife.bind(this);
        ActionBar flecha= getSupportActionBar();
        flecha.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onResume(){
        super.onResume();
        //   onClick_button_refresh();



        //   @OnClick(R.id.button_refresh) public void onClick_button_refresh(){


        StandingsAPI.Factory.getIstance().getSOservice().enqueue(new Callback<SOService>() {
            @Override
            public void onResponse(Response<SOService> response) {
                equipos.setText(response.body().getStanding().get(5).getLastName()+"\n" +
                        response.body().getStanding().get(6).getLastName()+"\n"+
                        response.body().getStanding().get(7).getLastName()+"\n"+
                        response.body().getStanding().get(8).getLastName()+"\n"+
                        response.body().getStanding().get(9).getLastName()+"\n");
                ganados.setText(response.body().getStanding().get(5).getWon()+"\n"+
                        response.body().getStanding().get(6).getWon()+"\n"+
                        response.body().getStanding().get(7).getWon()+"\n"+
                        response.body().getStanding().get(8).getWon()+"\n"+
                        response.body().getStanding().get(9).getWon()+"\n");
                perdidos.setText(response.body().getStanding().get(5).getLost()+"\n"+
                        response.body().getStanding().get(6).getLost()+"\n"+
                        response.body().getStanding().get(7).getLost()+"\n"+
                        response.body().getStanding().get(8).getLost()+"\n"+
                        response.body().getStanding().get(9).getLost()+"\n");
                juegos.setText(response.body().getStanding().get(5).getGamesBack()+"\n"+
                        response.body().getStanding().get(6).getGamesBack()+"\n"+
                        response.body().getStanding().get(7).getGamesBack()+"\n"+
                        response.body().getStanding().get(8).getGamesBack()+"\n"+
                        response.body().getStanding().get(9).getGamesBack()+"\n");
                ultimos.setText(response.body().getStanding().get(5).getLastTen()+"\n"+
                        response.body().getStanding().get(6).getLastTen()+"\n"+
                        response.body().getStanding().get(7).getLastTen()+"\n"+
                        response.body().getStanding().get(8).getLastTen()+"\n"+
                        response.body().getStanding().get(9).getLastTen()+"\n");

                equipos1.setText(response.body().getStanding().get(0).getLastName()+"\n" +
                        response.body().getStanding().get(1).getLastName()+"\n"+
                        response.body().getStanding().get(2).getLastName()+"\n"+
                        response.body().getStanding().get(3).getLastName()+"\n"+
                        response.body().getStanding().get(4).getLastName()+"\n");
                ganados1.setText(response.body().getStanding().get(0).getWon()+"\n"+
                        response.body().getStanding().get(1).getWon()+"\n"+
                        response.body().getStanding().get(2).getWon()+"\n"+
                        response.body().getStanding().get(3).getWon()+"\n"+
                        response.body().getStanding().get(4).getWon()+"\n");
                perdidos1.setText(response.body().getStanding().get(0).getLost()+"\n"+
                        response.body().getStanding().get(1).getLost()+"\n"+
                        response.body().getStanding().get(2).getLost()+"\n"+
                        response.body().getStanding().get(3).getLost()+"\n"+
                        response.body().getStanding().get(4).getLost()+"\n");
                juegos1.setText(response.body().getStanding().get(0).getGamesBack()+"\n"+
                        response.body().getStanding().get(1).getGamesBack()+"\n"+
                        response.body().getStanding().get(2).getGamesBack()+"\n"+
                        response.body().getStanding().get(3).getGamesBack()+"\n"+
                        response.body().getStanding().get(4).getGamesBack()+"\n");
                ultimos1.setText(response.body().getStanding().get(0).getLastTen()+"\n"+
                        response.body().getStanding().get(1).getLastTen()+"\n"+
                        response.body().getStanding().get(2).getLastTen()+"\n"+
                        response.body().getStanding().get(3).getLastTen()+"\n"+
                        response.body().getStanding().get(4).getLastTen()+"\n");

                equipos2.setText(response.body().getStanding().get(10).getLastName()+"\n" +
                        response.body().getStanding().get(11).getLastName()+"\n"+
                        response.body().getStanding().get(12).getLastName()+"\n"+
                        response.body().getStanding().get(13).getLastName()+"\n"+
                        response.body().getStanding().get(14).getLastName()+"\n");
                ganados2.setText(response.body().getStanding().get(10).getWon()+"\n"+
                        response.body().getStanding().get(11).getWon()+"\n"+
                        response.body().getStanding().get(12).getWon()+"\n"+
                        response.body().getStanding().get(13).getWon()+"\n"+
                        response.body().getStanding().get(14).getWon()+"\n");
                perdidos2.setText(response.body().getStanding().get(10).getLost()+"\n"+
                        response.body().getStanding().get(11).getLost()+"\n"+
                        response.body().getStanding().get(12).getLost()+"\n"+
                        response.body().getStanding().get(13).getLost()+"\n"+
                        response.body().getStanding().get(14).getLost()+"\n");
                juegos2.setText(response.body().getStanding().get(10).getGamesBack()+"\n"+
                        response.body().getStanding().get(11).getGamesBack()+"\n"+
                        response.body().getStanding().get(12).getGamesBack()+"\n"+
                        response.body().getStanding().get(13).getGamesBack()+"\n"+
                        response.body().getStanding().get(14).getGamesBack()+"\n");
                ultimos2.setText(response.body().getStanding().get(10).getLastTen()+"\n"+
                        response.body().getStanding().get(11).getLastTen()+"\n"+
                        response.body().getStanding().get(12).getLastTen()+"\n"+
                        response.body().getStanding().get(13).getLastTen()+"\n"+
                        response.body().getStanding().get(14).getLastTen()+"\n");

                fecha.setText("Last update "+response.body().getStandingsDate());


            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("Failed", t.getMessage());

            }
        });
    }
}

