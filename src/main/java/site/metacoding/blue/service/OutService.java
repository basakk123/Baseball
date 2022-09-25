package site.metacoding.blue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.out.Out;
import site.metacoding.blue.domain.out.OutDao;
import site.metacoding.blue.web.dto.request.out.SaveDto;
import site.metacoding.blue.web.dto.request.out.UpdateDto;
import site.metacoding.blue.web.dto.response.out.ListDto;

@RequiredArgsConstructor
@Service
public class OutService {
	
	private final OutDao outDao;
	
	public List<ListDto> 퇴출선수목록보기(){
		List<ListDto> outList = outDao.findAll();
		return outList;
	}
	
	public void 등록하기(SaveDto saveDto) {
		outDao.insert(saveDto.toEntity());
	}
	
	public void 사유등록하기(Integer id, UpdateDto updateDto) {
		Out outPS = outDao.findById(id);
		outPS.update(updateDto);
		outDao.update(outPS);
	}
	
	public void 선수아이디로등록하기(Integer playerId) {
		Out outPS = new Out(playerId);
		outDao.insert(outPS);
	}
	
}
