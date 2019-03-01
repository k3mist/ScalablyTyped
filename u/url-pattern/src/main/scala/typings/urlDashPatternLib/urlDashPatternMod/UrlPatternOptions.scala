package typings
package urlDashPatternLib.urlDashPatternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlPatternOptions extends js.Object {
  var escapeChar: js.UndefOr[java.lang.String] = js.undefined
  var optionalSegmentEndChar: js.UndefOr[java.lang.String] = js.undefined
  var optionalSegmentStartChar: js.UndefOr[java.lang.String] = js.undefined
  var segmentNameCharset: js.UndefOr[java.lang.String] = js.undefined
  var segmentNameStartChar: js.UndefOr[java.lang.String] = js.undefined
  var segmentValueCharset: js.UndefOr[java.lang.String] = js.undefined
  var wildcardChar: js.UndefOr[java.lang.String] = js.undefined
}

object UrlPatternOptions {
  @scala.inline
  def apply(
    escapeChar: java.lang.String = null,
    optionalSegmentEndChar: java.lang.String = null,
    optionalSegmentStartChar: java.lang.String = null,
    segmentNameCharset: java.lang.String = null,
    segmentNameStartChar: java.lang.String = null,
    segmentValueCharset: java.lang.String = null,
    wildcardChar: java.lang.String = null
  ): UrlPatternOptions = {
    val __obj = js.Dynamic.literal()
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar)
    if (optionalSegmentEndChar != null) __obj.updateDynamic("optionalSegmentEndChar")(optionalSegmentEndChar)
    if (optionalSegmentStartChar != null) __obj.updateDynamic("optionalSegmentStartChar")(optionalSegmentStartChar)
    if (segmentNameCharset != null) __obj.updateDynamic("segmentNameCharset")(segmentNameCharset)
    if (segmentNameStartChar != null) __obj.updateDynamic("segmentNameStartChar")(segmentNameStartChar)
    if (segmentValueCharset != null) __obj.updateDynamic("segmentValueCharset")(segmentValueCharset)
    if (wildcardChar != null) __obj.updateDynamic("wildcardChar")(wildcardChar)
    __obj.asInstanceOf[UrlPatternOptions]
  }
}

