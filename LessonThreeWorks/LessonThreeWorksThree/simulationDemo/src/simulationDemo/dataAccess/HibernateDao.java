package simulationDemo.dataAccess;

import simulationDemo.entities.Category;
import simulationDemo.entities.Courses;
import simulationDemo.entities.Educator;

public class HibernateDao implements ICategoryDao, ICoursesDao, IEducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println("Added Educator with Hibernate: " + educator.getFirstName() + educator.getLastName());

	}

	@Override
	public void add(Courses courses) {
		System.out.println("Added Courses with Hibernate: " + courses.getName());

	}

	@Override
	public void add(Category category) {
		System.out.println("Added Category with Hibernate: " + category.getName());

	}

}
