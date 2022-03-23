package org.NagarroProjects.configuration;


import org.NagarroProjects.dao.Bookdao;
import org.NagarroProjects.dao.Dao;
import org.NagarroProjects.dao.UserDao;
import org.NagarroProjects.daoImp.BookDaoImp;
import org.NagarroProjects.daoImp.DaoImp;
import org.NagarroProjects.daoImp.UserDaoImp;
import org.NagarroProjects.service.BookService;
import org.NagarroProjects.service.BookServiceImp;
import org.NagarroProjects.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@EnableScheduling
public class AppConfig {
	
	@Bean
	public Dao getDao() {
		return new DaoImp();
	}

	@Bean
	public UserDao getUserDao() {
		return new UserDaoImp();
	}

	@Bean
	public UserService getUserService() {
		return new UserService();
	}
    
	@Bean
	public BookService getBookService()
	{
		return new BookServiceImp();
	}
	
	@Bean 
	public Bookdao getBookDao()
	{
		return new BookDaoImp();
	}
	
}
