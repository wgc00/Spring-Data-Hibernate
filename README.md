# Spring-Data-Hibernate
使用Spring-Data对数据库进行访问，Hibernate中的HQL实现了原有 SQL语句的实现


      @Bean(name = "entityManagerFactory")
        public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(DataSource dataSource) {
            LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
            bean.setDataSource(dataSource);
            bean.setPackagesToScan("com.wgc.persons.demo.entity");
            bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

            Properties properties = new Properties();
            //就在启动服务是，它会查看我们实体中的字段是否与数据库一致，如果不一致，它会自动修改，
            //如果把update该create ， 它会自动在数据库创建相对应的表
            properties.setProperty("hibernate.hbm2ddl.auto", "update");
            properties.setProperty("hibernate.show_sql", "true");
            properties.setProperty("hibernate.format_sql", "true");
            properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            bean.setJpaProperties(properties);
            return bean;
        }
