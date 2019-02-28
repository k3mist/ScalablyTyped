package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends IObjectOptions {
  /**
  	 * additional space between characters
  	 * expressed in thousands of em unit
  	 * @type Number
  	 */
  var charSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Baseline shift, stlyes only, keep at 0 for the main text object
  	 * @type {Number}
  	 */
  var deltaY: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Font family
  	 * @type String
  	 */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Font size (in pixels)
  	 * @type Number
  	 */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Font style . Possible values: "", "normal", "italic" or "oblique".
  	 * @type String
  	 */
  var fontStyle: js.UndefOr[
    fabricLib.fabricLibStrings.Empty | fabricLib.fabricLibStrings.normal | fabricLib.fabricLibStrings.italic | fabricLib.fabricLibStrings.oblique
  ] = js.undefined
  /**
  	 * Font weight (e.g. bold, normal, 400, 600, 800)
  	 * @type {(Number|String)}
  	 */
  var fontWeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Line height
  	 * @type Number
  	 */
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Text decoration linethrough.
  	 * @type Boolean
  	 */
  var linethrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Text decoration overline.
  	 * @type Boolean
  	 */
  var overline: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Object containing character styles - top-level properties -> line numbers,
  	 * 2nd-level properties - charater numbers
  	 * @type Object
  	 */
  var styles: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Subscript schema object (minimum overlap)
  	 * @type {Object}
  	 */
  var subscript: js.UndefOr[fabricLib.Anon_Baseline] = js.undefined
  /**
  	 * Superscript schema object (minimum overlap)
  	 * @type {Object}
  	 */
  var superscript: js.UndefOr[fabricLib.Anon_Baseline] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text alignment. Possible values: "left", "center", "right", "justify",
  	 * "justify-left", "justify-center" or "justify-right".
  	 * @type String
  	 */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Background color of text lines
  	 * @type String
  	 */
  var textBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text decoration underline.
  	 * @type Boolean
  	 */
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

