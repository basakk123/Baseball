package site.metacoding.blue.domain.player;

import java.util.List;


public interface PlayerDao {
	public void insert(Player player);
	public Player findById(Integer id);
	public List<Player> findAll();
	public void update(Player player);
	public void deleteById(Integer id);
}
