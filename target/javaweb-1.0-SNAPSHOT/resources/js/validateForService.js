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

    $("#price").on("change", function () {
        var serviceID = $("#price").val();
        if(!(parseInt(serviceID)>0)){
            $("#notification").text("Đơn giá là số nguyên dương");
            $("#notification").css("color", "red");
            $(this).val("");
            $(this).focus();
        } else {
            $("#notification").text("")
        }
    });

});