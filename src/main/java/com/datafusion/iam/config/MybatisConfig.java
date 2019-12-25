package com.datafusion.iam.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.datafusion.iam.sql.mapper")
public class MybatisConfig {
}
