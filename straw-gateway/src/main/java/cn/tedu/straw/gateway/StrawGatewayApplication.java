package cn.tedu.straw.gateway;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableZuulProxy
@EnableRedisHttpSession
@MapperScan("cn.tedu.straw.gateway.mapper")
public class StrawGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrawGatewayApplication.class, args);
    }

}

