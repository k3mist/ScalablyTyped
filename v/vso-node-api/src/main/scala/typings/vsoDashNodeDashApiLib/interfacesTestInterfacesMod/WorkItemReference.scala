package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemReference extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
  var webUrl: java.lang.String
}

object WorkItemReference {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String,
    webUrl: java.lang.String
  ): WorkItemReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, `type` = `type`, url = url, webUrl = webUrl)
  
    __obj.asInstanceOf[WorkItemReference]
  }
}

