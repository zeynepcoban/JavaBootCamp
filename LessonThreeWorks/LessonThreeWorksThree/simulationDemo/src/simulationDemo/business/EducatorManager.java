package simulationDemo.business;

import simulationDemo.core.logging.ILogger;
import simulationDemo.dataAccess.IEducatorDao;
import simulationDemo.entities.Educator;

public class EducatorManager {
	private IEducatorDao ieducatorDao;
	private ILogger[] loggers;

	public EducatorManager(IEducatorDao ieducatorDao, ILogger[] logger) {
		this.ieducatorDao = ieducatorDao;
		this.loggers = loggers;
	}

	public void add(Educator educator) {
		ieducatorDao.add(educator);
		for (ILogger logger : loggers) {
			logger.log(educator.getFirstName() + " " + educator.getLastName());
		 }

	}

}
