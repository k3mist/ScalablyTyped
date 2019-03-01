package typings
package webgmeLib.GmePanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithHeader extends Options {
  var FLOATING_TITLE: java.lang.String
  var HEADER_TITLE: java.lang.String
  var NO_SCROLLING: java.lang.String
}

object OptionsWithHeader {
  @scala.inline
  def apply(
    FLOATING_TITLE: java.lang.String,
    HEADER_TITLE: java.lang.String,
    LOGGER_INSTANCE_NAME: java.lang.String,
    NO_SCROLLING: java.lang.String
  ): OptionsWithHeader = {
    val __obj = js.Dynamic.literal(FLOATING_TITLE = FLOATING_TITLE, HEADER_TITLE = HEADER_TITLE, LOGGER_INSTANCE_NAME = LOGGER_INSTANCE_NAME, NO_SCROLLING = NO_SCROLLING)
  
    __obj.asInstanceOf[OptionsWithHeader]
  }
}

