package typings
package nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  /** the dsn options */
  var dsn: js.UndefOr[DSNOptions] = js.undefined
  /** includes an address object or is set to false */
  var from: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`
  /** an optional value of the predicted size of the message in bytes. This value is used if the server supports the SIZE extension (RFC1870) */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** the recipient address or an array of addresses */
  var to: java.lang.String | js.Array[java.lang.String]
  /** if true then inform the server that this message might contain bytes outside 7bit ascii range */
  var use8BitMime: js.UndefOr[scala.Boolean] = js.undefined
}

object Envelope {
  @scala.inline
  def apply(
    from: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`,
    to: java.lang.String | js.Array[java.lang.String],
    dsn: DSNOptions = null,
    size: scala.Int | scala.Double = null,
    use8BitMime: js.UndefOr[scala.Boolean] = js.undefined
  ): Envelope = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (dsn != null) __obj.updateDynamic("dsn")(dsn)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(use8BitMime)) __obj.updateDynamic("use8BitMime")(use8BitMime)
    __obj.asInstanceOf[Envelope]
  }
}

