package site.metacoding.blue.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Stadium {
	private Integer id;
	private String name;
	private Timestamp createdAt;
}
