package com.alberto.tesisjunta.DataStandings.Remote;

import com.alberto.tesisjunta.DataStandings.Model.SOService;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by Alberto on 7/4/2017.
 */

public interface StandingsAPI {

        //http://gd2.mlb.com/components/game/mlb/year_2017/month_07/day_02/master_scoreboard.json

        String BASE_URL= "https://erikberg.com/";

        @GET("mlb/standings.json")
        Call<SOService> getSOservice();

        class Factory{

            private static StandingsAPI service;

            public static StandingsAPI getIstance(){

                if (service==null){
                    Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                            .baseUrl(BASE_URL)
                            .build();

                    service = retrofit.create(StandingsAPI.class);
                    return service;

                }else {
                    return service;
                }

            }
        }


}
