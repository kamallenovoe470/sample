<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Hi All</h2>

Data from DB

<table border="1">
    <tr>
        <th>City Code</th>
        <th>City Name</th>
        <th>City Pin Code</th>
    </tr>
    <c:forEach var="contact" items="${citys}" >
        <tr>

            <td>${contact.cityCode}</td>
            <td>${contact.cityName}</td>
            <td>${contact.cityPincode}</td>


        </tr>
    </c:forEach>             
</table>