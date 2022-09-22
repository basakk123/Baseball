package site.metacoding.blue.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.service.TeamService;
import site.metacoding.blue.web.dto.response.CMRespDto;
import site.metacoding.blue.web.dto.response.team.ListDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamService teamService;
	
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

}
