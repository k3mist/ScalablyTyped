package typings
package gapiDotClientDotPlusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  /** Media type of the link. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** URL of the link. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String = null, url: java.lang.String = null): Anon_Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Type]
  }
}

