package hks.bbs.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import hks.common.dao.AbstractDAO;

@Repository("bbsDAO")
public class BbsDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) {
		
		return (List<Map<String, Object>>)selectList("bbs.selectBoardList",map);
	}

}
