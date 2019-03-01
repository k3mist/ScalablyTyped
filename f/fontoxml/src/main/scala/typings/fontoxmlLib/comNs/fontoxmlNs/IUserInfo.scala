package typings
package fontoxmlLib.comNs.fontoxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserInfo extends IWorkflowInfo {
  var roleId: java.lang.String
}

object IUserInfo {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String, roleId: java.lang.String): IUserInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, roleId = roleId)
  
    __obj.asInstanceOf[IUserInfo]
  }
}

