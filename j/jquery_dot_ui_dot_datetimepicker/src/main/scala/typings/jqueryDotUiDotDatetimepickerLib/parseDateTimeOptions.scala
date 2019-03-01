package typings
package jqueryDotUiDotDatetimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait parseDateTimeOptions extends js.Object {
  var dateFormat: java.lang.String
  var dateSettings: java.lang.String
  var dateTimeString: java.lang.String
  var timeFormat: java.lang.String
  var timeSettings: java.lang.String
}

object parseDateTimeOptions {
  @scala.inline
  def apply(
    dateFormat: java.lang.String,
    dateSettings: java.lang.String,
    dateTimeString: java.lang.String,
    timeFormat: java.lang.String,
    timeSettings: java.lang.String
  ): parseDateTimeOptions = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat, dateSettings = dateSettings, dateTimeString = dateTimeString, timeFormat = timeFormat, timeSettings = timeSettings)
  
    __obj.asInstanceOf[parseDateTimeOptions]
  }
}

