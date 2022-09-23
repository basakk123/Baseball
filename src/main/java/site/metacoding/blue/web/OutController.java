package site.metacoding.blue.web;

import java.util.List;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.service.PlayerService;
import site.metacoding.blue.service.TeamService;


@RequiredArgsConstructor
@Controller
public class OutController {
	
	private final PlayerService playerService;
	private final TeamService teamService;
	
}
