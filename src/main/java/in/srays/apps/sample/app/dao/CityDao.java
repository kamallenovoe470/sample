/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.srays.apps.sample.app.dao;

import in.srays.apps.sample.app.pojo.City;
import java.util.List;

/**
 *
 * @author kamal
 */
public interface CityDao {

    List<City> load();
}
