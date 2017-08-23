package com.api.doc.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RestController
@RequestMapping("/user")
public class MainController {
	
	/**
	 * @api {get} /user?id={id} getUserById
	 * @apiName GetUsersById
	 * @apiGroup User
	 *
	 * @apiParam {Number} id Users unique ID.
	 * 
	 *
	 * @apiSuccess {String} firstName First Name of the User.
	 * @apiSuccess {String} middleName  Middle name of the User.
	 * @apiSuccess {String} lastName  Last Name of the User.
	 * @apiSuccess {Numeric} age  Age of the User.
	 *
	 * @apiSuccessExample Success-Response:
	 *     HTTP/1.1 200 OK
	 *     {
	 *       "firstName": "John",
	 *       "middleName": "M."
	 *       "lastName": "Doe"
	 *       "age":23
	 *     }
	 *
	 * @apiError UserNotFound The id of the User was not found.
	 *
	 * @apiErrorExample Error-Response:
	 *     HTTP/1.1 404 Not Found
	 *     {
	 *       "error": "UserNotFound"
	 *     }
	 */
	
	@RequestMapping(method=RequestMethod.GET)
	public String getUsers(){
		JsonObject response = new JsonObject();
		response.addProperty("firstName", "Mani");
		response.addProperty("middleName", "Kumar");
		response.addProperty("lastName", "Srivastava");
		response.addProperty("age", 23);
		
		return new Gson().toJson(response);
		
		
	}
	
	
	/**
	 * @api {post} /user/create createUser
	 * @apiName CreateUser
	 * @apiGroup User
	 * 
	 * @apiParam {String} firstName First Name of the User
	 * @apiParam {String} middleName Middle Name of the User
	 * @apiParam {String} lastName Last Name of the User
	 * @apiParam {Numeric} age Age of the User
	 * 
	 * @apiExample Request Example
	 * 	  {
	 * 		"firstName":"Mani",
	 * 		"middleName":"Kumar",
	 * 		"lastName":"Srivastava",
	 * 		"age":23
	 * 	  }
	 * 
	 * @apiSuccess {String} message 
	 * 
	 * @apiSuccessExample Success-Response:
	 *     HTTP/1.1 200 OK
	 *     {
	 *       "message":"User Created Successfully"
	 *     }
	 *     
	 * @apiError CreateException Unable to create the user.
	 *
	 * @apiErrorExample Error-Response:
	 *     HTTP/1.1 404 Not Found
	 *     {
	 *       "error": "Unable to create the user"
	 *     }
	 */
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createUser(@RequestBody String request){
		return "User Created Successfully";
	}
	
	/**
	 * @api {put} /user/update?id={id} updateUser
	 * @apiName UpdateUser
	 * @apiGroup User
	 * 
	 * @apiParam {Numeric} _id id of the user to update
	 * @apiParam {String} firstName First Name of the User
	 * @apiParam {String} middleName Middle Name of the User
	 * @apiParam {String} lastName Last Name of the User
	 * @apiParam {Numeric} age Age of the User
	 * 
	 * @apiExample Request Example
	 * 		curl -i /user/update?id=1
	 * 		{
	 * 			"firstName":"Mani",
	 * 			"middleName":"Kumar",
	 * 			"lastName":"Srivastava",
	 * 			"age":23
	 * 		}
	 * 
	 * @apiSuccess {String} message
	 * 
	 * @apiSuccessExample Success-Response
	 * 
	 * 	HTTP/1.1 200 OK
	 * 	{
	 * 		"message":"User Update Successfully"
	 * 	}
	 * 
	 * @apiError UpdateException Unable to update the user
	 * 
	 * @apiErrorExample Error-Response
	 * 
	 * 	HTTP/1.1 404 Not Found
	 * 	{
	 * 		"error":"Unable to update the user"
	 * 	}
	 */
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public String updateUser(@RequestBody String request){
		return "User Updated Successfully";
	}
	
}
