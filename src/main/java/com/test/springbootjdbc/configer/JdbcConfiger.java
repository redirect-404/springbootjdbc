package com.test.springbootjdbc.configer;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.sql.SQLException;

//@Configuration
public class JdbcConfiger {


   // @Bean
   // @ConfigurationProperties(prefix = "jdbc") //前缀引入方式
    public DataSource dateSource(){
        DruidDataSource dateSource = new DruidDataSource();
        return dateSource;
    }

}
