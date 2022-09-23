package site.metacoding.blue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.player.Player;
import site.metacoding.blue.domain.player.PlayerDao;
import site.metacoding.blue.web.dto.response.player.ListByPositionDto;
import site.metacoding.blue.web.dto.response.player.ListDto;
import site.metacoding.blue.web.dto.response.player.ListOutDto;

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
	
	public List<ListByPositionDto> 포지션별선수목록보기(){
		List<ListByPositionDto> playerListByPostion = playerDao.findByPostion();
		return playerListByPostion;
	}
	
	public List<ListOutDto> 퇴출선수목록보기(){
		List<ListOutDto> playerOutList = playerDao.findByOut();
		return playerOutList;
	}
}
