<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		<h1>ModelAndView를 적용한 출력결과(subDir/sampleView.jsp)</h1>
		<hr>
		<h2>전송된 데이터(ObjectTest) : ${ObjectTest }</h2>
		<h2>전송된 데이터(name) : ${name }</h2>
		<h2>전송된 데이터(lists) : ${lists }</h2>
		
		
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    