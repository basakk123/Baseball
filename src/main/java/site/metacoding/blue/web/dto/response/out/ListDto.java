package site.metacoding.blue.web.dto.response.out;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ListDto {
	
	private Integer no;
	private Integer id;
	private Integer playerId;
	private String name;
	private String reason;
	private String teamId;
	private String position;
	private String teamName;
	private Timestamp createdAt;

}
