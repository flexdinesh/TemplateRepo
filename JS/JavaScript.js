/*JavaScript function declaration*/
function functionName(arg1, arg2) {

        //function logic

        return value;
    }


/*JavaScript function expression*/
var functionName = function(arg1, arg2) {

    //function logic

    return value;
};

/*Self invoking function*/
(function(){
    
    //function logic
    
})();
/*----------------------------------------------------------------------*/

/* BEGIN - Naming Convention*/

	var variableName;
	var CONSTANTS;
	var GLOBALVARIABLE;

	var _privateMethod = function() {

        // Private method

    };

    var publicMethod = function() {

        // Public method

    };

/* END - Naming Convention*/

/*----------------------------------------------------------------------*/

/* BEGIN - Module Pattern*/

// Type 1 - Anonymous Object Literal return - Mostly followed pattern
var Module = (function() {

	// private variable
	var privateVariable = "value";

	// locally scoped Object
    var myObject = {};

    var _privateMethod = function() {

    };

    return {

    	// public variable
		publicVariable: "value",

        publicMethodOne: function() {

        	// Public method
            //can call privateMethod()

        },

        publicMethodtwo: function() {

        	// Public method

        },

        publicMethodThree: function() {

        	// Public method

        }
    };
})();



// Type 2 - Locally scoped Object Literal
var Module = (function() {

    // locally scoped Object
    var myObject = {};

    // declared with `var`, must be "private"
    var _privateMethod = function() {

        // Private method, not accessible outside scope
        // function logic

    };

    myObject.someMethod = function() {

        // Public method

    };    
    return myObject;

})();


// Type 3 - Stacked locally scoped Object Literal
var Module = (function() {

    var _privateMethod = function() {

        // Private method, not accessible outside scope
        // function logic

    };

    //object name doesn't matter, it will be returned as 'Module' object
    var myObject = {
        someMethod: function() {

            // Public method

        },
        anotherMethod: function() {

            // Public method

        }
    };
    return myObject;

})();


//Type 4 - Revealing Module Pattern
var Module = (function() {

    var _privateMethod = function() {

        // private

    };
    var someMethod = function() {

        // public

    };
    var anotherMethod = function() {

        // public

    };
    return {
        someMethod: someMethod,
        anotherMethod: anotherMethod
    };

})();
/* END - Module Pattern*/

/*----------------------------------------------------------------------*/