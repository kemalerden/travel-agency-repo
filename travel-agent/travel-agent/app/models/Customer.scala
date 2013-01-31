package models

case class Customer(val name:String , val surname:String)

object Customer {
  
  def all(): List[Customer] = Nil
  
  def create(name: String, surname:String) {}
  
  def delete(id: Long) {}
  
}
