package com.ssafy.favor.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.favor.dto.FavorDto;
import com.ssafy.favor.dto.mapper.FavorMapper;

@Service
public class FavorServiceImpl implements FavorService {
	private FavorMapper favorMapper;

	@Autowired
	private FavorServiceImpl(FavorMapper favorMapper) {
		this.favorMapper = favorMapper;
	}

	@Override
	public boolean checkExist(FavorDto favorDto) throws Exception {
		return favorMapper.checkExist(favorDto) == 0;
	}

	@Override
	public FavorDto getName(String dongCode) throws Exception {
		return favorMapper.getName(dongCode);
	}
	
	@Override
	public boolean insertFavor(FavorDto favorDto) throws Exception {
		return favorMapper.insertFavor(favorDto) == 1;
	}

	@Override
	public List<FavorDto> listFavor(String userId) throws Exception {
		List<FavorDto> list= favorMapper.listFavor(userId);
//		for (int i = 0; i < list.size() - 1; i++) {
//			for (int j = i + 1; j < list.size(); j++) {
//				int compareSido = list.get(i).getSidoName().compareTo(list.get(j).getSidoName());
//				int compareGugun = list.get(i).getGugunName().compareTo(list.get(j).getGugunName());
//				int compareDong = list.get(i).getDongName().compareTo(list.get(j).getDongName());
//
//				String tmpSido = list.get(i).getSidoName();
//				String tmpGugun = list.get(i).getGugunName();
//				String tmpDong = list.get(i).getDongName();
//				String tmpNo = list.get(i).getFavorNo();
//
//				// 시도 문자열 비교
//				if (compareSido > 0) { // 시도 오름차순
//					list.get(i).setSidoName(list.get(j).getSidoName());
//					list.get(j).setSidoName(tmpSido);
//
//					list.get(i).setGugunName(list.get(j).getGugunName());
//					list.get(j).setGugunName(tmpGugun);
//
//					list.get(i).setDongName(list.get(j).getDongName());
//					list.get(j).setDongName(tmpDong);
//
//					list.get(i).setFavorNo(list.get(j).getFavorNo());
//					list.get(j).setFavorNo(tmpNo);
//				} else if (compareSido == 0) { // 시도가 같다면 구군 비교
//					if (compareGugun > 0) { // 구군 오름차순
//						list.get(i).setSidoName(list.get(j).getSidoName());
//						list.get(j).setSidoName(tmpSido);
//
//						list.get(i).setGugunName(list.get(j).getGugunName());
//						list.get(j).setGugunName(tmpGugun);
//
//						list.get(i).setDongName(list.get(j).getDongName());
//						list.get(j).setDongName(tmpDong);
//
//						list.get(i).setFavorNo(list.get(j).getFavorNo());
//						list.get(j).setFavorNo(tmpNo);
//					} else if (compareGugun == 0) { // 구군이 같다면 동 비교
//						if (compareDong > 0) { // 동 오름차순
//							list.get(i).setSidoName(list.get(j).getSidoName());
//							list.get(j).setSidoName(tmpSido);
//
//							list.get(i).setGugunName(list.get(j).getGugunName());
//							list.get(j).setGugunName(tmpGugun);
//
//							list.get(i).setDongName(list.get(j).getDongName());
//							list.get(j).setDongName(tmpDong);
//
//							list.get(i).setFavorNo(list.get(j).getFavorNo());
//							list.get(j).setFavorNo(tmpNo);
//						}
//					}
//				}
//			}
//		}
		return list;
	}

	@Override
	public boolean deleteFavor(String id) throws Exception {
		return favorMapper.deleteFavor(id) == 1;
	}
}
