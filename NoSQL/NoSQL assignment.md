USECASE :
1. The user logs in through a common login portal .
2. The editor can create a page, write a blog, and also comment on blogs.

For Collection USER 

{
	_id : ObjectId(),
	name: String,
	username: String,
	passwd: String,
	add: String,
	phoneNo : Number,
	role_id : role of the user from ROLE collection,
	lastLoginTime: time stamp
}
	
For Collection ROLE

{
	_id : ObjectId(),
	name: String
}

For Collection PAGE

{
	_id : ObjectID(),
	title: String,
	content: String,
	slug: String,
	created: Time stamp
}

For Collection BLOG

{
	_id : ObjectID(),
	title: String,
	authorId: Id of the user from USER collection,
	content: String,
	created: time stamp,
	comment:[ ARRAY_OF_COMMENTS
			{
				_id : ObjectId(),
				created: time stamp,
				authorId: Id of user making the comment,
				content: String
			}...
	]
}


		
	
