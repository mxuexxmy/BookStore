package com.tarena.dao;

import java.util.List;

import com.tarena.entity.Book;
import com.tarena.entity.Collection;

public interface CollectionDao {
	Collection query(String user_id,String product);
	int saveCollect(String user_id,String product);
	int deleteCollect(String user_id,String product);
	List<Book> queryCollect(String user_id);
}
