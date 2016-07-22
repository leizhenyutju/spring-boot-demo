package springBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBootDemo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/show")
	public String show() {
		return studentService.show();
	}

	@RequestMapping(value = "/showDao/{id}", method = RequestMethod.GET)
	public Object showDao(@PathVariable Long id) {
		return studentService.showDao(id);
	}
}
