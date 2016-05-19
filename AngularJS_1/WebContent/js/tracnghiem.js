var tracnghiemApp = angular.module("tracnghiemApp", []);

tracnghiemApp.controller("tracnghiem", function($scope, tnService) {
	$scope.detrcnghiem = tnService.cauhoi;
	$scope.index = 0;
});

tracnghiemApp.service("tnService", function() {
	this.cauhoi = [
	      {
	    	debai: '2 x 3',
	    	dapan: 6
	      }, 
	      {
	    	debai: '2 x 3', 
		    dapan: 6 
	      }
	      , 
	      {
	    	debai: '2 x 3', 
		    dapan: 6
	      }, 
	      {
	    	debai: '2 x 3', 
	    	dapan: 6 
	      }
	      
	];
});
