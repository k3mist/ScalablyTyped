package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileAttributeBase[T] extends js.Object {
  var descriptor: AttributeDescriptor
  var revision: scala.Double
  var timeStamp: stdLib.Date
  var value: T
}

object ProfileAttributeBase {
  @scala.inline
  def apply[T](descriptor: AttributeDescriptor, revision: scala.Double, timeStamp: stdLib.Date, value: T): ProfileAttributeBase[T] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor, revision = revision, timeStamp = timeStamp, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProfileAttributeBase[T]]
  }
}

