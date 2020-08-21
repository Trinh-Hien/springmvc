$(document).ready(function () {
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

    $("#periodOfTime").on("change", function () {
        var serviceID = $("#periodOfTime").val();
        if(!(parseInt(serviceID)>0)){
            $("#notification").text("Thời gian sử dụng là số nguyên dương");
            $("#notification").css("color", "red");
            $(this).val("");
            $(this).focus();
        } else {
            $("#notification").text("")
        }
    });

    $("#gioBDSD").on("change", function () {
        var gioBatDauSD = $("#gioBDSD").val();
        var patt = new RegExp("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$");
        if (!(patt.test(gioBatDauSD))) {
            $("#notification").text("Giờ không hợp lệ (HH:mm:ss");
            $("#notification").css("color", "red");
            $(this).val("");
            $(this).focus();

        } else {
            $("#notification").text("")
        }
    });

});