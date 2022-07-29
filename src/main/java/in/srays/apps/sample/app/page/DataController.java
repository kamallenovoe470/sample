/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.srays.apps.sample.app.page;

/**
 *
 * @author kamal
 */
import in.srays.apps.sample.app.dao.CityDao;
import in.srays.apps.sample.app.pojo.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    CityDao dao;

    @RequestMapping(value = {"/citys"}, method = RequestMethod.GET)
    public String contactusPage(Model model) {

        List<City> citys = jdbcTemplate.query(
                "select * from CITY",
                (rs, rowNum)
                -> new City(
                        rs.getInt("City_code"),
                        rs.getString("city_name"),
                        rs.getInt("city_pincode")
                )
        );
        model.addAttribute("citys", citys);
        return "dataPage";
    }

    @RequestMapping(value = {"/cityslist"}, method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("citys", dao.load());
        return "dataPage";
    }
}
