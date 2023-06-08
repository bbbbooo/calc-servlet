<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>계산기 만들기</title>
</head>
<body>
<h1>계산기 만들기</h1>
    <form action="calc" method="POST">
        <input type="number" name="num1" placeholder="첫 번째 숫자" required>
        <select name="operator">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
            <option value="%">%</option>
        </select>
        <input type="number" name="num2" placeholder="두 번째 숫자" required>
        <input type="submit" value="계산">
    </form>
</body>
</html>