package site.metacoding.blue.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.service.StadiumService;
import site.metacoding.blue.service.TeamService;
import site.metacoding.blue.web.dto.request.team.SaveDto;
import site.metacoding.blue.web.dto.response.CMRespDto;
import site.metacoding.blue.web.dto.response.team.ListDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamService teamService;
	private final StadiumService stadiumService;
	
	@GetMapping("/team")
	public String getAll(Model model) {
		List<ListDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "/team/teamList";
	}
	
	@DeleteMapping("/team/{id}")
	public @ResponseBody CMRespDto<?> deleteTeam(@PathVariable Integer id){
		teamService.팀삭제하기(id);
		return new CMRespDto<>(1, "팀삭제성공", null);
	}
	
	@GetMapping("/team/teamSaveForm")
	public String saveForm(Model model) {
		List<site.metacoding.blue.web.dto.response.stadium.ListDto> stadiumList = stadiumService.야구장목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "team/teamSaveForm";
	}
	
	@PostMapping("/team")
	public @ResponseBody CMRespDto<?> registerTeam(@RequestBody SaveDto saveDto){
		teamService.등록하기(saveDto);
		return new CMRespDto<>(1, "등록성공", null);
	}
	

}
