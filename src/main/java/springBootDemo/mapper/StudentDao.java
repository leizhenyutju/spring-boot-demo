package springBootDemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import springBootDemo.entity.Student;

@Mapper
public interface StudentDao {

	public Student get(Long id);
}
