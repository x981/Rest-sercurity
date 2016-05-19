var MyApp = angular.module("MyApp", ['ngRoute']);
MyApp.service('MyService', function() {
	this.sachs = [
	                {
	                	tensach: "Android programing",
	                	gia: 20,
	                	hinhanh: '../images/android.jpg',
	                	thich: 1,
	                	khongthich: 0
	                	
	                }, {
	                	tensach: "C programing",
	                	gia: 40,
	                	hinhanh: '../images/C.jpg',
	                	thich: 5,
	                	khongthich: 0
	                }, {
	                	tensach: "C++ programing",
	                	gia: 34,
	                	hinhanh: '../images/C++.jpg',
	                	thich: 4,
	                	khongthich: 0
	                }, {
	                	tensach: "C## programing",
	                	gia: 15,
	                	hinhanh: '../images/Csharp.jpg',
	                	thich: 2,
	                	khongthich: 0
	                }, {
	                	tensach: "Ios programing",
	                	gia: 45,
	                	hinhanh: '../images/ios.jpg',
	                	thich: 9,
	                	khongthich: 0
	                }, {
	                	tensach: "Java programing",
	                	gia: 23,
	                	hinhanh: '../images/java.jpg',
	                	thich: 13,
	                	khongthich: 0
	                }, {
	                	tensach: "Perl programing",
	                	gia: 33,
	                	hinhanh: '../images/perl.jpg',
	                	thich: 11,
	                	khongthich: 0
	                }, {
	                	tensach: "PHP programing",
	                	gia: 26,
	                	hinhanh: '../images/php.jpg',
	                	thich: 5,
	                	khongthich: 0
	                }, {
	                	tensach: "Python programing",
	                	gia: 12,
	                	hinhanh: '../images/Python.jpg',
	                	thich: 9,
	                	khongthich: 0
	                }
	]
});
MyApp.config(function($routeProvider){
	$routeProvider
		.when('/',{
			controller: 'MyController',
			templateUrl: "detail.html"
		})
		.when('/book/:id',{
			controller: 'DetailController',
			templateUrl: "spview.html"
		})
		.otherwise({ 
		      redirectTo: '/' 
		}); 
});