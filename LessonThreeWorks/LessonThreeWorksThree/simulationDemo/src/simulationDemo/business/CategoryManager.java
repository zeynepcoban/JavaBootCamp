package simulationDemo.business;

import simulationDemo.core.logging.ILogger;
import simulationDemo.dataAccess.ICategoryDao;
import simulationDemo.entities.Category;

public class CategoryManager {
	private ICategoryDao IcategoryDao;
	private ILogger[] loggers;

	public CategoryManager(ICategoryDao icategoryDao, ILogger[] loggers) {
		this.IcategoryDao = icategoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		Category[] categories = { new Category(1, "Frontend"), new Category(2, "WEB"),
				new Category(3, "Artificial Intelligence") };
		for (Category category1 : categories) {
			if (category.getName() == category1.getName()) {
				throw new Exception("Category name cannot be repeated.");
			}

		}
		IcategoryDao.add(category);
		for (ILogger logger : loggers) {
			logger.log("Category saved");

		}
	}

}
