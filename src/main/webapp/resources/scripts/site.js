/**
 * Created by markus on 9.03.17.
 */
$().ready(function() {
    // validate registration form
    $("#new-booking").validate({
        submitHandler: function(form) {
            form.submit();
        },
        invalidHandler: function(event, validator) {
            var errors = validator.numberOfInvalids();
            if (errors) {
                var message = errors == 1
                    ? 'You missed 1 field. It has been highlighted'
                    : 'You missed ' + errors + ' fields. They have been highlighted';
                $("div.alert span").html(message);
                $("div.alert").show();
            } else {
                $("div.alert").hide();
            }
        }
    });
});