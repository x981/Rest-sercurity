MyApp.controller("MyController", function($scope, MyService){
	$scope.tieude = "Programing books";
	$scope.books = MyService.sachs;
	$scope.like = function(index){
		$scope.books[index].thich += 1; 
	};
	
	$scope.dislike = function(index){
		$scope.books[index].khongthich += 1; 
	};
});