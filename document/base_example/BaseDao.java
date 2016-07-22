package base_example;

import java.util.List;

public interface BaseDao<T extends BaseEntity> {

	public T get(Long id);

	public Integer create(T entity);

	public Integer update(T entity);

	public Integer delete(T entity);

	public List<T> queryAll();
	
	public List<T> queryByCondition(Object entity);
}
