package site.metacoding.blue.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Team {
	private Integer id;
	private String name;
	private Integer stadiumId;
	private Timestamp createdAt;

	public Team(String name, Integer stadiumId) {
		this.name = name;
		this.stadiumId = stadiumId;
	}

}
