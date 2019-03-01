package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters used in the ASPxHtmlEditor's client-side commands.
  */
trait ASPxClientHtmlEditorCommandArguments extends js.Object {
  /**
    * Gets the currently selected element in the ASPxHtmlEditor.
    * Value: An HTML object which is the currently selected element.
    */
  var selectedElement: js.Object
}

object ASPxClientHtmlEditorCommandArguments {
  @scala.inline
  def apply(selectedElement: js.Object): ASPxClientHtmlEditorCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandArguments]
  }
}

