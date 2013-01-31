package controllers

import play.api._
import play.api.mvc._

object CustomerController extends Controller {
  
  def customer = Action {
    Ok(views.html.customer("Customers"))
  }
 



  def getCustomers = TODO
  def getCustomer(id:Long) = TODO
  def createCustomer = TODO
  def updateCustomer = TODO
  def deleteCustomer(id: Long) = TODO
  
}