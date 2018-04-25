package com.smallcode.mybatisdemo;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.smallcode.mybatisdemo.util.DbPoolConnection;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


@ServletComponentScan
@MapperScan("com.smallcode.mybatisdemo.dao")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        String sql = "insert into b_article(`title`) values('admin')";
//        try {
//            executeUpdateBySQL(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }


    private static void executeUpdateBySQL(String sql) throws SQLException {
        DbPoolConnection dbp = DbPoolConnection.getInstance();
        DruidPooledConnection con = dbp.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    private Connection conn;

    // 初始化
    public void init() {
        // 不同的数据库有不同的驱动
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:oracle:thin:@192.168.1.150:1521:XE";
        String user = "hr";
        String password = "123456";

        try {
            // 加载驱动
            Class.forName(driverName);
            // 设置 配置数据
            // 1.url(数据看服务器的ip地址 数据库服务端口号 数据库实例)
            // 2.user
            // 3.password
            conn = DriverManager.getConnection(url, user, password);
            // 开始连接数据库
            System.out.println("数据库连接成功..");
        } catch (ClassNotFoundException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

    }
}
