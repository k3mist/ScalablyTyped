package typings
package reactDashJsonDashPrettyLib.reactDashJsonDashPrettyMod.JSONPrettyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONPrettyProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashJsonDashPrettyLib.JSONPretty] {
  var json: js.Object | java.lang.String
}

object JSONPrettyProps {
  @scala.inline
  def apply(
    json: js.Object | java.lang.String,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashJsonDashPrettyLib.JSONPretty] = null
  ): JSONPrettyProps = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    __obj.asInstanceOf[JSONPrettyProps]
  }
}

