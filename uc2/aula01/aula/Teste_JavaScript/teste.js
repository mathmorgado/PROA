function hidden_modals() 
{
    var Allmodals = document.querySelectorAll(".modal");

    Allmodals.forEach(function(modal) {
        modal.style.visibility = "hidden";
    });
}

function show_layer(id)
{
    document.getElementById(id).style.visibility = "visible";
}