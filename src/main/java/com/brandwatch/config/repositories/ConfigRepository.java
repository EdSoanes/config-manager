package com.brandwatch.config.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

/**
 * Created by edso on 13/01/2017.
 */
@Component
public class ConfigRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Map<String, String> getConfig() {
        String sql = "SELECT property, value FROM config ORDER BY property";
        HashMap<String, String> res = new HashMap<String, String>();

//        jdbcTemplate.query(sql, (rs, rownum) -> {
//            String p = rs.getString("property");
//            String v = rs.getString("value");
//            res.put(p, v);
//                });

        return res;
    }
}
