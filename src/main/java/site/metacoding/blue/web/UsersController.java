package site.metacoding.blue.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.domain.stadium.Stadium;
import site.metacoding.blue.domain.stadium.StadiumDao;

@RequiredArgsConstructor
@RestController
public class UsersController {

	private final StadiumDao stadiumDao;
	
	@GetMapping("/users/{id}")
	public Stadium getUsers(@PathVariable Integer id) {
		return stadiumDao.findById(id);
	}
}
