package typings
package nodeLib.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectorNotification[T] extends js.Object {
  var method: java.lang.String
  var params: T
}

object InspectorNotification {
  @scala.inline
  def apply[T](method: java.lang.String, params: T): InspectorNotification[T] = {
    val __obj = js.Dynamic.literal(method = method, params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InspectorNotification[T]]
  }
}

