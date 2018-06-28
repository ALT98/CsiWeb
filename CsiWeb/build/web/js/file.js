$(document).ready(function () {
    $("#Alumno").hide();
    $("#Administrativo").show();
    $("#Maestro").hide();
});


function esconder() {
    var value = $("#choose :selected").text();

    switch (value) {
        case "Alumno":
            $("#Administrativo").hide(1000);
            $("#Maestro").hide(1000);
            $("#Alumno").show(1000);
            break;

        case "Maestro":
            $("#Administrativo").hide(1000);
            $("#Alumno").hide(1000);
            $("#Maestro").show(1000);
            break;

        case "Administrativo":
            $("#Maestro").hide(1000);
            $("#Alumno").hide(1000);
            $("#Administrativo").show(1000);
            break;
    }
}