package site.metacoding.blue.domain.out;

import java.util.List;

import site.metacoding.blue.web.dto.response.out.ListDto;

public interface OutDao {
	public void insert(Out out);
	public Out findById(Integer id);
	public List<ListDto> findAll();
	public void update(Out out);
	public void deleteById(Integer id);
}
