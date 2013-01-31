package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._


object CustomerController extends Controller {
  
  def customer = Action {
    Ok(views.html.customer(customerForm))
  }
 

	val customerForm = Form(
	   tuple(
        "name" -> nonEmptyText,
	    "surname" -> nonEmptyText
	  )
	)


  def getCustomers = TODO
  def getCustomer(id:Long) = TODO
  def createCustomer = TODO
  def updateCustomer = TODO
  def deleteCustomer(id: Long) = TODO
  
}