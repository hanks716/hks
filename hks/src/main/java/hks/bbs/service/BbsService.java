package hks.bbs.service;

import java.util.List;
import java.util.Map;

public interface BbsService {
	
	List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception;
	 

}
