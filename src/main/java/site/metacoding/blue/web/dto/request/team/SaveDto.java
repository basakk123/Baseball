package site.metacoding.blue.web.dto.request.team;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.blue.domain.team.Team;


@NoArgsConstructor
@Setter
@Getter
public class SaveDto {
	
	private String name;
	private Integer stadiumId;

	public Team toEntity() {
		Team team = new Team(this.name, this.stadiumId);
		return team;
	}
}
