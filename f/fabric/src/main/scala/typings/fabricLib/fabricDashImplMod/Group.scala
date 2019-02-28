package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.IGroupOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined subTargetCheck, useSetOnGroup */ @JSImport("fabric/fabric-impl", "Group")
@js.native
/**
	 * Constructor
	 * @param objects Group objects
	 * @param [options] Options object
	 */
class Group ()
  extends Object
     with ICollection[Group] {
  def this(objects: js.Array[Object]) = this()
  def this(objects: js.Array[Object], options: IGroupOptions) = this()
  def this(objects: js.Array[Object], options: IGroupOptions, isAlreadyGrouped: scala.Boolean) = this()
  /**
  	 * Indicates if click events should also check for subtargets
  	 * @type Boolean
  	 */
  var subTargetCheck: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * setOnGroup is a method used for TextBox that is no more used since 2.0.0 The behavior is still
  	 * available setting this boolean to true.
  	 * @type Boolean
  	 * @since 2.0.0
  	 * @default
  	 */
  var useSetOnGroup: js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Adds an object to a group; Then recalculates group's dimension, position.
  	 * @return thisArg
  	 * @chainable
  	 */
  def addWithUpdate(`object`: Object): Group = js.native
  /**
  	 * Returns number representation of a collection complexity
  	 * @return complexity
  	 */
  /* InferMemberOverrides */
  override def complexity(): scala.Double = js.native
  /**
  	 * Destroys a group (restoring state of its objects)
  	 * @return {fabric.Group} thisArg
  	 * @chainable
  	 */
  def destroy(): Group = js.native
  /**
  	 * Check if this group or its parent group are caching, recursively up
  	 * @return {Boolean}
  	 */
  def isOnACache(): scala.Boolean = js.native
  /**
  	 * Realises the transform from this group onto the supplied object
  	 * i.e. it tells you what would happen if the supplied object was in
  	 * the group, and then the group was destroyed. It mutates the supplied
  	 * object.
  	 * @param {fabric.Object} object
  	 * @return {fabric.Object} transformedObject
  	 */
  def realizeTransform(`object`: Object): Object = js.native
  /**
  	 * Removes an object from a group; Then recalculates group's dimension, position.
  	 * @return thisArg
  	 * @chainable
  	 */
  def removeWithUpdate(`object`: Object): Group = js.native
  /**
  	 * Sets coordinates of all group objects
  	 * @return thisArg
  	 * @chainable
  	 */
  def setObjectsCoords(): Group = js.native
  /**
  	 * make a group an active selection, remove the group from canvas
  	 * the group has to be on canvas for this to work.
  	 * @return {fabric.ActiveSelection} thisArg
  	 * @chainable
  	 */
  def toActiveSelection(): ActiveSelection = js.native
  /**
  	 * Destroys a group (restoring state of its objects)
  	 * @return {fabric.Group} thisArg
  	 * @chainable
  	 */
  def ungroupOnCanvas(): Group = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Group")
@js.native
object Group extends js.Object {
  /**
  	 * Returns {@link fabric.Group} instance from an object representation
  	 * @param object Object to create a group from
  	 * @param [callback] Callback to invoke when an group instance is created
  	 */
  def fromObject(`object`: js.Any, callback: js.Function1[/* group */ this.type, _]): scala.Unit = js.native
}

