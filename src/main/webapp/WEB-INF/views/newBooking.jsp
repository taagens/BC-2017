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

    <section class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="alert alert-danger" role="alert" style="display: none;">
                    <span></span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <h1>New Booking</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <form:form commandName="booking" class="form-horizontal" id="new-booking">
                    <fieldset>
                        <legend>Please enter booking time, description of the vechicle and rim size</legend>
                        <div class="form-group">
                            <label for="datetime" class="col-sm-2 control-label">Booking time</label>
                            <div class="col-sm-10">
                                <form:input type="text" class="form-control" path="datetime" id="datetime" name="datetime" required="" maxlength="16" placeholder="Booking date and time"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="description" class="col-sm-2 control-label">Description</label>
                            <div class="col-sm-10">
                                <form:textarea class="form-control" path="description" id="description" name="description" required="" rows="5" placeholder="Vechicle description, type and rim size"/>
                            </div>
                        </div>
                    </fieldset>
                    <div class="row">
                        <div class="col-md-12 text-right">
                            <a href="/bookings" role="button" class="btn btn-danger">Back</a>
                            <button type="submit" class="btn btn-default" id="save-form">Add</button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </section>
</div>
<jsp:include page="../fragments/footer.jsp"/>

</body>
</html>
