package typings
package nodemailerLib.libMimeDashNodeMod.MimeNodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addresses extends js.Object {
  var bcc: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cc: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var from: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `reply-to`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sender: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var to: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Addresses {
  @scala.inline
  def apply(
    bcc: js.Array[java.lang.String] = null,
    cc: js.Array[java.lang.String] = null,
    from: js.Array[java.lang.String] = null,
    `reply-to`: js.Array[java.lang.String] = null,
    sender: js.Array[java.lang.String] = null,
    to: js.Array[java.lang.String] = null
  ): Addresses = {
    val __obj = js.Dynamic.literal()
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (cc != null) __obj.updateDynamic("cc")(cc)
    if (from != null) __obj.updateDynamic("from")(from)
    if (`reply-to` != null) __obj.updateDynamic("reply-to")(`reply-to`)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Addresses]
  }
}

