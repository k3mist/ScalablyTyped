package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionable
  extends extjsLib.ExtNs.IBase {
  /** [Method] Aligns the element with another element relative to the specified anchor points
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var alignTo: js.UndefOr[
    js.Function4[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Anchors an element to another element and realigns it when the window is resized
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @param monitorScroll Boolean/Number True to monitor body scroll and reposition. If this parameter is a number, it is used as the buffer delay in milliseconds.
  		* @param callback Function The function to call after the animation finishes
  		* @returns Ext.util.Positionable this
  		*/
  var anchorTo: js.UndefOr[
    js.Function6[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* animate */ js.UndefOr[js.Any], 
      /* monitorScroll */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Calculates the new x y position to move this Positionable into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this Positionable was rendered, or this Component's {@link Ext.Component.constrainTo.
  		* @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to coerce into constraints instead of using this Positionable's current position.
  		* @param local Boolean The proposedPosition is local (relative to floatParent if a floating Component)
  		* @param proposedSize Number[] A proposed [width, height] size to use when calculating constraints instead of using this Positionable's current size.
  		* @returns Number[] If the element needs to be translated, the new [X, Y] position within constraints if possible, giving priority to keeping the top and left edge in the constrain region. Otherwise, false.
  		*/
  var calculateConstrainedPosition: js.UndefOr[
    js.Function4[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* proposedPosition */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* local */ js.UndefOr[scala.Boolean], 
      /* proposedSize */ js.UndefOr[extjsLib.ExtNs.Array], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Gets the x y coordinates to align this element with another element
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @returns Number[] [x, y]
  		*/
  var getAlignToXY: js.UndefOr[
    js.Function3[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[extjsLib.ExtNs.Array], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
  		* @param anchor String The specified anchor position. See alignTo for details on supported anchor positions.
  		* @param local Boolean True to get the local (element top/left-relative) anchor position instead of page coordinates
  		* @param size Object An object containing the size to use for calculating anchor position {width: (target width), height: (target height)} (defaults to the element's current size)
  		* @returns Number[] [x, y] An array containing the element's x and y coordinates
  		*/
  var getAnchorXY: js.UndefOr[
    js.Function3[
      /* anchor */ js.UndefOr[java.lang.String], 
      /* local */ js.UndefOr[scala.Boolean], 
      /* size */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param contentBox Boolean If true a box for the content of the element is returned.
  		* @param local Boolean If true the element's left and top relative to its offsetParent are returned instead of page x/y.
  		* @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  left: &lt;Element's X position (an alias for x)&gt;,  top: &lt;Element's Y position (an alias for y)&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. The result may also be used for setXY
  		*/
  var getBox: js.UndefOr[
    js.Function2[/* contentBox */ js.UndefOr[scala.Boolean], /* local */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
  /** [Method] Returns the X Y vector by which this Positionable s element must be translated to make a best attempt to constrain
  		* @param constrainTo Ext.util.Positionable/HTMLElement/String/Ext.util.Region The Positionable, HTMLElement, element id, or Region into which the element is to be constrained.
  		* @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to produce a vector for instead of using the element's current position
  		* @param proposedSize Number[] A proposed [width, height] size to constrain instead of using the element's current size
  		* @returns Number[]/Boolean If the element needs to be translated, an [X, Y] vector by which this element must be translated. Otherwise, false.
  		*/
  var getConstrainVector: js.UndefOr[
    js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* proposedPosition */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* proposedSize */ js.UndefOr[extjsLib.ExtNs.Array], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the x coordinate of this element reletive to its offsetParent
  		* @returns Number The local x coordinate
  		*/
  var getLocalX: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the x and y coordinates of this element relative to its offsetParent
  		* @returns Number[] The local XY position of the element
  		*/
  var getLocalXY: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the y coordinate of this element reletive to its offsetParent
  		* @returns Number The local y coordinate
  		*/
  var getLocalY: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the offsets of this element from the passed element
  		* @param offsetsTo Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or element id to get get the offsets from.
  		* @returns Number[] The XY page offsets (e.g. [100, -200])
  		*/
  var getOffsetsTo: js.UndefOr[js.Function1[/* offsetsTo */ js.UndefOr[js.Any], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns a region object that defines the area of this element
  		* @returns Ext.util.Region A Region containing "top, left, bottom, right" properties.
  		*/
  var getRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
  /** [Method] Returns the content region of this element
  		* @returns Ext.util.Region A Region containing "top, left, bottom, right" member data.
  		*/
  var getViewRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
  /** [Method] Gets the current X position of the DOM element based on page coordinates
  		* @returns Number The X position of the element
  		*/
  var getX: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Gets the current position of the DOM element based on page coordinates
  		* @returns Number[] The XY position of the element
  		*/
  var getXY: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Gets the current Y position of the DOM element based on page coordinates
  		* @returns Number The Y position of the element
  		*/
  var getY: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Move the element relative to its current position
  		* @param direction String Possible values are:  "l" (or "left") "r" (or "right") "t" (or "top", or "up") "b" (or "bottom", or "down")
  		* @param distance Number How far to move the element in pixels
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		*/
  var move: js.UndefOr[
    js.Function3[
      /* direction */ js.UndefOr[java.lang.String], 
      /* distance */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Remove any anchor to this element
  		* @returns Ext.util.Positionable this
  		*/
  var removeAnchor: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the element s box
  		* @param box Object The box to fill {x, y, width, height}
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setBox: js.UndefOr[
    js.Function2[/* box */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the local x coordinate of this element using CSS style
  		* @param x Number The x coordinate. A value of null sets the left style to 'auto'.
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalX: js.UndefOr[js.Function1[/* x */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Sets the local x and y coordinates of this element using CSS style
  		* @param x Number/Array The x coordinate or an array containing [x, y]. A value of null sets the left style to 'auto'
  		* @param y Number The y coordinate, required if x is not an array. A value of null sets the top style to 'auto'
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalXY: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], this.type]
  ] = js.undefined
  /** [Method] Sets the local y coordinate of this element using CSS style
  		* @param y Number The y coordinate. A value of null sets the top style to 'auto'.
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalY: js.UndefOr[js.Function1[/* y */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Sets the element s position and size to the specified region
  		* @param region Ext.util.Region The region to fill
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setRegion: js.UndefOr[
    js.Function2[/* region */ js.UndefOr[IRegion], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the X position of the DOM element based on page coordinates
  		* @param The Number X position
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setX: js.UndefOr[
    js.Function2[/* The */ js.UndefOr[scala.Double], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Sets the position of the DOM element in page coordinates
  		* @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based)
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setXY: js.UndefOr[
    js.Function2[
      /* pos */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the Y position of the DOM element based on page coordinates
  		* @param The Number Y position
  		* @param animate Boolean/Object True for the default animation, or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setY: js.UndefOr[
    js.Function2[/* The */ js.UndefOr[scala.Double], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Translates the passed page coordinates into left top css values for the element
  		* @param x Number/Array The page x or an array containing [x, y]
  		* @param y Number The page y, required if x is not an array
  		* @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}
  		*/
  var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], _]] = js.undefined
}

object IPositionable {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alignTo: js.Function4[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* animate */ js.UndefOr[js.Any], 
      IPositionable
    ] = null,
    alternateClassName: js.Any = null,
    anchorTo: js.Function6[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* animate */ js.UndefOr[js.Any], 
      /* monitorScroll */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      IPositionable
    ] = null,
    calculateConstrainedPosition: js.Function4[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* proposedPosition */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* local */ js.UndefOr[scala.Boolean], 
      /* proposedSize */ js.UndefOr[extjsLib.ExtNs.Array], 
      extjsLib.ExtNs.Array
    ] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getAlignToXY: js.Function3[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[extjsLib.ExtNs.Array], 
      extjsLib.ExtNs.Array
    ] = null,
    getAnchorXY: js.Function3[
      /* anchor */ js.UndefOr[java.lang.String], 
      /* local */ js.UndefOr[scala.Boolean], 
      /* size */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ] = null,
    getBox: js.Function2[/* contentBox */ js.UndefOr[scala.Boolean], /* local */ js.UndefOr[scala.Boolean], _] = null,
    getConstrainVector: js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* proposedPosition */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* proposedSize */ js.UndefOr[extjsLib.ExtNs.Array], 
      _
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLocalX: js.Function0[scala.Double] = null,
    getLocalXY: js.Function0[extjsLib.ExtNs.Array] = null,
    getLocalY: js.Function0[scala.Double] = null,
    getOffsetsTo: js.Function1[/* offsetsTo */ js.UndefOr[js.Any], extjsLib.ExtNs.Array] = null,
    getRegion: js.Function0[IRegion] = null,
    getViewRegion: js.Function0[IRegion] = null,
    getX: js.Function0[scala.Double] = null,
    getXY: js.Function0[extjsLib.ExtNs.Array] = null,
    getY: js.Function0[scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IPositionable] = null,
    mixins: js.Any = null,
    move: js.Function3[
      /* direction */ js.UndefOr[java.lang.String], 
      /* distance */ js.UndefOr[scala.Double], 
      /* animate */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeAnchor: js.Function0[IPositionable] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    setBox: js.Function2[/* box */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], IPositionable] = null,
    setLocalX: js.Function1[/* x */ js.UndefOr[scala.Double], IPositionable] = null,
    setLocalXY: js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], IPositionable] = null,
    setLocalY: js.Function1[/* y */ js.UndefOr[scala.Double], IPositionable] = null,
    setRegion: js.Function2[/* region */ js.UndefOr[IRegion], /* animate */ js.UndefOr[js.Any], IPositionable] = null,
    setX: js.Function2[/* The */ js.UndefOr[scala.Double], /* animate */ js.UndefOr[js.Any], IPositionable] = null,
    setXY: js.Function2[
      /* pos */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* animate */ js.UndefOr[js.Any], 
      IPositionable
    ] = null,
    setY: js.Function2[/* The */ js.UndefOr[scala.Double], /* animate */ js.UndefOr[js.Any], IPositionable] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    translatePoints: js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], _] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IPositionable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alignTo != null) __obj.updateDynamic("alignTo")(alignTo)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (anchorTo != null) __obj.updateDynamic("anchorTo")(anchorTo)
    if (calculateConstrainedPosition != null) __obj.updateDynamic("calculateConstrainedPosition")(calculateConstrainedPosition)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAlignToXY != null) __obj.updateDynamic("getAlignToXY")(getAlignToXY)
    if (getAnchorXY != null) __obj.updateDynamic("getAnchorXY")(getAnchorXY)
    if (getBox != null) __obj.updateDynamic("getBox")(getBox)
    if (getConstrainVector != null) __obj.updateDynamic("getConstrainVector")(getConstrainVector)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLocalX != null) __obj.updateDynamic("getLocalX")(getLocalX)
    if (getLocalXY != null) __obj.updateDynamic("getLocalXY")(getLocalXY)
    if (getLocalY != null) __obj.updateDynamic("getLocalY")(getLocalY)
    if (getOffsetsTo != null) __obj.updateDynamic("getOffsetsTo")(getOffsetsTo)
    if (getRegion != null) __obj.updateDynamic("getRegion")(getRegion)
    if (getViewRegion != null) __obj.updateDynamic("getViewRegion")(getViewRegion)
    if (getX != null) __obj.updateDynamic("getX")(getX)
    if (getXY != null) __obj.updateDynamic("getXY")(getXY)
    if (getY != null) __obj.updateDynamic("getY")(getY)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (move != null) __obj.updateDynamic("move")(move)
    if (removeAnchor != null) __obj.updateDynamic("removeAnchor")(removeAnchor)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBox != null) __obj.updateDynamic("setBox")(setBox)
    if (setLocalX != null) __obj.updateDynamic("setLocalX")(setLocalX)
    if (setLocalXY != null) __obj.updateDynamic("setLocalXY")(setLocalXY)
    if (setLocalY != null) __obj.updateDynamic("setLocalY")(setLocalY)
    if (setRegion != null) __obj.updateDynamic("setRegion")(setRegion)
    if (setX != null) __obj.updateDynamic("setX")(setX)
    if (setXY != null) __obj.updateDynamic("setXY")(setXY)
    if (setY != null) __obj.updateDynamic("setY")(setY)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(translatePoints)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPositionable]
  }
}

