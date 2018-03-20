package com.foxminded.igorFrenkel.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.foxminded.igorFrenkel.dao.DAOException;
import com.foxminded.igorFrenkel.dao.sql.StudentSQL;
import com.foxminded.igorFrenkel.domain.Student;
import com.foxminded.igorFrenkel.domain.University;
import com.foxminded.igorFrenkel.domain.Group;

public class UniversityTest {

	@Test
	public void smokeTest_ProgrammeShouldWorkProperly() {
		University university = new University();
		assertTrue(university instanceof University);
	}

}
