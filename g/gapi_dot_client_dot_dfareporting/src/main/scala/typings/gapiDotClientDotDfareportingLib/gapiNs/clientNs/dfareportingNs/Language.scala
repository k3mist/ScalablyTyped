package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  /** Language ID of this language. This is the ID used for targeting and generating reports. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#language". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Format of language code is an ISO 639 two-letter language code optionally followed by an underscore followed by an ISO 3166 code. Examples are "en" for
    * English or "zh_CN" for Simplified Chinese.
    */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this language. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Language {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    languageCode: java.lang.String = null,
    name: java.lang.String = null
  ): Language = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Language]
  }
}

