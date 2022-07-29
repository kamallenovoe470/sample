/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.srays.apps.sample.app.dao;

import in.srays.apps.sample.app.pojo.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kamal
 */
@Repository("CityDao")
public class CityDaoImpl implements CityDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<City> load() {

        return jdbcTemplate.query(
                "select * from CITY order by city_name",
                (rs, rowNum)
                -> new City(
                        rs.getInt("City_code"),
                        rs.getString("city_name"),
                        rs.getInt("city_pincode")
                )
        );
    }

}
