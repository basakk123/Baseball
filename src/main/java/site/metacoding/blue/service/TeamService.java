package site.metacoding.blue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.team.Team;
import site.metacoding.blue.domain.team.TeamDao;
import site.metacoding.blue.web.dto.response.team.ListDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	
	private final TeamDao teamDao;
	
	public List<ListDto> 팀목록보기(){
		List<ListDto> teamList = teamDao.findAll();
		return teamList;
	}
	
	public void 팀삭제하기(Integer id) {
		Team teamPS = teamDao.findById(id);
		teamDao.deleteById(id);
	}

}
