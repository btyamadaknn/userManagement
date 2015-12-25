<!DOCTYPE html>
<HTML>
	<HEAD>
		<meta charset="UTF-8">
		<TITLE>ユーザ検索</TITLE>
		<link rel="stylesheet" type="text/css" href="style.css">
	</HEAD>
	<BODY>
		<form:form modelAttribute="userManagementForm" method="get"
		    action="./searchResult">
			<div class="oneSpace">
			<h2>ユーザ情報検索フォーム</h2></div>
			<div class="center errorMessage">
			</div>
			<br>
			  <a href="./searchResult">s</a>
		      <input type="text" name="name" size="3">
		      <button type="submit" name="file1" formaction="./download">ssdf</button>
			<br>
			<table border="1">
				<tr>
					<th class="width100px"><form:label path="userId" >ID</form:label></th>
					<td class="width240px"><form:input path="userId" cssErrorClass="error-input"/>
					<form:errors path="userId" cssClass="error-messages"/></td>
				</tr>
				<tr>
					<th class="width100px"><form:label path="name">氏名</form:label></th>
					<td class="width240px"><form:input path="name" cssErrorClass="error-input"/>
					<form:errors path="name" cssClass="error-messages"/></td>
				</tr>
				<tr>
					<th class="width100px"><form:label path="age">年齢</form:label></th>
					<td class="width240px"><form:input path="age" cssErrorClass="error-input"/>
					<form:errors path="age" cssClass="error-messages"/></td>
				</tr>
				<tr>
					<th class="width100px"><form:label path="jobCode">職業</form:label></th>
					<td class="width240px"><form:select path="jobCode">
  					<form:option value="" label="--Select--" />
  					<form:options items="${CL_JOB}" cssErrorClass="error-input"/>
					</form:select>
					<form:errors path="jobCode" cssClass="error-messages"/></td>
				</tr>
				<tr>
					<th class="width100px"><form:label path="gender">性別</form:label></th>
					<td class="width240px">
					<form:radiobutton path="gender" label="男" value="0" cssErrorClass="error-input"/>
					<form:radiobutton path="gender" label="女" value="1" cssErrorClass="error-input"/>
					<form:radiobutton path="gender" label="未選択" value="-1" cssErrorClass="error-input"/>
					<form:errors path="gender" cssClass="error-messages"/></td>
				</tr>
			</table>
			<br>
			<div class="center">
				<form:button name="submit">検索する</form:button>
				<input type="reset" value="クリア">
			<br><br></div>
		</form:form>
	</BODY>
</HTML>