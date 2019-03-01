package typings
package dotenvDashExpandLib.dotenvDashExpandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvResult extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var parsed: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object DotenvResult {
  @scala.inline
  def apply(
    error: stdLib.Error = null,
    parsed: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): DotenvResult = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (parsed != null) __obj.updateDynamic("parsed")(parsed)
    __obj.asInstanceOf[DotenvResult]
  }
}

