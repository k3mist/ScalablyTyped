package typings
package atStorybookAddonDashInfoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: js.Any
  var description: java.lang.String
  var propType: js.Object | java.lang.String
  var property: java.lang.String
   // TODO: info about what this object is...
  var required: scala.Boolean
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    description: java.lang.String,
    propType: js.Object | java.lang.String,
    property: java.lang.String,
    required: scala.Boolean
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, description = description, propType = propType.asInstanceOf[js.Any], property = property, required = required)
  
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

