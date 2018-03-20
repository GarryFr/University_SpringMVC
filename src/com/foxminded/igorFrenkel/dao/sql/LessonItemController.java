package com.foxminded.igorFrenkel.dao.sql;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.foxminded.igorFrenkel.dao.DAOException;
import com.foxminded.igorFrenkel.domain.LessonItem;
import com.foxminded.igorFrenkel.domain.Student;

@Controller
public class LessonItemController {

	/*@RequestMapping(value = "/lesson", method = RequestMethod.GET)
	public ModelAndView lessonItem() throws DAOException {

		LessonItem lessonItem = new LessonItem();
		LessonItemSQL lessonItemSQL = new LessonItemSQL();
		lessonItem = lessonItemSQL.retrieveById(2);
		
		return new ModelAndView("lessonId", "lessonItem", lessonItem);

	}*/

	@RequestMapping(value = "/showLesson", method = RequestMethod.GET)
	public String showLesson(LessonItem lessonItem, ModelMap model)
			throws DAOException {

		LessonItemSQL lessonItemSQL = new LessonItemSQL();
		lessonItem = lessonItemSQL.retrieveById(2);
		model.addAttribute("lesson", lessonItem.getLesson());
		model.addAttribute("classroom", lessonItem.getClassroom().getNumber());
		model.addAttribute("group", lessonItem.getGroup().getNumber());
		model.addAttribute("teacher", lessonItem.getTeacher().getName());
		model.addAttribute("date", lessonItem.getDate());
		model.addAttribute("id", lessonItem.getId());

		return "lesson";
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ModelAndView studentsList() throws DAOException {

		StudentSQL studentSQL = new StudentSQL();
		List<Student> students = studentSQL.retrieve();
		
		
		return new ModelAndView("students", "students", students );

	}
}
