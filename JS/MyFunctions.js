/*Logger Definition - begin*/

var _myLogger = (function() {
    return {
        logEntry: function(methodName, objectName, fileName) {
            console.log(fileName + " : " + objectName + " : " + methodName + " : " + "Entering");
        },
        logExit: function(methodName, objectName, fileName) {
            console.log(fileName + " : " + objectName + " : " + methodName + " : " + "Exiting");
        },
        logParameters: function() {
            var parametersString = "";
            for (var i = 0; i < arguments.length; i++) {
                parametersString = parametersString + arguments[i] + " : ";
            }
            parametersString = parametersString.substring(0, parametersString.length - 3);
            console.log(parametersString);
        },
        logAjaxSuccess: function(methodName, objectName, fileName, URL) {
            console.log(fileName + " : " + objectName + " : " + methodName + " : " + " Ajax call" + " : " + URL + " : " + "Success");
        },
        logAjaxFail: function(methodName, objectName, fileName, URL) {
            console.warn(fileName + " : " + objectName + " : " + methodName + " : " + " Ajax call" + " : " + URL + " : " + "Fail");
        }
    };
})();

/*Logger Definition - end*/
