package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- jsflLib.FlashSymbolInstance because var conflicts: accName, actionScript, description, forceSimple, shortcut, silent, tabIndex. Inlined backgroundColor, bitmapRenderMode, blendMode, buttonTracking, cacheAsBitmap, colorAlphaAmount, colorAlphaPercent, colorBlueAmount, colorBluePercent, colorGreenAmount, colorGreenPercent, colorMode, colorRedAmount, colorRedPercent, filters, firstFrame, loop, symbolType, useBackgroundColor, visible */ trait FlashElement
  extends FlashShape
     with FlashInstance
     with FlashBitmapInstance
     with FlashCompiledClipInstance
     with FlashComponentInstance {
  var backgroundColor: java.lang.String
  var bitmapRenderMode: java.lang.String
  var blendMode: java.lang.String
  var buttonTracking: java.lang.String
  var cacheAsBitmap: scala.Boolean
  var colorAlphaAmount: scala.Double
  var colorAlphaPercent: scala.Double
  var colorBlueAmount: scala.Double
  var colorBluePercent: scala.Double
  var colorGreenAmount: scala.Double
  var colorGreenPercent: scala.Double
  var colorMode: java.lang.String
  var colorRedAmount: scala.Double
  var colorRedPercent: scala.Double
  var depth: scala.Double
  /**
  	 * Read-only property; a string that represents the type of the specified element.
  	 * The value is one of the following: "shape", "text", "instance", or "shapeObj".
  	 * A "shapeObj" is created with an extensible tool.
  	 */
  var elementType: java.lang.String
  var filters: js.Array[FlashFilter]
  var firstFrame: scala.Double
  var height: scala.Double
  var layer: FlashLayer
  var left: scala.Double
  var locked: scala.Boolean
  var loop: java.lang.String
  var matrix: FlashMatrix
  var name: java.lang.String
  var rotation: scala.Double
  var scaleX: scala.Double
  var scaleY: scala.Double
  var selected: scala.Boolean
  var skewX: scala.Double
  var skewY: scala.Double
  var symbolType: java.lang.String
  var top: scala.Double
  var transformX: scala.Double
  var transformY: scala.Double
  var useBackgroundColor: scala.Boolean
  var visible: scala.Boolean
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
  def getPersistentData(name: java.lang.String): js.Any
  def getTransformationPoint(): FlashPoint
  def hasPersistentData(name: java.lang.String): scala.Boolean
  def removePersistentData(name: java.lang.String): scala.Unit
  def setPersistentData(name: java.lang.String, `type`: java.lang.String, value: js.Any): scala.Unit
  def setTransformationPoint(transformationPoint: FlashPoint): scala.Unit
}

