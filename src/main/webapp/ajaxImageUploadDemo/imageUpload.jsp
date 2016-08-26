<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/8 0008
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/tag.jsp" %>
<html>
<head>
    <title></title>
  <script src="${webctx}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
  <script src="${webctx}/static/js/jquery.ajaxfileupload.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $("#demo1").AjaxFileUpload({
        action:     basePath+"/admin/blogger/savePic.do",
        onComplete: function(filename, response) {
          $("#uploads").append(
                  $("<img />").attr("src", response).attr("width", 200)
          );
        }
      });
    });
  </script>
</head>
<body>

<form method="post" action="" enctype="multipart/form-data">
  <label>File Input: <input type="file" name="imageFile" id="demo1" /></label>
  <div id="uploads">

  </div>
</form>



</body>
</html>
