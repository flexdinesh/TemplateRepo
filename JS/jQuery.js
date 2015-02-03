/*document on load Syntax*/
// Type - 1

$( document ).ready(function() {
    
    //on load execute
    
});

// Type - 2
$(function() {

    //on load execute
    
});

/*------------------------------------------------------------------------------------------*/

/*Ajax Call Syntax*/

function ajaxCall() {

    var jqXHR = $.ajax({

        url: "URL",
        type: "post",
        data: {
            parameterName: value,
            parameterName2: "value"
        }
    }).done(function(response, textStatus, jqXHR) {

        console.log("Success");

    }).fail(function(jqXHR, textStatus, errorThrown) {

        console.log("Failed");

    });
}

/*------------------------------------------------------------------------------------------*/

/*AJax load Syntax*/

function ajaxLoad() {

    var URL = "URL";
    var data = {
        key1: value,
        key2: "value"
    };

    $("#targetDOMElement").load(URL, data, function(responseTxt, statusTxt, xhr) {

        if (statusTxt == "success") {
            console.log("Success");
        }
        if (statusTxt == "error") {
            console.log("Failed");
        }

    });
}

/*------------------------------------------------------------------------------------------*/