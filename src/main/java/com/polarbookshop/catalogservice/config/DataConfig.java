package com.polarbookshop.catalogservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@Configuration //Indica uma classe como fonte de configuração do Spring
@EnableJdbcAuditing //Permite auditoria para entidades persistentes
public class DataConfig {


}
