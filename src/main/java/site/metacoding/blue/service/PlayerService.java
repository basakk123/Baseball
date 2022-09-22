package site.metacoding.blue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.player.Player;
import site.metacoding.blue.domain.player.PlayerDao;
import site.metacoding.blue.web.dto.response.player.ListDto;

@RequiredArgsConstructor
@Service
public class PlayerService {

	private final PlayerDao playerDao;
	
	public List<ListDto> 선수목록보기(){
		List<ListDto> playerList = playerDao.findAll();
		return playerList;
	}
	
	public void 선수삭제하기(Integer id) {
		Player playerPS = playerDao.findById(id);
		playerDao.deleteById(id);
	}
}
