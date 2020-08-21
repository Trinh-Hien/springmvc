$(document).ready(function () {
    $("#phoneNumber").on("change", function () {
        var phone = $("#phoneNumber").val();
        var patt = new RegExp("(/(/+[0-9]{2}/)|0)((90|91)[0-9]{7})");
        if (!(patt.test(phone))) {
            $("#notification").text("Số điện thoại phải bắt đầu bằng(090,091,(84)+90,(84)+91)");
            $("#notification").css("color", "red");
            $(this).val("");
            $(this).focus();
        } else {
            $("#notification").text("")
        }
    });
    $("#customerID").on("change", function () {
        var customerId = $("#customerID").val();
        var patt = new RegExp("^KH[0-9]{5}$");
        if (!(patt.test(customerId))) {
            $("#notification").text("Mã KH: Có format là KHxxxxx (x: ký tự số)");
            $("#notification").css("color", "red");
            $(this).val("");
            $(this).focus();

        } else {
            $("#notification").text("")
        }
    });

    $("#email").on("change", function () {
        var customerId = $("#email").val();
        var patt = new RegExp("^[a-z][a-z0-9_\.]{5,32}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}$");
        if (!(patt.test(customerId))) {
            $("#notification").text("Email không hợp lệ!");
            $("#notification").css("color", "red");
            $(this).val("");
            $(this).focus();

        } else {
            $("#notification").text("")
        }
    });
});