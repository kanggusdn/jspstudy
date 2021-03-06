<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
<style>
	#joinFormArea {
		margin: auto;
		width: 400px;
		border: 1px solid gray;
	}
	
	table {
		width: 380px;
		margin: auto;
		text-align: center;
	}
</style>
</head>
<body>
	<section id="joinFormArea">
		<form name="joinForm" action="memberJoinPro.do" method="post">
			<table>
				<tr>
					<td colspan="2"><h1>회원 가입 페이지</h1></td>
				</tr>
				<tr>
					<td><label for="id">아이디: </label></td>
					<td><input type="text" name="id" id="id" /></td>
				</tr>
				<tr>
					<td><label for="pw">비밀번호: </label></td>
					<td><input type="password" name="pw" id="pw" /></td>
				</tr>
				<tr>
					<td><label for="name">이름: </label></td>
					<td><input type="text" name="name" id="name" /></td>
				</tr>
				<tr>
					<td><label for="age">나이: </label></td>
					<td><input type="number" name="age" id="age" min="1" maxlength="2" /></td>
				</tr>
				<tr>
					<td><label for="gender">성별: </label></td>
					<td>
						<input type="radio" name="gender" id="gender" value="남" checked="checked" />남자
						<input type="radio" name="gender" id="gender2" value="여" />여자
					</td>
				</tr>
				<tr>
					<td><label for="email">이메일 주소: </label></td>
					<td><input type="email" name="email" id="email" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="javascript:joinForm.submit()">회원 가입</a>
						<a href="javascript:joinForm.reset()" class="ml-3">다시 작성</a>
					</td>
				</tr>
			</table>
		</form>
	</section>
</body>
</html>