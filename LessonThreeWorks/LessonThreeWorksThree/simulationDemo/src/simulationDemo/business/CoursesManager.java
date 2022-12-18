package simulationDemo.business;

import simulationDemo.core.logging.ILogger;
import simulationDemo.dataAccess.ICoursesDao;
import simulationDemo.entities.Courses;

public class CoursesManager {

	private ICoursesDao icourseDao;
	private ILogger[] loggers;

	public CoursesManager(ICoursesDao icourseDao, ILogger[] loggers) {
		this.icourseDao = icourseDao;
		this.loggers = loggers;
	}

	public void add(Courses course) throws Exception {
		Courses[] courses = { new Courses(1, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "js.jpg", 200,
				"1,5 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz."),
				new Courses(2, "Programlamaya Giriş İçin Temel Kurs", "program.jpg", 150,
						"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin."),
				new Courses(3, "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", "react.jpg", 400,
						"2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.") };
		for (Courses course1 : courses) {
			if (course.getName().equals(course1)) {
				throw new Exception("Course name cannot be repeated");
			} else if (course.getPrice() < 0) {
				throw new Exception("The price of a course cannot be less than 0");
			}

		}
		icourseDao.add(course);
		for (ILogger logger : loggers) {
			logger.log("Course saved");
		}
	}
}
