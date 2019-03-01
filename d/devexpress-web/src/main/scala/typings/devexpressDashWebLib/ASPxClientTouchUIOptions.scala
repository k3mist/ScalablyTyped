package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options affecting the touch scrolling functionality.
  */
trait ASPxClientTouchUIOptions extends js.Object {
  /**
    * Gets or sets the name of the CSS class defining the horizontal scroll bar's appearance.
    * Value: A string value specifying the class name.
    */
  var hScrollClassName: java.lang.String
  /**
    * Gets or sets a value that specifies whether or not the horizontal scroll bar should be displayed.
    * Value: true to display the horizontal scroll bar; otherwise, false. The default value is true.
    */
  var showHorizontalScrollbar: scala.Boolean
  /**
    * Gets or sets a value that specifies whether or not the vertical scroll bar should be displayed.
    * Value: true to display the vertical scroll bar; otherwise, false. The default value is true.
    */
  var showVerticalScrollbar: scala.Boolean
  /**
    * Gets or sets the name of the CSS class defining the vertical scroll bar's appearance.
    * Value: A string value specifying the class name.
    */
  var vScrollClassName: java.lang.String
}

object ASPxClientTouchUIOptions {
  @scala.inline
  def apply(
    hScrollClassName: java.lang.String,
    showHorizontalScrollbar: scala.Boolean,
    showVerticalScrollbar: scala.Boolean,
    vScrollClassName: java.lang.String
  ): ASPxClientTouchUIOptions = {
    val __obj = js.Dynamic.literal(hScrollClassName = hScrollClassName, showHorizontalScrollbar = showHorizontalScrollbar, showVerticalScrollbar = showVerticalScrollbar, vScrollClassName = vScrollClassName)
  
    __obj.asInstanceOf[ASPxClientTouchUIOptions]
  }
}

