package site.metacoding.blue.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.out.Out;
import site.metacoding.blue.domain.out.OutDao;
import site.metacoding.blue.domain.player.Player;
import site.metacoding.blue.domain.player.PlayerDao;
import site.metacoding.blue.web.dto.request.player.SaveDto;
import site.metacoding.blue.web.dto.response.player.ListByPositionDto;
import site.metacoding.blue.web.dto.response.player.ListDto;


@RequiredArgsConstructor
@Service
public class PlayerService {

	private final PlayerDao playerDao;
	private final OutDao outDao;
	
	public List<ListDto> 선수목록보기(){
		List<ListDto> playerList = playerDao.findAll();
		return playerList;
	}
	
	@Transactional
	public void 삭제퇴출등록하기(Integer id) {
		Player playerPS = playerDao.findById(id);
		Out outPS = new Out(playerPS.getName(), playerPS.getTeamId(), playerPS.getPosition());
		outDao.insert(outPS);	
		playerDao.deleteById(id);			
	}

	public List<ListByPositionDto> 포지션별선수목록보기(){
		List<ListByPositionDto> playerListByPostion = playerDao.findByPostion();
		return playerListByPostion;
	}
	
	public void 등록하기(SaveDto saveDto) {
		playerDao.insert(saveDto.toEntity());
	}
}
