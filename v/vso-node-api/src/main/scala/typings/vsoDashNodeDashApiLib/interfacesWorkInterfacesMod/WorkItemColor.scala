package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemColor extends js.Object {
  var icon: java.lang.String
  var primaryColor: java.lang.String
  var workItemTypeName: java.lang.String
}

object WorkItemColor {
  @scala.inline
  def apply(icon: java.lang.String, primaryColor: java.lang.String, workItemTypeName: java.lang.String): WorkItemColor = {
    val __obj = js.Dynamic.literal(icon = icon, primaryColor = primaryColor, workItemTypeName = workItemTypeName)
  
    __obj.asInstanceOf[WorkItemColor]
  }
}

