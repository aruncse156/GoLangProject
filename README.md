● Mock the database by maintaining a list of user details in a variable.

	Used H2 database and stored the rows inside the table using data.sql
	
● An endpoint to fetch user details based on user id.
● An endpoint to fetch a list of user details based on a list of ids.

	created an endpoint to fetch List of users based on the id/list of ids
	
	localhost:8080/get/id?ids=1
	output: return the user whose id is 1
	[{"id":1,"fname":"abc","city":"Hyderabad","phno":9603189344,"height":3.6,"married":true}]
	
	localhost:8080/get/id?ids=1&ids=2
	output: list of users whose id is 1 and 2.
	[{"id":1,"fname":"abc","city":"Hyderabad","phno":9603189344,"height":3.6,"married":true},{"id":2,"fname":"xyz","city":"Hyderabad","phno":8605189344,"height":3.6,"married":true}]
	
● An endpoint to fetch all the user details
	
	localhost:8080/get
	output: list of all the users inserted in the database
	[{"id":1,"fname":"abc","city":"Hyderabad","phno":9603189344,"height":3.6,"married":true},{"id":2,"fname":"xyz","city":"Hyderabad","phno":8605189344,"height":3.6,"married":true},{"id":3,"fname":"lmn","city":"Bangalore","phno":9603182747,"height":2.6,"married":false},{"id":4,"fname":"def","city":"Chennai","phno":9603155546,"height":3.4,"married":false}]
	