package site.metacoding.blue.domain.out;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.blue.web.dto.request.out.UpdateDto;

@NoArgsConstructor
@Setter
@Getter
public class Out {
	private Integer id;
	private String name;
	private Integer teamId;
	private String position;
	private String reason;
	private Timestamp createdAt;

	public Out(String reason) {
		this.reason = reason;
	}
		
	public Out(String name, Integer teamId, String position) {
		this.name = name;
		this.teamId = teamId;
		this.position = position;
		this.reason = "";
	}
	
	public void update(UpdateDto updateDto) {
		this.reason = updateDto.getReason();
	}
	
}
