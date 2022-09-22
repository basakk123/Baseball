package site.metacoding.blue.domain.stadium;

import java.util.List;

import site.metacoding.blue.web.dto.response.stadium.ListDto;


public interface StadiumDao {
	public void insert(Stadium stadium);
	public Stadium findById(Integer id);
	public List<ListDto> findAll();
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}
