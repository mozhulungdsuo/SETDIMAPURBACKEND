package com.cart.dao;

import java.util.List;

import com.cart.model.Blog;

public interface BlogDao {

	List<Blog> getAllblogs();

	boolean saveBlog(Blog blog);

	boolean updateStatus(Blog blog);
	
	void deleteBlog(int blogId);

	Blog getBlogById(int blogId);
	
	Blog updateBlog(int blogId,Blog blog);
	
	void increaseLikes(int blogId);
	
	void increaseDislikes(int blogId);
}