object FlashElement {
  @scala.inline
  def apply(
    accName: java.lang.String,
    actionScript: java.lang.String,
    backgroundColor: java.lang.String,
    beginEdit: js.Function0[scala.Unit],
    bitmapRenderMode: java.lang.String,
    blendMode: java.lang.String,
    buttonTracking: java.lang.String,
    cacheAsBitmap: scala.Boolean,
    closePath: scala.Boolean,
    colorAlphaAmount: scala.Double,
    colorAlphaPercent: scala.Double,
    colorBlueAmount: scala.Double,
    colorBluePercent: scala.Double,
    colorGreenAmount: scala.Double,
    colorGreenPercent: scala.Double,
    colorMode: java.lang.String,
    colorRedAmount: scala.Double,
    colorRedPercent: scala.Double,
    contours: js.Array[FlashContour],
    deleteEdge: js.Function1[scala.Double, scala.Unit],
    depth: scala.Double,
    description: java.lang.String,
    edges: js.Array[FlashEdge],
    elementType: java.lang.String,
    endAngle: scala.Double,
    endEdit: js.Function0[scala.Unit],
    filters: js.Array[FlashFilter],
    firstFrame: scala.Double,
    forceSimple: scala.Boolean,
    getBits: js.Function0[_FlashBitmap],
    getCubicSegmentPoints: js.Function1[scala.Double, js.Array[FlashPoint]],
    getPersistentData: js.Function1[java.lang.String, js.Any],
    getTransformationPoint: js.Function0[FlashPoint],
    hPixels: scala.Double,
    hasPersistentData: js.Function1[java.lang.String, scala.Boolean],
    height: scala.Double,
    innerRadius: scala.Double,
    isDrawingObject: scala.Boolean,
    isGroup: scala.Boolean,
    isOvalObject: scala.Boolean,
    isRectangleObject: scala.Boolean,
    layer: FlashLayer,
    left: scala.Double,
    locked: scala.Boolean,
    loop: java.lang.String,
    matrix: FlashMatrix,
    members: js.Array[FlashShape],
    name: java.lang.String,
    numCubicSegments: scala.Double,
    parameters: js.Array[_],
    removePersistentData: js.Function1[java.lang.String, scala.Unit],
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    selected: scala.Boolean,
    setBits: js.Function1[_FlashBitmap, scala.Unit],
    setPersistentData: js.Function3[java.lang.String, java.lang.String, js.Any, scala.Unit],
    setTransformationPoint: js.Function1[FlashPoint, scala.Unit],
    shortcut: java.lang.String,
    silent: scala.Boolean,
    skewX: scala.Double,
    skewY: scala.Double,
    startAngle: scala.Double,
    symbolType: java.lang.String,
    tabIndex: scala.Double,
    top: scala.Double,
    transformX: scala.Double,
    transformY: scala.Double,
    useBackgroundColor: scala.Boolean,
    vPixels: scala.Double,
    vertices: js.Array[FlashVertex],
    visible: scala.Boolean,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    instanceType: java.lang.String = null,
    libraryItem: FlashItem = null
  ): FlashElement = {
    val __obj = js.Dynamic.literal(accName = accName, actionScript = actionScript, backgroundColor = backgroundColor, beginEdit = beginEdit, bitmapRenderMode = bitmapRenderMode, blendMode = blendMode, buttonTracking = buttonTracking, cacheAsBitmap = cacheAsBitmap, closePath = closePath, colorAlphaAmount = colorAlphaAmount, colorAlphaPercent = colorAlphaPercent, colorBlueAmount = colorBlueAmount, colorBluePercent = colorBluePercent, colorGreenAmount = colorGreenAmount, colorGreenPercent = colorGreenPercent, colorMode = colorMode, colorRedAmount = colorRedAmount, colorRedPercent = colorRedPercent, contours = contours, deleteEdge = deleteEdge, depth = depth, description = description, edges = edges, elementType = elementType, endAngle = endAngle, endEdit = endEdit, filters = filters, firstFrame = firstFrame, forceSimple = forceSimple, getBits = getBits, getCubicSegmentPoints = getCubicSegmentPoints, getPersistentData = getPersistentData, getTransformationPoint = getTransformationPoint, hPixels = hPixels, hasPersistentData = hasPersistentData, height = height, innerRadius = innerRadius, isDrawingObject = isDrawingObject, isGroup = isGroup, isOvalObject = isOvalObject, isRectangleObject = isRectangleObject, layer = layer, left = left, locked = locked, loop = loop, matrix = matrix, members = members, name = name, numCubicSegments = numCubicSegments, parameters = parameters, removePersistentData = removePersistentData, rotation = rotation, scaleX = scaleX, scaleY = scaleY, selected = selected, setBits = setBits, setPersistentData = setPersistentData, setTransformationPoint = setTransformationPoint, shortcut = shortcut, silent = silent, skewX = skewX, skewY = skewY, startAngle = startAngle, symbolType = symbolType, tabIndex = tabIndex, top = top, transformX = transformX, transformY = transformY, useBackgroundColor = useBackgroundColor, vPixels = vPixels, vertices = vertices, visible = visible, width = width, x = x, y = y)
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (libraryItem != null) __obj.updateDynamic("libraryItem")(libraryItem)
    __obj.asInstanceOf[FlashElement]
  }
}

