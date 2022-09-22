package site.metacoding.blue.domain.team;

import java.util.List;

import site.metacoding.blue.web.dto.response.team.ListDto;


public interface TeamDao {
	public void insert(Team team);
	public Team findById(Integer id);
	public List<ListDto> findAll();
	public void update(Team team);
	public void deleteById(Integer id);
}
