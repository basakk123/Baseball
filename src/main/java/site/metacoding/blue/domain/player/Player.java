package site.metacoding.blue.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Player {
	private Integer id;
	private String name;
	private Integer teamId;
	private String position;
	private Timestamp createdAt;

	public Player(String name, Integer teamId, String position) {
		this.name = name;
		this.teamId = teamId;
		this.position = position;
	}

}
