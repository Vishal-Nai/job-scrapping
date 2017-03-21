/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.jaunt.Elements;
import java.util.List;

/**
 *
 * @author Hp
 */
public class dummy {
    Elements heading;
    Elements company;
    Elements city;
     List<String> timesjob;
     
    public Elements getHeading() {
        return heading;
    }

    public void setHeading(Elements heading) {
        this.heading = heading;
    }

    public Elements getCompany() {
        return company;
    }

    public void setCompany(Elements company) {
        this.company = company;
    }
    
     public Elements getCity() {
        return city;
    }

    public void setCity(Elements city) {
        this.city = city;
    }
    
    
    public List<String> getTimesjob() {
        return timesjob;
    }

    public void setTimesjob(List<String> timesjob) {
        this.timesjob = timesjob;
    }
    
}
