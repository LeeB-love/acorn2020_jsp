<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/users/signup_form.jsp</title>
<link rel="stylesheet" href="/Web02_Servlet/css/bootstrap.css" />
</head>
<body>
	<div class="col-md-6">
		<h1>회원가입 폼 입니다. </h1>
		
		<br />
		<br />
		
		<!-- context path 출력하기 ${pageContext.request.contextPath} -->
		<form action="${pageContext.request.contextPath }/users/signup.jsp" method="post">
			<div class="form-group">
				<strong><lable for="id">아이디</lable></strong>
				<input type="text" class="form-control" name="id" id="id" />
				<small class="form-text text-muted">5글자 이상 입력하세요.</small><br />
				<strong><lable for="pwd">비밀번호</lable></strong>
				<input type="password" class="form-control" name="pwd" id="pwd" /><br />
			</div>
			
			
	<fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">성별</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gender" value="man" checked/>
          <label class="form-check-label" for="gridRadios1">남</label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gender" value="woman" />
          <label class="form-check-label" for="gridRadios2">여</label>
        </div>
      </div>
    </div>
  </fieldset>
			
			
			
			
			
			
			
			
			
			<br />
			<br />
			<br />

			<div >
			<strong><lable for="job">직업선택</lable></strong>
			<select class="form-control" name="job" id="job">
				<option value="">선택</option>
				<option value="doctor">의사</option>
				<option value="programmer">프로그래머</option>
				<option value="etc">기타</option>
			</select><br />
			</div>
			
			<br />
			
			<p><strong>관심사 체크</strong></p>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="checkbox" name="like" value="java" />
				<label class="form-check-label">자바</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="checkbox" name="like" value="javascript" />
				<label class="form-check-label">자바스크립트</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="checkbox" name="like" value="css" />
				<label class="form-check-label">스타일시트</label>
			</div>
			
			<br />
			<br />
			<br />

			<strong><label for="comment">하고 싶은 말</label></strong>
			<textarea class = "form-control" 
			name="comment" id="comment" rows="10" cols="30" 
			placeholder="하고싶은 말을 작성해주세요"></textarea><br />
			
			<button type="submit" class="btn btn-primary">가입</button>
			<button type="reset" class="btn btn-danger">취소</button>
			
		</form>
	</div>
</body>
</html>