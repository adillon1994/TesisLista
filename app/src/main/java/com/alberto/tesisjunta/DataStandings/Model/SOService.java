
package com.alberto.tesisjunta.DataStandings.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SOService {

    @SerializedName("standings_date")
    @Expose
    private String standingsDate;
    @SerializedName("standing")
    @Expose
    private List<Standing> standing = null;

    public String getStandingsDate() {
        return standingsDate;
    }

    public void setStandingsDate(String standingsDate) {
        this.standingsDate = standingsDate;
    }

    public List<Standing> getStanding() {
        return standing;
    }

    public void setStanding(List<Standing> standing) {
        this.standing = standing;
    }

}
