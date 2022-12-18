package simulationDemo;

import simulationDemo.business.CategoryManager;
import simulationDemo.business.CoursesManager;
import simulationDemo.business.EducatorManager;
import simulationDemo.core.logging.DatabaseLogger;
import simulationDemo.core.logging.ILogger;
import simulationDemo.core.logging.MailLogger;
import simulationDemo.dataAccess.HibernateDao;
import simulationDemo.dataAccess.JDBCDao;
import simulationDemo.entities.Category;
import simulationDemo.entities.Courses;
import simulationDemo.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		ILogger[] loggers= {new DatabaseLogger(), new MailLogger(),new DatabaseLogger()};
		
		Category category1=new Category(4, "Android");
		CategoryManager categoryManager=new CategoryManager(new HibernateDao(),loggers);
		categoryManager.add(category1);
		
		Courses course1=new Courses(4,"Python İle Veri Yapıları","py.jpg",500,"Python ile veri yapılarına giriş.");
		CoursesManager coursesManager=new CoursesManager(new HibernateDao(), loggers);
		coursesManager.add(course1);
		
		Educator educator=new Educator(1, "Engin", "Demiroğ","Software developing expert");
		EducatorManager educatorManager=new EducatorManager(new JDBCDao(), loggers);
		educatorManager.add(educator);
	}

}
