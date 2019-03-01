package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a collection of one type of object.
  */
trait IObjectCollection[T] extends js.Object {
  /**
    * An array container for objects when a collection of objects is
    * returned.
    */
  var data: js.Array[T]
}

object IObjectCollection {
  @scala.inline
  def apply[T](data: js.Array[T]): IObjectCollection[T] = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[IObjectCollection[T]]
  }
}

