package site.metacoding.blue.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Stadium {
	private Integer id;
	private String name;
	private Timestamp createdAt;
	
	public Stadium(String name) {
		this.name = name;
	}
}
