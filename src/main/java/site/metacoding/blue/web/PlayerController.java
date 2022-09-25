package site.metacoding.blue.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.service.OutService;
import site.metacoding.blue.service.PlayerService;
import site.metacoding.blue.service.TeamService;
import site.metacoding.blue.web.dto.response.CMRespDto;
import site.metacoding.blue.web.dto.response.player.ListByPositionDto;
import site.metacoding.blue.web.dto.response.player.ListDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final TeamService teamService;
	
	@GetMapping("/player")
	public String getAll(Model model) {
		List<ListDto> playerList = playerService.선수목록보기();
		model.addAttribute("playerList", playerList);
		return "/player/playerList";
	}
	
	@DeleteMapping("/player/{id}")
	public @ResponseBody CMRespDto<?> deletePlayer(@PathVariable Integer id){
		playerService.삭제퇴출등록하기(id);
		return new CMRespDto<>(1, "선수삭제성공", null);
	}
//	
//	@PostMapping("/player/{id}")
//	public @ResponseBody CMRespDto<?> outPlayer(@PathVariable Integer id){
//		playerService.삭제퇴출등록하기(id);
//		return new CMRespDto<>(1, "선수퇴출등록성공", null);
//	}
	
	@GetMapping("/playerposition")
	public String getPositionList(Model model) {
		List<ListByPositionDto> playerListByPostion = playerService.포지션별선수목록보기();
		model.addAttribute("playerListByPostion", playerListByPostion);
		return "/player/playerListByPosition";
	}
	
	@GetMapping("/player/playerSaveForm")
	public String saveForm(Model model) {
		List<site.metacoding.blue.web.dto.response.team.ListDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "player/playerSaveForm";
	}
	
	@PostMapping("/player")
	public @ResponseBody CMRespDto<?> registerTeam(@RequestBody site.metacoding.blue.web.dto.request.player.SaveDto saveDto){
		playerService.등록하기(saveDto);
		return new CMRespDto<>(1, "등록성공", null);
	}
}
