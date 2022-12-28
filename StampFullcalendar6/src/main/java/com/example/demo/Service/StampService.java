package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Stamp;
import com.example.demo.Repository.StampRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StampService {

	private final StampRepository repository;
	
	/**
	 * 入力した日付でを登録データベースに登録する。
	 * @param dateData
	 */
	public void save(String start) {
		Stamp stamp = new Stamp();
		stamp.setStart(start);
		this.repository.save(stamp);
	}
	
	/**
	 * すべての登録データデータを返す
	 * @return 登録データ
	 */
	public List<Stamp> findAll(){
		return this.repository.findAll();
	}
}
