package site.metacoding.blue.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.blue.service.OutService;
import site.metacoding.blue.web.dto.request.out.SaveDto;
import site.metacoding.blue.web.dto.request.out.UpdateDto;
import site.metacoding.blue.web.dto.response.CMRespDto;
import site.metacoding.blue.web.dto.response.out.ListDto;


@RequiredArgsConstructor
@Controller
public class OutController {
	
	private final OutService outService;
	
	@GetMapping("/out")
	public String getAll(Model model) {
		List<ListDto> outList = outService.퇴출선수목록보기();
		model.addAttribute("outList", outList);
		return "out/outList";
	}
	
	@GetMapping("/out/outSaveForm")
	public String saveForm(Model model) {
		List<ListDto> outList = outService.퇴출선수목록보기();
		model.addAttribute("outList",outList);
		return "out/outSaveForm";
	}
	
	@PostMapping("/out")
	public @ResponseBody CMRespDto<?> registerReason(@RequestBody SaveDto saveDto){
		outService.등록하기(saveDto);
		return new CMRespDto<>(1, "등록성공", null);
	}
	
	@PutMapping("/out/{id}")
	public @ResponseBody CMRespDto<?> update(@PathVariable Integer id, @RequestBody UpdateDto updateDto){
		outService.사유등록하기(id, updateDto);
		return new CMRespDto<>(1, "사유등록성공", null);
	}
	
}
