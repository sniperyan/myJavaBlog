# JAVA语言开发的前后台博客系统
springmvc+mybatis+log4j+mysql+shiro+lucene

### 开发环境 
IDEA14 + MAVEN3 + JDK7 + TOMCAT8

###功能
```
前台：
    1.博客列表，博客详情
    2.查看博主信息
    3.评论
后台：
    1.博客管理
    2.博主信息管理
    3.博客类型管理
    4.评论管理
    5.页面友情链接管理
    6.系统缓存管理
```

###特点
```
1.使用spring aop来进行事务管理，使用注解配置事务
2.springmvc开发起来效率很高，配置比stuts2简单
3.shiro做权限管理，登录验证，配置简单
4.使用lucene做全文检索
5.后台管理页面用的easyui，前台bootstrap，富文本用的ueditor
6.富文本使用百度的ueeditor
7.实现spring ApplicationContextAware接口，在容器启动的时候初始化配置，优化性能
```

