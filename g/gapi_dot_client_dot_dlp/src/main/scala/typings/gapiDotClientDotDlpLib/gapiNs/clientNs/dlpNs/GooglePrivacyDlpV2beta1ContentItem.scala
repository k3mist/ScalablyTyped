package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ContentItem extends js.Object {
  /** Content data to inspect or redact. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Structured content for inspection. */
  var table: js.UndefOr[GooglePrivacyDlpV2beta1Table] = js.undefined
  /**
    * Type of the content, as defined in Content-Type HTTP header.
    * Supported types are: all "text" types, octet streams, PNG images,
    * JPEG images.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** String data to inspect or redact. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1ContentItem {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    table: GooglePrivacyDlpV2beta1Table = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): GooglePrivacyDlpV2beta1ContentItem = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (table != null) __obj.updateDynamic("table")(table)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ContentItem]
  }
}

