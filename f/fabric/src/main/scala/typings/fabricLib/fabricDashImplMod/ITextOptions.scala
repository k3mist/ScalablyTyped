package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextOptions extends TextOptions {
  /**
  	 * Indicates whether internal text char widths can be cached
  	 * @type Boolean
  	 */
  var caching: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * For functionalities on keyDown + ctrl || cmd
  	 */
  var ctrlKeysMapDown: js.UndefOr[js.Any] = js.undefined
  /**
  	 * For functionalities on keyUp + ctrl || cmd
  	 */
  var ctrlKeysMapUp: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Color of default cursor (when not overwritten by character style)
  	 * @type String
  	 */
  var cursorColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Delay between cursor blink (in ms)
  	 * @type Number
  	 */
  var cursorDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Duration of cursor fadein (in ms)
  	 * @type Number
  	 */
  var cursorDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Width of cursor (in px)
  	 * @type Number
  	 */
  var cursorWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates whether a text can be edited
  	 * @type Boolean
  	 */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Border color of text object while it's in editing mode
  	 * @type String
  	 */
  var editingBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Helps determining when the text is in composition, so that the cursor
  	 * rendering is altered.
  	 */
  var inCompositionMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates whether text is in editing mode
  	 * @type Boolean
  	 */
  var isEditing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * For functionalities on keyDown
  	 * Map a special key to a function of the instance/prototype
  	 * If you need different behaviour for ESC or TAB or arrows, you have to change
  	 * this map setting the name of a function that you build on the fabric.Itext or
  	 * your prototype.
  	 * the map change will affect all Instances unless you need for only some text Instances
  	 * in that case you have to clone this object and assign your Instance.
  	 * this.keysMap = fabric.util.object.clone(this.keysMap);
  	 * The function must be in fabric.Itext.prototype.myFunction And will receive event as args[0]
  	 */
  var keysMap: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Color of text selection
  	 * @type String
  	 */
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Index where text selection ends
  	 * @type Number
  	 */
  var selectionEnd: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Index where text selection starts (or where cursor is when there is no selection)
  	 * @type Number
  	 */
  var selectionStart: js.UndefOr[scala.Double] = js.undefined
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
}

