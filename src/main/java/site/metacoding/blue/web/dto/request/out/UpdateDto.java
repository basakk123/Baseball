package site.metacoding.blue.web.dto.request.out;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.blue.domain.out.Out;
import site.metacoding.blue.domain.player.Player;


@NoArgsConstructor
@Setter
@Getter
public class UpdateDto {
	
	private String reason;

	public Out toEntity() {
		Out out = new Out(this.reason);
		return out;
	}
}
