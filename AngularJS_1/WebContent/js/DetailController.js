MyApp.controller('DetailController', function($scope, MyService, $routeParams){
	$scope.detail = MyService.sachs[$routeParams.id];
	$scope.like = function(index){
		$scope.detail.thich += 1; 
	};
	
	$scope.dislike = function(index){
		$scope.detail.khongthich += 1; 
	};
});