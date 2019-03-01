package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActiveTabChanged event that concerns manipulations on tabs.
  */
trait ASPxClientHtmlEditorTabEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name that uniquely identifies an editor tab.
    * Value: A string value that is the tab name.
    */
  var name: java.lang.String
}

object ASPxClientHtmlEditorTabEventArgs {
  @scala.inline
  def apply(name: java.lang.String): ASPxClientHtmlEditorTabEventArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorTabEventArgs]
  }
}

