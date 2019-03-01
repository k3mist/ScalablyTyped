package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextEntry extends js.Object {
  /** the input data */
  val actual: js.UndefOr[js.Any] = js.undefined
  val key: java.lang.String
  val `type`: Decoder[_, _]
}

object ContextEntry {
  @scala.inline
  def apply(key: java.lang.String, `type`: Decoder[_, _], actual: js.Any = null): ContextEntry = {
    val __obj = js.Dynamic.literal(key = key, `type` = `type`)
    if (actual != null) __obj.updateDynamic("actual")(actual)
    __obj.asInstanceOf[ContextEntry]
  }
}

