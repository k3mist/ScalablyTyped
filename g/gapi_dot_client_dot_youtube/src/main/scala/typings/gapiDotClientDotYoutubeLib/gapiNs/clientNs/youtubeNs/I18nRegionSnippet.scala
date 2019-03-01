package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegionSnippet extends js.Object {
  /** The region code as a 2-letter ISO country code. */
  var gl: js.UndefOr[java.lang.String] = js.undefined
  /** The human-readable name of the region. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object I18nRegionSnippet {
  @scala.inline
  def apply(gl: java.lang.String = null, name: java.lang.String = null): I18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[I18nRegionSnippet]
  }
}

