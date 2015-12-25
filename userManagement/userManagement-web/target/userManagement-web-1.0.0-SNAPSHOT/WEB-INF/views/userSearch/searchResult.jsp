<%@ page import="userManagement.domain.model.User" %>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<HTML>
	<HEAD>
		<meta charset="UTF-8">
		<TITLE>ユーザ検索結果表示画面</TITLE>
		<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
    </HEAD>
	<BODY>
			<h1>ユーザ検索結果</h1>
		<hr>
		<form method="get" action="">
			<div class="center errorMessage">
				<b>エラーメッセージ</b>
			</div>
			<div class="oneSpace">
				<h3>××件見つかりました。</h3>
			</div>
			<br>
			<a href="./searchResult">s</a>
		      <a href="./download">ss</a>
		      <input type="text" name="name" size="3">
		      <button type="submit" name="file1" formaction="./download">ssdf</button>
			<div class="right fourSpaceRight">1/× ページ&nbsp;&nbsp;&nbsp;<a href=""><<</a>&nbsp;&nbsp;&nbsp;<a href=""><</a>&nbsp;&nbsp;&nbsp;1&nbsp;&nbsp;&nbsp;<a href="">2</a>&nbsp;&nbsp;&nbsp;<a href="">3</a>&nbsp;&nbsp;&nbsp;<a href="">></a>&nbsp;&nbsp;&nbsp;<a href="">>></a></div><br>
			<table border="1">
				<tr>
				<th rowspan="3" class="width30px">1</th>
				<th class="width100px">ID</th><td class="width120px">00000001</td>
				<th class="width100px">氏名</th><td class="width240px" colspan="3">テスト 次郎</td>
				<td class="borderStyleNone center width60px">
					<input type="submit" value="詳細">
				</td>
				</tr><tr>
				<th class="width100px">年齢</th><td class="width120px">29</td>
				<th class="width100px">性別</th><td class="width60px">男</td>
				<th class="width100px">職業</th><td >フリーター</td>
				<td class="borderStyleNone center">
					<input type="submit" value="更新">
				</td>
				</tr><tr>
				<th class="width100px">郵便番号</th><td class="width120px">〒123 - ○567</td>
				<th class="width100px">住所</th><td class="width520px" colspan="3">東京都K区○○1-2-3  マンション△△△△△ ○○○室</td>
				<td class="borderOnUnder center">
					<input type="submit" value="削除">
				</td>
				</tr><tr>
				<th rowspan="3" class="width30px">2</th>
				<th class="width100px">ID</th><td class="width120px">00000005</td>
				<th class="width100px">氏名</th><td class="width240px" colspan="3">テスト 花子</td>
				<td class="borderStyleNone center">
					<input type="submit" value="詳細">
				</td>
				</tr><tr>
				<th class="width100px">年齢</th><td class="width120px">26</td>
				<th class="width100px">性別</th><td class="width60px">女</td>
				<th class="width100px">職業</th><td class="width240px">教師</td>
				<td class="borderStyleNone center">
					<input type="submit" value="更新">
				</td>
				</tr><tr>
				<th class="width100px">郵便番号</th><td class="width120px">〒3○1 - 4321</td>
				<th class="width100px">住所</th><td colspan="3">東京都S区○○3-2-1</td>
				<td class="borderOnUnder center">
					<input type="submit" value="削除">
				</td>
				</tr>
				
				<tr>
				<th rowspan="3" class="width30px">3</th>
				<th class="width100px">ID</th><td class="width120px">00034210</td>
				<th class="width100px">氏名</th><td class="width240px" colspan="3">富田 △太</td>
				<td class="borderStyleNone center">
					<input type="submit" value="詳細">
				</td>
				</tr><tr>
				<th class="width100px">年齢</th><td class="width120px">30</td>
				<th class="width100px">性別</th><td class="width60px">男</td>
				<th class="width100px">職業</th><td class="width240px">消防士</td>
				<td class="borderStyleNone center">
					<input type="submit" value="更新">
				</td>
				</tr><tr>
				<th class="width100px">郵便番号</th><td class="width120px">〒222 - 22○2</td>
				<th class="width100px">住所</th><td colspan="3">大阪府S市○○1-2</td>
				<td class="borderOnUnder center">
					<input type="submit" value="削除">
				</td>
				</tr>
				
				<tr>
				<th rowspan="3" class="width30px">4</th>
				<th class="width100px">ID</th><td class="width120px">00163120</td>
				<th class="width100px">氏名</th><td class="width240px" colspan="3">埼玉 ○子</td>
				<td class="borderStyleNone center">
					<input type="submit" value="詳細">
				</td>
				</tr><tr>
				<th class="width100px">年齢</th><td class="width120px">24</td>
				<th class="width100px">性別</th><td class="width60px">女</td>
				<th class="width100px">職業</th><td class="width240px">会社員</td>
				<td class="borderStyleNone center">
					<input type="submit" value="更新">
				</td>
				</tr><tr>
				<th class="width100px">郵便番号</th><td class="width120px">〒231 - 4○21</td>
				<th class="width100px">住所</th><td colspan="3">埼玉県△△市○○3-3</td>
				<td class="borderOnUnder center">
					<input type="submit" value="削除">
				</td>
				</tr>
				
				<tr>
				<th rowspan="3" class="width30px">5</th>
				<th class="width100px">ID</th><td class="width120px">12345678</td>
				<th class="width100px">氏名</th><td class="width240px" colspan="3">テストヶ原&nbsp;龍之介ああああああ</td>
				<td class="borderStyleNone center">
					<input type="submit" value="詳細">
				</td>
				</tr><tr>
				<th class="width100px">年齢</th><td class="width120px">104</td>
				<th class="width100px">性別</th><td class="width60px">男</td>
				<th class="width100px">職業</th><td class="width240px">ＸＸインダストリアルデザイナー</td>
				<td class="borderStyleNone center">
					<input type="submit" value="更新">
				</td>
				</tr><tr>
				<th class="width100px">郵便番号</th><td class="width120px">〒11○ - 1111</td>
				<th class="width100px">住所</th><td  class="width560px" colspan="3">京都府△△市◇◇区三条通南二筋目白川筋西入ル二丁目北木之元町Ｘ―Ｘ―Ｘ</td>
				<td class="borderStyleNone center">
					<input type="submit" value="削除">
				</td>
				</tr>
			</table>
			<br>
			<div class="right fourSpaceRight">1/× ページ&nbsp;&nbsp;&nbsp;<a href=""><<</a>&nbsp;&nbsp;&nbsp;<a href=""><</a>&nbsp;&nbsp;&nbsp;1&nbsp;&nbsp;&nbsp;<a href="">2</a>&nbsp;&nbsp;&nbsp;<a href="">3</a>&nbsp;&nbsp;&nbsp;<a href="">></a>&nbsp;&nbsp;&nbsp;<a href="">>></a></div><br>
			
			<div class="twoSpace">
				<h2>家族構成</h2>			
			</div>
			<table border="1">
				<tr>
				<th class="width100px">ID</th><td class="width120px" colspan="2">00000001</td>
				<th class="width100px">氏名</th><td class="width240px" colspan="2">テスト 次郎</td>
				</tr>
				<tr>
				<th rowspan="6" class="width120px">家族構成</th>
				<th class="width40px">No.</th>
				<th class="width60px">続柄</th>
				<th class="width240px">家族氏名</th>
				<th class="width60px">年齢</th>
				<th class="width60px">性別</th>
				</tr><tr>
				<td class="center">1</td>
				<td class="center">父</td>
				<td>テスト 豪太</td>
				<td class="center">60</td>
				<td class="center">男</td>
				</tr><tr>
				<td class="center">2</td>
				<td class="center">母</td>
				<td>テスト 秋絵</td>
				<td class="center">58</td>
				<td class="center">女</td>
				</tr>
				</tr><tr>
				<td class="center">3</td>
				<td class="center">兄</td>
				<td>テスト 一郎</td>
				<td class="center">35</td>
				<td class="center">男</td>
				</tr>
				</tr><tr>
				<td class="center">4</td>
				<td class="center">姉</td>
				<td>テスト 薫</td>
				<td class="center">32</td>
				<td class="center">女</td>
				</tr>
				</tr><tr>
				<td class="center">5</td>
				<td class="center">弟</td>
				<td>テスト 三郎</td>
				<td class="center">27</td>
				<td class="center">男</td>
				</tr>
				</table>
			
			<div class="center">
			<br>
				<input type="button" value="ユーザ情報検索画面に戻る">
			<br><br></div>
		</form>
	</BODY>
</HTML>
