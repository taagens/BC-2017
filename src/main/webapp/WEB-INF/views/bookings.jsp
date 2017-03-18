<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../fragments/head.jsp"/>
<body>
<jsp:include page="../fragments/menu.jsp"/>
<div id="body">
    <!-- Main page content -->

    <section class="container">
        <div class="row">
            <div class="col-md-12">
                <h1>Bookings List</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Datetime</th>
                        <th>Details</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${bookings}" var="booking">
                        <tr>
                            <td>${booking.id}</td>
                            <td><a href="#" class="booking-details" id="booking-details-${booking.id}">${booking.datetime}</a></td>
                            <td>${booking.description}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 text-right">
                <a href="/booking/create" role="button" class="btn btn-default" id="new-booking">New Booking</a>
            </div>
        </div>
    </section>
</div>
<jsp:include page="../fragments/footer.jsp"/>

</body>
</html>
