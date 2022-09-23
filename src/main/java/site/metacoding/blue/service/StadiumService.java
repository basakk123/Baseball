package site.metacoding.blue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.stadium.Stadium;
import site.metacoding.blue.domain.stadium.StadiumDao;
import site.metacoding.blue.web.dto.request.stadium.SaveDto;
import site.metacoding.blue.web.dto.response.stadium.ListDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	
	private final StadiumDao stadiumDao;
	
	public List<ListDto> 야구장목록보기() {
		List<ListDto> stadiumList = stadiumDao.findAll();	
		return stadiumList;
	}
	
	public void 야구장삭제하기(Integer id) {
		Stadium stadiumPS = stadiumDao.findById(id);
		stadiumDao.deleteById(id);
	}
	
	public void 등록하기(SaveDto saveDto) {
		stadiumDao.insert(saveDto.toEntity());
	}

}
