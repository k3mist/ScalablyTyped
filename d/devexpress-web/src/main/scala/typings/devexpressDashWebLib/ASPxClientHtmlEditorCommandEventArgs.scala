package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to command processing (CustomCommand).
  */
trait ASPxClientHtmlEditorCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    * Value: A string value representing the processed command's name.
    */
  var commandName: java.lang.String
  /**
    * Gets an optional parameter that complements the processed command.
    * Value: A string value containing additional information about the processed command.
    */
  var parameter: js.Object
}

object ASPxClientHtmlEditorCommandEventArgs {
  @scala.inline
  def apply(commandName: java.lang.String, parameter: js.Object): ASPxClientHtmlEditorCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName, parameter = parameter)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandEventArgs]
  }
}

