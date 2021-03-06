package typings
package senchaUnderscoreTouchLib.ExtNs.uxNs.deviceNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the value of accountID
  		* @returns Object
  		*/
  var getAccountID: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Registers yur Google Analytics account
  		* @param accountID String Your Google Analytics account ID
  		*/
  var registerAccount: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of accountID
  		* @param accountID Object The new value.
  		*/
  var setAccountID: js.UndefOr[js.Function1[/* accountID */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Track an event in your application
  		* @param config Object
  		*/
  var trackEvent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Track an pageview in your application
  		* @param config String The page you want to track (must start with a slash).
  		*/
  var trackPageview: js.UndefOr[js.Function1[/* config */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getAccountID: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    registerAccount: /* accountID */ js.UndefOr[java.lang.String] => scala.Unit = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAccountID: /* accountID */ js.UndefOr[js.Any] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    trackEvent: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    trackPageview: /* config */ js.UndefOr[java.lang.String] => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAccountID != null) __obj.updateDynamic("getAccountID")(js.Any.fromFunction0(getAccountID))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (registerAccount != null) __obj.updateDynamic("registerAccount")(js.Any.fromFunction1(registerAccount))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAccountID != null) __obj.updateDynamic("setAccountID")(js.Any.fromFunction1(setAccountID))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (trackEvent != null) __obj.updateDynamic("trackEvent")(js.Any.fromFunction1(trackEvent))
    if (trackPageview != null) __obj.updateDynamic("trackPageview")(js.Any.fromFunction1(trackPageview))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstract]
  }
}

