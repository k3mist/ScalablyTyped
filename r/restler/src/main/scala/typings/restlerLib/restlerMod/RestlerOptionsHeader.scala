package typings
package restlerLib.restlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the header.
  * @interface
  */
trait RestlerOptionsHeader
  extends /* headerName */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object RestlerOptionsHeader {
  @scala.inline
  def apply(
    StringDictionary: /* headerName */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): RestlerOptionsHeader = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RestlerOptionsHeader]
  }
}

