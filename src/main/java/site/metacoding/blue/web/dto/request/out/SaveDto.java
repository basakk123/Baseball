package site.metacoding.blue.web.dto.request.out;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.blue.domain.player.Player;


@NoArgsConstructor
@Setter
@Getter
public class SaveDto {
	
	private String name;
	private Integer teamId;
	private String position;

	public Player toEntity() {
		Player player = new Player(this.name, this.teamId, this.position);
		return player;
	}
}
