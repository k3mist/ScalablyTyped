package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISprite
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Number) */
  var A: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Array) */
  var An: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Property] (Object) */
  var attr: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var fillStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine
  		* @param isWithoutTransform Boolean Whether to calculate the bounding box with the current transforms or not.
  		*/
  var getBBox: js.UndefOr[js.Function1[/* isWithoutTransform */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Subclass can rewrite this function to gain better performance
  		* @param isWithoutTransform Boolean
  		* @returns Array
  		*/
  var getBBoxCenter: js.UndefOr[
    js.Function1[
      /* isWithoutTransform */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns the value of parent
  		* @returns Object
  		*/
  var getParent: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var globalAlpha: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Hide the sprite
  		* @returns Ext.draw.sprite.Sprite this
  		*/
  var hide: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var lineCap: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var lineJoin: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var miterLimit: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Called before rendering  */
  var preRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_ISprite: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Render method
  		* @param surface Ext.draw.Surface The surface.
  		* @param ctx Object A context object compatible with CanvasRenderingContext2D.
  		* @param region Array The clip region (or called dirty rect) of the current rendering. Not be confused with surface.getRegion().
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  var render: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var rotationCenterX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var rotationCenterY: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var rotationRads: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingCenterX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingCenterY: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var scalingY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Set attributes of the sprite
  		* @param changes Object The content of the change.
  		* @param bypassNormalization Boolean true to avoid normalization of the given changes.
  		* @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
  		*/
  var setAttributes: js.UndefOr[
    js.Function3[
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[scala.Boolean], 
      /* avoidCopy */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Set attributes of the sprite assuming the names and values have already been normalized
  		* @param changes Object The content of the change.
  		* @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
  		*/
  var setAttributesBypassingNormalization: js.UndefOr[
    js.Function2[
      /* changes */ js.UndefOr[js.Any], 
      /* avoidCopy */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of parent
  		* @param parent Object The new value.
  		*/
  var setParent: js.UndefOr[js.Function1[/* parent */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var shadowBlur: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var shadowColor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Show the sprite
  		* @returns Ext.draw.sprite.Sprite this
  		*/
  var show: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Number) */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var strokeStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var transformFillStroke: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var translationX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var translationY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Subclass will fill the plain object with x y width height information of the plain bounding box of this sprite
  		* @param plain Object Target object.
  		*/
  var updatePlainBBox: js.UndefOr[js.Function1[/* plain */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
  		* @param transform Object Target object.
  		* @param plain Object Auxiliary object providing information of plain object.
  		*/
  var updateTransformedBBox: js.UndefOr[
    js.Function2[/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Applies sprite s attributes to the given context
  		* @param ctx Object Context to apply sprite's attributes to.
  		* @param region Array The region of the context to be affected by gradients.
  		*/
  var useAttributes: js.UndefOr[
    js.Function2[
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object ISprite {
  @scala.inline
  def apply(
    A: scala.Int | scala.Double = null,
    An: senchaUnderscoreTouchLib.ExtNs.Array = null,
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addManagedListener: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    attr: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    fillStyle: java.lang.String = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    getBBox: js.Function1[/* isWithoutTransform */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    getBBoxCenter: js.Function1[
      /* isWithoutTransform */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    getBubbleEvents: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getListeners: js.Function0[_] = null,
    getParent: js.Function0[_] = null,
    globalAlpha: scala.Int | scala.Double = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hide: js.Function0[ISprite] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    lineCap: java.lang.String = null,
    lineJoin: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    listeners: js.Any = null,
    miterLimit: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    mon: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mun: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    onAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    platformConfig: js.Any = null,
    preRender: js.Function0[scala.Unit] = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    render: js.Function3[
      /* surface */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      _
    ] = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    rotationCenterX: scala.Int | scala.Double = null,
    rotationCenterY: scala.Int | scala.Double = null,
    rotationRads: scala.Int | scala.Double = null,
    scalingCenterX: scala.Int | scala.Double = null,
    scalingCenterY: scala.Int | scala.Double = null,
    scalingX: scala.Int | scala.Double = null,
    scalingY: scala.Int | scala.Double = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAttributes: js.Function3[
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[scala.Boolean], 
      /* avoidCopy */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    setAttributesBypassingNormalization: js.Function2[
      /* changes */ js.UndefOr[js.Any], 
      /* avoidCopy */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setParent: js.Function1[/* parent */ js.UndefOr[js.Any], scala.Unit] = null,
    shadowBlur: scala.Int | scala.Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: scala.Int | scala.Double = null,
    shadowOffsetY: scala.Int | scala.Double = null,
    show: js.Function0[ISprite] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeStyle: java.lang.String = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    transformFillStroke: js.UndefOr[scala.Boolean] = js.undefined,
    translationX: scala.Int | scala.Double = null,
    translationY: scala.Int | scala.Double = null,
    un: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    unAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    updatePlainBBox: js.Function1[/* plain */ js.UndefOr[js.Any], scala.Unit] = null,
    updateTransformedBBox: js.Function2[/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any], scala.Unit] = null,
    useAttributes: js.Function2[
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
    ] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    zIndex: scala.Int | scala.Double = null
  ): ISprite = {
    val __obj = js.Dynamic.literal()
    if (A != null) __obj.updateDynamic("A")(A.asInstanceOf[js.Any])
    if (An != null) __obj.updateDynamic("An")(An)
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (attr != null) __obj.updateDynamic("attr")(attr)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getBBox != null) __obj.updateDynamic("getBBox")(getBBox)
    if (getBBoxCenter != null) __obj.updateDynamic("getBBoxCenter")(getBBoxCenter)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getParent != null) __obj.updateDynamic("getParent")(getParent)
    if (globalAlpha != null) __obj.updateDynamic("globalAlpha")(globalAlpha.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (preRender != null) __obj.updateDynamic("preRender")(preRender)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (render != null) __obj.updateDynamic("render")(render)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (rotationCenterX != null) __obj.updateDynamic("rotationCenterX")(rotationCenterX.asInstanceOf[js.Any])
    if (rotationCenterY != null) __obj.updateDynamic("rotationCenterY")(rotationCenterY.asInstanceOf[js.Any])
    if (rotationRads != null) __obj.updateDynamic("rotationRads")(rotationRads.asInstanceOf[js.Any])
    if (scalingCenterX != null) __obj.updateDynamic("scalingCenterX")(scalingCenterX.asInstanceOf[js.Any])
    if (scalingCenterY != null) __obj.updateDynamic("scalingCenterY")(scalingCenterY.asInstanceOf[js.Any])
    if (scalingX != null) __obj.updateDynamic("scalingX")(scalingX.asInstanceOf[js.Any])
    if (scalingY != null) __obj.updateDynamic("scalingY")(scalingY.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(setAttributes)
    if (setAttributesBypassingNormalization != null) __obj.updateDynamic("setAttributesBypassingNormalization")(setAttributesBypassingNormalization)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setParent != null) __obj.updateDynamic("setParent")(setParent)
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (!js.isUndefined(transformFillStroke)) __obj.updateDynamic("transformFillStroke")(transformFillStroke)
    if (translationX != null) __obj.updateDynamic("translationX")(translationX.asInstanceOf[js.Any])
    if (translationY != null) __obj.updateDynamic("translationY")(translationY.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (updatePlainBBox != null) __obj.updateDynamic("updatePlainBBox")(updatePlainBBox)
    if (updateTransformedBBox != null) __obj.updateDynamic("updateTransformedBBox")(updateTransformedBBox)
    if (useAttributes != null) __obj.updateDynamic("useAttributes")(useAttributes)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISprite]
  }
}

