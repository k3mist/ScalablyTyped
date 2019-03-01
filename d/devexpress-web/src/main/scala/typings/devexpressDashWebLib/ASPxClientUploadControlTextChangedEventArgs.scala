package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the TextChanged client event that allows you to respond to an end-user changing an edit box's text.
  */
trait ASPxClientUploadControlTextChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the index of a file input element within the ASPxUploadControl.
    * Value: An integer value that specifies the file input element's index.
    */
  var inputIndex: scala.Double
}

object ASPxClientUploadControlTextChangedEventArgs {
  @scala.inline
  def apply(inputIndex: scala.Double): ASPxClientUploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex)
  
    __obj.asInstanceOf[ASPxClientUploadControlTextChangedEventArgs]
  }
}

