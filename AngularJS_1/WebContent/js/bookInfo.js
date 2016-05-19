MyApp.directive('bookInfo', function() {
	return {
		restrict: 'E',
		scope: { 
		      info: '=' 
	    },
		templateUrl: 'bookInfo.html'
	}
});