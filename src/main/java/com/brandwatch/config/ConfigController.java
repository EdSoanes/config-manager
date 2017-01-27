package com.brandwatch.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brandwatch.config.models.Config;

/**
 * Created by edso on 13/01/2017.
 */
@RestController
public class ConfigController
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public List<Config> index() {

        String sql = "SELECT * FROM config ORDER BY property";
        List<Config> res = jdbcTemplate.query(sql, (rs, rownum) -> {
            Config config = new Config();
            String[] names = rs.getString("property").split("\\.");
            config.setProperty(rs.getString("property"));
            config.setValue(rs.getString("value"));
            return config;
        });

        return res;
    }
}
