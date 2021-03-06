package com.care.root.mybatis.board;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.care.root.board.dto.BoardDTO;
import com.care.root.board.dto.BoardRepDTO;

public interface BoardMapper {
	public List<BoardDTO> boardAllList(@Param("s")int start,
			@Param("e") int end);//2개이상의 값을 사용할 때 @param 사용
	public int writeSave(BoardDTO dto);
	public BoardDTO contentView(int writeNo);
	public void upHit(int writeNo);
	public int modify(BoardDTO dto);
	public int delete(int writeNo);
	
	public void addReply(BoardRepDTO dto);
	
	public List<BoardRepDTO> getRepList(int write_group);
	public int selectBoardCount();//전체 글에 대한 개수
	
}















