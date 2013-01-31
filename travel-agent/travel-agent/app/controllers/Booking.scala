package controllers

import play.api._
import play.api.mvc._

object Booking extends Controller {
  
  def booking = Action {
    Ok(views.html.booking("Customer Booking Form"))
  }
 
}