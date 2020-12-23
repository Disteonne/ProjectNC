package habrOne.net.codejava.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;


/*
*
* Для работы с Spring Data JPA нам надо создать два beans-компонента:
* EntityManagerFactory и JpaTransactionManager. Поэтому создадим другой конфигурационный класс JpaConfig:
*
*
* @EnableJpaRepositories: сообщает Spring Data JPA, что нужно искать классы репозитория в указанном пакете (net.codejava) для внедрения соответсвующего кода во время выполнения.
@EnableTransactionManagement: сообщает Spring Data JPA, чтобы тот генерировал код для управления транзакциями во время выполнения.

В этом классе первый метод создаёт экземпляр EntityManagerFactory для управления Persistence Unit нашей SalesDB (это имя указано выше в persistence.xml).

Последний метод создаёт экземпляр JpaTransactionManager для EntityManagerFactory, созданный методом ранее.

Это минимальная необходимая конфигурация для использования Spring Data JPA.
*
*
*
*
 */
@Configuration
@EnableJpaRepositories(basePackages = {"habrOne.net.codejava"})
@EnableTransactionManagement
public class JpaConfig {

    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory(){
        LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("SalesDB");
        return  factoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        JpaTransactionManager transactionManager=new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}
