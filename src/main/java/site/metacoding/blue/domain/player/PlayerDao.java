package site.metacoding.blue.domain.player;

import java.util.List;

import site.metacoding.blue.web.dto.response.player.ListDto;


public interface PlayerDao {
	public void insert(Player player);
	public Player findById(Integer id);
	public List<ListDto> findAll();
	public void update(Player player);
	public void deleteById(Integer id);
}
