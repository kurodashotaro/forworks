package com.example.demo.Controller;

import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.StampService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StampController {

	/**
	 * ControllerではServiceを呼ぶ。今回の機能を実装するだけなら
	 * このようにする必要はないが、今後規模が大きくなった際の
	 * 役割分担を意識している。
	 */
	private final StampService service;
	@RequestMapping(value="/")
	public String index(@RequestParam(required = false) String start, Model model) {
		// タイトルが入力されたらデータベースに保存する
		if(!Objects.isNull(start) && !start.isBlank()) {
			this.service.save(start);
		}
		model.addAttribute("stamps", this.service.findAll());
		return "/index";
	}
}
