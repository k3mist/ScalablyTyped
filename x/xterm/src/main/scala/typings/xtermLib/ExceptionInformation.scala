package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionInformation extends js.Object {
  var domain: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object ExceptionInformation {
  @scala.inline
  def apply(domain: java.lang.String = null): ExceptionInformation = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    __obj.asInstanceOf[ExceptionInformation]
  }
}

