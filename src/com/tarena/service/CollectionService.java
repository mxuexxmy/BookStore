package com.tarena.service;

import java.util.List;

import com.tarena.entity.Book;
import com.tarena.entity.Collection;

public interface CollectionService {
	Collection query(String user_id,String product);
	boolean save(String user_id,String product);
	boolean delete(String user_id,String product);
	List<Book> QueryAllCollect(String user_id);
}
