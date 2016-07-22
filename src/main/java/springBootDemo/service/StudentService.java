package springBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootDemo.entity.Student;
import springBootDemo.mapper.StudentDao;

@Service
public class StudentService {

		@Autowired
	   private StudentDao studentDao; 


	    public String show(){
	        return "hello world!";
	    }

	    public Student showDao(Long id){
	        return studentDao.get(id);
	    }
}
