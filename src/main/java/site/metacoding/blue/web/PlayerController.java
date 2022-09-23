package site.metacoding.blue.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.service.PlayerService;
import site.metacoding.blue.web.dto.response.CMRespDto;
import site.metacoding.blue.web.dto.response.player.ListByPositionDto;
import site.metacoding.blue.web.dto.response.player.ListDto;
import site.metacoding.blue.web.dto.response.player.ListOutDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	
	@GetMapping("/player")
	public String getAll(Model model) {
		List<ListDto> playerList = playerService.선수목록보기();
		model.addAttribute("playerList", playerList);
		return "/player/playerList";
	}
	
	@DeleteMapping("/player/{id}")
	public @ResponseBody CMRespDto<?> deletePlayer(@PathVariable Integer id){
		playerService.선수삭제하기(id);
		return new CMRespDto<>(1, "선수삭제성공", null);
	}
	
	@GetMapping("/playerposition")
	public String getPositionList(Model model) {
		List<ListByPositionDto> playerListByPostion = playerService.포지션별선수목록보기();
		model.addAttribute("playerListByPostion", playerListByPostion);
		return "/player/playerListByPosition";
	}
	
	@GetMapping("/playerout")
	public String getOutList(Model model) {
		List<ListOutDto> playerOutList = playerService.퇴출선수목록보기();
		model.addAttribute("playerOutList", playerOutList);
		return "/player/playerOutList";
	}
}
