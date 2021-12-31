Rest calls:
GET / books/{ISBN}
GET /books/{ISBN}/categroies
GET /books?title=M&author=alice&offset=42&pagesize=20

POST /carts
POST /carts/{id}/books
PUT /carts/{id}
DELETE /carts/{id}/books/{ISBN} –URL depth can be arbitrarily deep

GET /users
request:  -- empty json data
response: [{userId:1, username: ”alice”, userStatus:”silver”},
{userId:2, username: ”jackson”, userStatus:”gold”}
POST /users
request :{ username: “fresh”, userStatus: “gold”}
reply : { id: 101, username: “fresh”, userStatus: “gold”}	-- reply came with user id
PUT /users/{userId}
request: {userStatus: “silver”}
response: {userId: 1, username”alice”, userStatus:”silver”}
 
To checkout a shopping cart – options
1 – POST /carts/{ID}?action=checkout
2 – POST /purchases/carts/{cartId}
3 – POST /carts/{id}/purchases

Rest return codes
200: OK
201: Created
204: NO Content
304: NOT Modified
400: Bad Request
401: Not Authorized
404: Not Found
500: Internal Server Error

Json data:
JSON:
Numbers: 123
Booleans: true/false
Null: null
Strings: “abc”
Objects: { “attribute1” : 123, “attribute2”:true, “attribute3”:{“A”:1,”B”:2} } – attribute3 is a map
Arrays: [1,2,3,4]

