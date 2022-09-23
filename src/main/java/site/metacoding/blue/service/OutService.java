package site.metacoding.blue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.team.Team;
import site.metacoding.blue.domain.team.TeamDao;
import site.metacoding.blue.web.dto.request.team.SaveDto;
import site.metacoding.blue.web.dto.response.team.ListDto;

@RequiredArgsConstructor
@Service
public class OutService {
	
	private final TeamDao teamDao;
	

}
