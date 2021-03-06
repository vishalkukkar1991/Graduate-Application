//package gapp.model.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
//import org.testng.annotations.Test;
//
//import gapp.model.Application;
//import gapp.model.Department;
//import gapp.model.TermStatus;
//import gapp.model.dao.ApplicationDao;
//import gapp.model.dao.DepartmentDao;
//import gapp.model.dao.TermStatusDao;
//
//@Test(groups = "ApplicationDaoTest")
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
//public class ApplicationDaoTest extends AbstractTransactionalTestNGSpringContextTests {
//
//	@Autowired
//	ApplicationDao applicationDao;
//
//	@Autowired
//	DepartmentDao departmentDao;
//
//	@Autowired
//	TermStatusDao termStatusDao;
//
//	// Test case to check if one application is submitted for fall 2016 for
//	// accounting department
//	@Test
//	public void oneapplicationforaccountingforfall2016() {
//
//		TermStatus termStatus = termStatusDao.getTermStatusByName("fall", "2016");
//		Department department = departmentDao.getDepartmentByName("Accounting");
//
//		List<Application> application = applicationDao.getApplicationByDepartmentAndTerm(department, termStatus);
//
//		assert application.size() == 1;
//
//	}
//
//}