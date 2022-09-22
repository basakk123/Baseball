package site.metacoding.blue.domain.team;

import java.util.List;


public interface TeamDao {
	public void insert(Team team);
	public Team findById(Integer id);
	public List<Team> findAll();
	public void update(Team team);
	public void deleteById(Integer id);
}
