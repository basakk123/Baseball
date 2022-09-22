package site.metacoding.blue.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	private Integer id;
	private String name;
	private Integer teamId;
	private String position;
	private Timestamp createdAt;
}
