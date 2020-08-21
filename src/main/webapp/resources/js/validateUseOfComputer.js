$(document).ready(function () {
    $("#serviceID").on("change", function () {
        var serviceID = $("#serviceID").val();
        var patt = new RegExp("^DV[0-9]{3}$");
        if (!(patt.test(serviceID))) {
            $("#notification").text("Mã DV: Có format là DVxxx (x: ký tự số)");
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
    $("#time").on("change", function () {
        var gioSD = $("#time").val();
        var patt = new RegExp("(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$");
        if (!(patt.test(gioSD))) {
            $("#notification").text("Giờ không hợp lệ (HH:mm:ss");
            $("#notification").css("color", "red");
            $(this).val("");
            $(this).focus();

        } else {
            $("#notification").text("")
        }
    });

    $("#quantity").on("change", function () {
        var quantity = $("#quantity").val();
        if(!(parseInt(quantity)>0)){
            $("#notification").text("Số lượng là số nguyên dương");
            $("#notification").css("color", "red");
            $(this).val("");
            $(this).focus();
        } else {
            $("#notification").text("")
        }
    });

});
