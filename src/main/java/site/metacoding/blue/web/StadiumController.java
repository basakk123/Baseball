package site.metacoding.blue.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.service.StadiumService;
import site.metacoding.blue.web.dto.response.CMRespDto;
import site.metacoding.blue.web.dto.response.stadium.ListDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;

	@GetMapping("/stadium")
	public String getAll(Model model) {
		List<ListDto> stadiumList = stadiumService.야구장목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "stadium/stadiumList";
	}
	
	@DeleteMapping("/stadium/{id}")
	public @ResponseBody CMRespDto<?> deleteStadium(@PathVariable Integer id){
		stadiumService.야구장삭제하기(id);
		return new CMRespDto<>(1, "야구장삭제성공", null);
	}
}
