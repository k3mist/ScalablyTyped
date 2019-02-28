package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPatternOptions extends js.Object {
  /**
  	 * crossOrigin value (one of "", "anonymous", "use-credentials")
  	 * @see https://developer.mozilla.org/en-US/docs/HTML/CORS_settings_attributes
  	 * @type String
  	 */
  var crossOrigin: js.UndefOr[
    fabricLib.fabricLibStrings.Empty | fabricLib.fabricLibStrings.anonymous | fabricLib.fabricLibStrings.`use-credentials`
  ] = js.undefined
  /**
  	 * Pattern horizontal offset from object's left/top corner
  	 */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Pattern vertical offset from object's left/top corner
  	 */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Transform matrix to change the pattern, imported from svgs
  	 */
  var patternTransform: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
  	 * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
  	 */
  var repeat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The source for the pattern
  	 */
  var source: java.lang.String | stdLib.HTMLImageElement
}

