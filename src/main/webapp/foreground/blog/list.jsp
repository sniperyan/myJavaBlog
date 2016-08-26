<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/tag.jsp" %>

<link rel="stylesheet" href="${webctx}/static/jqueryPagination/simplePagination.css">
<script src="${webctx}/static/jqueryPagination/jquery.simplePagination.js"></script>

<div class="data_list">
		<div class="data_list_title">
		<img src="${webctx}/static/images/list_icon.png"/>
		最新博客</div>
		<div class="datas">
			<ul>
			  <c:forEach var="blog" items="${blogList}">
			  	  <li style="margin-bottom: 30px">
				  	<span class="date"><a href="${webctx}/blog/articles/${blog.id}.html"><fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy年MM月dd日"/></a></span>
				  	<span class="title"><a href="${webctx}/blog/articles/${blog.id}.html">${blog.title }</a></span>
				  	<span class="summary">摘要: ${blog.summary }...</span>
				  	<span class="img">
				  		<c:forEach var="image" items="${blog.imagesList }">
					  		<a href="${webctx}/blog/articles/${blog.id}.html">${image }</a>
					  		&nbsp;&nbsp;
				  		</c:forEach>
				  	</span>
				  	<span class="info">发表于 <fmt:formatDate value="${blog.releaseDate }" type="date" pattern="yyyy-MM-dd HH:mm"/> 阅读(${blog.clickHit}) 评论(${blog.replyHit}) </span>
				  </li>
				  <hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
			  </c:forEach>
			</ul>
		</div>
   </div>
<form id="myForm" method="get" action="${webctx}/index.html">
	<input id="page" type="hidden" name="page">
	<input type="hidden"name="typeId"  value="${pageInfo.typeId}">
	<input type="hidden" name="releaseDateStr" value="${pageInfo.releaseDateStr}">
</form>
<div>
	<nav>
	  <div id="pagination" class="pagination pagination-sm">
		  //分页框位置
	  </div>
	</nav>
 </div>
<script>
	$(function() {
		$("#pagination").pagination({
			items: ${pageInfo.totalRows},  //总记录数
			itemsOnPage: 10,    //pagesize
			currentPage: ${pageInfo.page},   //当前页
			prevText: '上一页',
			nextText: '下一页',
			cssStyle: 'light-theme',
			onPageClick: function(pageNumber, event) {
				$("#page").val(pageNumber);
				$("#myForm").submit();
			}
		});
	});
</script>