package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Department extends js.Object {
  var Department: java.lang.String
  var Email: java.lang.String
  var MobilePhone: java.lang.String
  var Title: java.lang.String
}

object Anon_Department {
  @scala.inline
  def apply(
    Department: java.lang.String,
    Email: java.lang.String,
    MobilePhone: java.lang.String,
    Title: java.lang.String
  ): Anon_Department = {
    val __obj = js.Dynamic.literal(Department = Department, Email = Email, MobilePhone = MobilePhone, Title = Title)
  
    __obj.asInstanceOf[Anon_Department]
  }
}

