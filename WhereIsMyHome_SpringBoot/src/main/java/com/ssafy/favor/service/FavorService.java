package com.ssafy.favor.service;

import java.util.List;

import com.ssafy.favor.dto.FavorDto;

public interface FavorService {
	boolean checkExist(FavorDto favorDto) throws Exception;
	FavorDto getName(String dongCode) throws Exception;
	boolean insertFavor(FavorDto favorDto) throws Exception;
	boolean deleteFavor(String id) throws Exception;
	List<FavorDto> listFavor(String userId) throws Exception;

}
