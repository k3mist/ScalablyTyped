package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShadow extends IBase {
  /** [Method] Hides this shadow */
  var hide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns true if the shadow is visible else false */
  var isVisible: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Direct alignment when values are already available
  		* @param left Number The target element left position
  		* @param top Number The target element top position
  		* @param width Number The target element width
  		* @param height Number The target element height
  		*/
  var realign: js.UndefOr[
    js.Function4[
      /* left */ js.UndefOr[scala.Double], 
      /* top */ js.UndefOr[scala.Double], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the opacity of the shadow
  		* @param opacity Number The opacity
  		*/
  var setOpacity: js.UndefOr[js.Function1[/* opacity */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Adjust the z index of this shadow
  		* @param zindex Number The new z-index
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Displays the shadow under the target element
  		* @param targetEl String/HTMLElement/Ext.Element The id or element under which the shadow should display
  		*/
  var show: js.UndefOr[js.Function1[/* targetEl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IShadow {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    hide: js.Function0[scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IShadow] = null,
    isVisible: js.Function0[scala.Unit] = null,
    mixins: js.Any = null,
    mode: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    realign: js.Function4[
      /* left */ js.UndefOr[scala.Double], 
      /* top */ js.UndefOr[scala.Double], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    requires: Array = null,
    self: IClass = null,
    setOpacity: js.Function1[/* opacity */ js.UndefOr[scala.Double], scala.Unit] = null,
    setZIndex: js.Function1[/* zindex */ js.UndefOr[scala.Double], scala.Unit] = null,
    show: js.Function1[/* targetEl */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IShadow = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isVisible != null) __obj.updateDynamic("isVisible")(isVisible)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (realign != null) __obj.updateDynamic("realign")(realign)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setOpacity != null) __obj.updateDynamic("setOpacity")(setOpacity)
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(setZIndex)
    if (show != null) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IShadow]
  }
}

