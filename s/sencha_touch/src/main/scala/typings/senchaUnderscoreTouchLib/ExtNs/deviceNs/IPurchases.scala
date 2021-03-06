package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPurchases
  extends senchaUnderscoreTouchLib.ExtNs.deviceNs.purchasesNs.ISencha

object IPurchases {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    canMakePayments: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getCompletedPurchases: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getProducts: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    getPurchases: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IPurchases = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (canMakePayments != null) __obj.updateDynamic("canMakePayments")(js.Any.fromFunction1(canMakePayments))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCompletedPurchases != null) __obj.updateDynamic("getCompletedPurchases")(js.Any.fromFunction1(getCompletedPurchases))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProducts != null) __obj.updateDynamic("getProducts")(js.Any.fromFunction1(getProducts))
    if (getPurchases != null) __obj.updateDynamic("getPurchases")(js.Any.fromFunction1(getPurchases))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPurchases]
  }
}

