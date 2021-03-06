package typings
package senchaUnderscoreTouchLib.ExtNs.eventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent
  extends senchaUnderscoreTouchLib.ExtNs.IBase
     with IDom {
  /** [Property] (Number) */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var direction: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Stop the event preventDefault and stopPropagation
  		* @returns Ext.event.Event this
  		*/
  var stopEvent: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Cancels bubbling of the event
  		* @returns Ext.event.Event this
  		*/
  var stopPropagation: js.UndefOr[js.Function0[this.type]] = js.undefined
}

object IEvent {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    angle: scala.Int | scala.Double = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    direction: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getPageX: () => scala.Double = null,
    getPageY: () => scala.Double = null,
    getTarget: (/* selector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[scala.Boolean]) => stdLib.HTMLElement = null,
    getTime: () => _ = null,
    getXY: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    platformConfig: js.Any = null,
    preventDefault: () => scala.Unit = null,
    rotation: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    stopEvent: () => IEvent = null,
    stopPropagation: () => IEvent = null,
    target: stdLib.HTMLElement = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IEvent = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getPageX != null) __obj.updateDynamic("getPageX")(js.Any.fromFunction0(getPageX))
    if (getPageY != null) __obj.updateDynamic("getPageY")(js.Any.fromFunction0(getPageY))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction3(getTarget))
    if (getTime != null) __obj.updateDynamic("getTime")(js.Any.fromFunction0(getTime))
    if (getXY != null) __obj.updateDynamic("getXY")(js.Any.fromFunction0(getXY))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stopEvent != null) __obj.updateDynamic("stopEvent")(js.Any.fromFunction0(stopEvent))
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    if (target != null) __obj.updateDynamic("target")(target)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IEvent]
  }
}

