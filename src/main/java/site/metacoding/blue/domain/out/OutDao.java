package site.metacoding.blue.domain.out;

import java.util.List;

import site.metacoding.blue.web.dto.response.player.ListByPositionDto;
import site.metacoding.blue.web.dto.response.player.ListDto;
import site.metacoding.blue.web.dto.response.player.ListOutDto;


public interface OutDao {
	public void insert(Out out);
	public Out findById(Integer id);
	public List<Out> findAll();
	public void update(Out out);
	public void deleteById(Integer id);
}
