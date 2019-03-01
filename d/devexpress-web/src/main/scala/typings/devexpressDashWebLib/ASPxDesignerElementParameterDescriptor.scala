package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides general information about a report parameter.
  */
trait ASPxDesignerElementParameterDescriptor extends js.Object {
  /**
    * Provides access to the parameter description.
    * Value: A String value, specifying the parameter description.
    */
  var description: java.lang.String
  /**
    * Provides access to the parameter name.
    * Value: A String value, specifying the parameter name.
    */
  var name: java.lang.String
  /**
    * Provides access to the parameter type.
    * Value: A String value, specifying the parameter type.
    */
  var `type`: java.lang.String
  /**
    * Provides access to the parameter value.
    * Value: A Object, specifying the parameter value.
    */
  var value: js.Object
  /**
    * Provides access to the parameter visibility state.
    * Value: true if the parameter is visible; otherwise false.
    */
  var visible: scala.Boolean
}

object ASPxDesignerElementParameterDescriptor {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String,
    value: js.Object,
    visible: scala.Boolean
  ): ASPxDesignerElementParameterDescriptor = {
    val __obj = js.Dynamic.literal(description = description, name = name, `type` = `type`, value = value, visible = visible)
  
    __obj.asInstanceOf[ASPxDesignerElementParameterDescriptor]
  }
}

