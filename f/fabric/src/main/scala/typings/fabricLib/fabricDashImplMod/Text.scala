package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.TextOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined fontSize, fontWeight, fontFamily, underline, overline, linethrough, textAlign, fontStyle, lineHeight, superscript, subscript, textBackgroundColor, charSpacing, styles, deltaY, text */ @JSImport("fabric/fabric-impl", "Text")
@js.native
class Text protected () extends Object {
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, options: TextOptions) = this()
  /**
  	 * additional space between characters
  	 * expressed in thousands of em unit
  	 * @type Number
  	 */
  var charSpacing: js.UndefOr[scala.Double] = js.native
  /**
  	 * Baseline shift, stlyes only, keep at 0 for the main text object
  	 * @type {Number}
  	 */
  var deltaY: js.UndefOr[scala.Double] = js.native
  /**
  	 * Font family
  	 * @type String
  	 */
  var fontFamily: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Font size (in pixels)
  	 * @type Number
  	 */
  var fontSize: js.UndefOr[scala.Double] = js.native
  /**
  	 * Font style . Possible values: "", "normal", "italic" or "oblique".
  	 * @type String
  	 */
  var fontStyle: js.UndefOr[
    fabricLib.fabricLibStrings.Empty | fabricLib.fabricLibStrings.normal | fabricLib.fabricLibStrings.italic | fabricLib.fabricLibStrings.oblique
  ] = js.native
  /**
  	 * Font weight (e.g. bold, normal, 400, 600, 800)
  	 * @type {(Number|String)}
  	 */
  var fontWeight: js.UndefOr[java.lang.String | scala.Double] = js.native
  /**
  	 * Line height
  	 * @type Number
  	 */
  var lineHeight: js.UndefOr[scala.Double] = js.native
  /**
  	 * Text decoration linethrough.
  	 * @type Boolean
  	 */
  var linethrough: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Text decoration overline.
  	 * @type Boolean
  	 */
  var overline: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Object containing character styles - top-level properties -> line numbers,
  	 * 2nd-level properties - charater numbers
  	 * @type Object
  	 */
  var styles: js.UndefOr[js.Any] = js.native
  /**
  	 * Subscript schema object (minimum overlap)
  	 * @type {Object}
  	 */
  var subscript: js.UndefOr[fabricLib.Anon_Baseline] = js.native
  /**
  	 * Superscript schema object (minimum overlap)
  	 * @type {Object}
  	 */
  var superscript: js.UndefOr[fabricLib.Anon_Baseline] = js.native
  var text: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Text alignment. Possible values: "left", "center", "right", "justify",
  	 * "justify-left", "justify-center" or "justify-right".
  	 * @type String
  	 */
  var textAlign: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Background color of text lines
  	 * @type String
  	 */
  var textBackgroundColor: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Text decoration underline.
  	 * @type Boolean
  	 */
  var underline: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Calculate text box height
  	 */
  def calcTextHeight(): scala.Double = js.native
  /**
  	 * Check if characters in a text have a value for a property
  	 * whose value matches the textbox's value for that property.  If so,
  	 * the character-level property is deleted.  If the character
  	 * has no other properties, then it is also deleted.  Finally,
  	 * if the line containing that character has no other characters
  	 * then it also is deleted.
  	 *
  	 * @param {string} property The property to compare between characters and text.
  	 */
  def cleanStyle(property: java.lang.String): scala.Unit = js.native
  /**
  	 * Enlarge space boxes and shift the others
  	 */
  def enlargeSpaces(): scala.Unit = js.native
  /**
  	 * Returns 2d representation (lineIndex and charIndex) of cursor (or selection start)
  	 * @param {Number} [selectionStart] Optional index. When not given, current selectionStart is used.
  	 * @param {Boolean} [skipWrapping] consider the location for unwrapped lines. usefull to manage styles.
  	 */
  def get2DCursorLocation(selectionStart: scala.Double, skipWrapping: scala.Boolean): fabricLib.Anon_CharIndex = js.native
  /**
  	 * return a new object that contains all the style property for a character
  	 * the object returned is newly created
  	 * @param {Number} lineIndex of the line where the character is
  	 * @param {Number} charIndex position of the character on the line
  	 * @return {Object} style object
  	 */
  def getCompleteStyleDeclaration(lineIndex: scala.Double, charIndex: scala.Double): js.Any = js.native
  /**
  	 * Computes height of character at given position
  	 * @param {Number} line the line number
  	 * @param {Number} char the character number
  	 * @return {Number} fontSize of the character
  	 */
  def getHeightOfChar(line: scala.Double, char: scala.Double): scala.Double = js.native
  /**
  	 * Calculate height of line at 'lineIndex'
  	 * @param {Number} lineIndex index of line to calculate
  	 * @return {Number}
  	 */
  def getHeightOfLine(lineIndex: scala.Double): scala.Double = js.native
  /**
  	 * Return a context for measurement of text string.
  	 * if created it gets stored for reuse
  	 * @return {fabric.Text} thisArg
  	 */
  def getMeasuringContext(): stdLib.CanvasRenderingContext2D = js.native
  /**
  	 * Gets style of a current selection/cursor (at the start position)
  	 * if startIndex or endIndex are not provided, slectionStart or selectionEnd will be used.
  	 * @param {Number} [startIndex] Start index to get styles at
  	 * @param {Number} [endIndex] End index to get styles at, if not specified selectionEnd or startIndex + 1
  	 * @param {Boolean} [complete] get full style or not
  	 * @return {Array} styles an array with one, zero or more Style objects
  	 */
  def getSelectionStyles(): js.Array[_] = js.native
  def getSelectionStyles(startIndex: scala.Double): js.Array[_] = js.native
  def getSelectionStyles(startIndex: scala.Double, endIndex: scala.Double): js.Array[_] = js.native
  def getSelectionStyles(startIndex: scala.Double, endIndex: scala.Double, complete: scala.Boolean): js.Array[_] = js.native
  /**
  	 * Retrieves the value of property at given character position
  	 * @param {Number} lineIndex the line number
  	 * @param {Number} charIndex the charater number
  	 * @param {String} property the property name
  	 * @returns the value of 'property'
  	 */
  def getValueOfPropertyAt(lineIndex: scala.Double, charIndex: scala.Double, property: java.lang.String): js.Any = js.native
  /**
  	 * Initialize or update text dimensions.
  	 * Updates this.width and this.height with the proper values.
  	 * Does not return dimensions.
  	 */
  def initDimensions(): scala.Unit = js.native
  /**
  	 * Returns true if object has no styling or no styling in a line
  	 * @param {Number} lineIndex , lineIndex is on wrapped lines.
  	 * @return {Boolean}
  	 */
  def isEmptyStyles(lineIndex: scala.Double): scala.Boolean = js.native
  /**
  	 * Detect if the text line is ended with an hard break
  	 * text and itext do not have wrapping, return false
  	 * @return {Boolean}
  	 */
  def isEndOfWrapping(lineIndex: scala.Double): scala.Boolean = js.native
  /**
  	 * measure a text line measuring all characters.
  	 * @param {Number} lineIndex line number
  	 * @return {Number} Line width
  	 */
  def measureLine(lineIndex: scala.Double): scala.Double = js.native
  /**
  	 * Remove a style property or properties from all individual character styles
  	 * in a text object.  Deletes the character style object if it contains no other style
  	 * props.  Deletes a line style object if it contains no other character styles.
  	 *
  	 * @param {String} props The property to remove from character styles.
  	 */
  def removeStyle(property: java.lang.String): scala.Unit = js.native
  /**
  	 * Sets style of a current selection, if no selection exist, do not set anything.
  	 * @param {Object} [styles] Styles object
  	 * @param {Number} [startIndex] Start index to get styles at
  	 * @param {Number} [endIndex] End index to get styles at, if not specified selectionEnd or startIndex + 1
  	 * @return {fabric.IText} thisArg
  	 * @chainable
  	 */
  def setSelectionStyles(styles: js.Any): Text = js.native
  def setSelectionStyles(styles: js.Any, startIndex: scala.Double): Text = js.native
  def setSelectionStyles(styles: js.Any, startIndex: scala.Double, endIndex: scala.Double): Text = js.native
  /**
  	 * Turns the character into an 'inferior figure' (i.e. 'subscript')
  	 * @param {Number} start selection start
  	 * @param {Number} end selection end
  	 * @returns {fabric.Text} thisArg
  	 * @chainable
  	 */
  def setSubscript(start: scala.Double, end: scala.Double): Text = js.native
  /**
  	 * Turns the character into a 'superior figure' (i.e. 'superscript')
  	 * @param {Number} start selection start
  	 * @param {Number} end selection end
  	 * @returns {fabric.Text} thisArg
  	 * @chainable
  	 */
  def setSuperscript(start: scala.Double, end: scala.Double): Text = js.native
  /**
  	 * Returns true if object has a style property or has it ina specified line
  	 * @param {Number} lineIndex
  	 * @return {Boolean}
  	 */
  def styleHas(property: java.lang.String): scala.Boolean = js.native
  def styleHas(property: java.lang.String, lineIndex: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Text")
@js.native
object Text extends js.Object {
  var DEFAULT_SVG_FONT_SIZE: scala.Double = js.native
  /**
  	 * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
  	 * @static
  	 * @memberOf fabric.Text
  	 * @param {SVGElement} element Element to parse
  	 * @param {Function} callback callback function invoked after parsing
  	 * @param {Object} [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Text = js.native
  def fromElement(element: stdLib.SVGElement, callback: js.Function): fabricLib.fabricDashImplMod.Text = js.native
  def fromElement(
    element: stdLib.SVGElement,
    callback: js.Function,
    options: fabricLib.fabricDashImplMod.TextOptions
  ): fabricLib.fabricDashImplMod.Text = js.native
  /**
  	 * Returns fabric.Text instance from an object representation
  	 * @static
  	 * @memberOf fabric.Text
  	 * @param {Object} object Object to create an instance from
  	 * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Text = js.native
  def fromObject(`object`: js.Any, callback: js.Function): fabricLib.fabricDashImplMod.Text = js.native
}

