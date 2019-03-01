package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactOrganization extends js.Object {
  var department: java.lang.String
  var name: java.lang.String
  var pref: scala.Boolean
  var title: java.lang.String
  var `type`: java.lang.String
}

object ContactOrganization {
  @scala.inline
  def apply(
    department: java.lang.String,
    name: java.lang.String,
    pref: scala.Boolean,
    title: java.lang.String,
    `type`: java.lang.String
  ): ContactOrganization = {
    val __obj = js.Dynamic.literal(department = department, name = name, pref = pref, title = title, `type` = `type`)
  
    __obj.asInstanceOf[ContactOrganization]
  }
}

