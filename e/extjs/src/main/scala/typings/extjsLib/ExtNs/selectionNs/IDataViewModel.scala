package typings
package extjsLib.ExtNs.selectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataViewModel extends IModel {
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[scala.Boolean] = js.undefined
}

object IDataViewModel {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: extjsLib.ExtNs.Array = null,
    allowDeselect: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bindStore: (/* store */ js.UndefOr[js.Any], /* initial */ js.UndefOr[js.Any]) => scala.Unit = null,
    bindStoreListeners: /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore] => scala.Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => scala.Unit = null,
    clearManagedListeners: () => scala.Unit = null,
    config: js.Any = null,
    deselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    deselectAll: /* suppressEvent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    deselectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any]) => scala.Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    enableKeyNav: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[extjsLib.ExtNs.Array]) => scala.Boolean = null,
    getCount: () => scala.Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLastSelected: () => IDataViewModel = null,
    getSelection: () => extjsLib.ExtNs.Array = null,
    getSelectionMode: () => java.lang.String = null,
    getStore: () => extjsLib.ExtNs.dataNs.IAbstractStore = null,
    getStoreListeners: () => _ = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hasListeners: js.Any = null,
    hasSelection: () => scala.Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDataViewModel = null,
    isFocused: /* record */ js.UndefOr[IDataViewModel] => scala.Unit = null,
    isLocked: () => scala.Boolean = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isRangeSelected: (/* from */ js.UndefOr[js.Any], /* to */ js.UndefOr[js.Any]) => scala.Boolean = null,
    isSelected: /* record */ js.UndefOr[js.Any] => scala.Boolean = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mode: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    onBindStore: (/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], /* initial */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    onUnbindStore: (/* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore], /* initial */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    pruneRemoved: js.UndefOr[scala.Boolean] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[extjsLib.ExtNs.Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: /* repeated */ js.Any => scala.Unit = null,
    resumeEvents: () => scala.Unit = null,
    select: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[scala.Boolean], /* suppressEvent */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    selectAll: /* suppressEvent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    selectRange: (/* startRow */ js.UndefOr[js.Any], /* endRow */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    selected: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    self: extjsLib.ExtNs.IClass = null,
    setLastFocused: /* record */ js.UndefOr[IDataViewModel] => scala.Unit = null,
    setLocked: /* locked */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setSelectionMode: /* selMode */ js.UndefOr[java.lang.String] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => scala.Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    toggleOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    unbindStoreListeners: /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IAbstractStore] => scala.Unit = null,
    uses: extjsLib.ExtNs.Array = null
  ): IDataViewModel = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction2(bindStore))
    if (bindStoreListeners != null) __obj.updateDynamic("bindStoreListeners")(js.Any.fromFunction1(bindStoreListeners))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2(deselect))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1(deselectAll))
    if (deselectRange != null) __obj.updateDynamic("deselectRange")(js.Any.fromFunction2(deselectRange))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enableKeyNav)) __obj.updateDynamic("enableKeyNav")(enableKeyNav)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLastSelected != null) __obj.updateDynamic("getLastSelected")(js.Any.fromFunction0(getLastSelected))
    if (getSelection != null) __obj.updateDynamic("getSelection")(js.Any.fromFunction0(getSelection))
    if (getSelectionMode != null) __obj.updateDynamic("getSelectionMode")(js.Any.fromFunction0(getSelectionMode))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(js.Any.fromFunction0(getStoreListeners))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasSelection != null) __obj.updateDynamic("hasSelection")(js.Any.fromFunction0(hasSelection))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isFocused != null) __obj.updateDynamic("isFocused")(js.Any.fromFunction1(isFocused))
    if (isLocked != null) __obj.updateDynamic("isLocked")(js.Any.fromFunction0(isLocked))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (isRangeSelected != null) __obj.updateDynamic("isRangeSelected")(js.Any.fromFunction2(isRangeSelected))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1(isSelected))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(js.Any.fromFunction2(onBindStore))
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(js.Any.fromFunction2(onUnbindStore))
    if (!js.isUndefined(pruneRemoved)) __obj.updateDynamic("pruneRemoved")(pruneRemoved)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3(select))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1(selectAll))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3(selectRange))
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setLastFocused != null) __obj.updateDynamic("setLastFocused")(js.Any.fromFunction1(setLastFocused))
    if (setLocked != null) __obj.updateDynamic("setLocked")(js.Any.fromFunction1(setLocked))
    if (setSelectionMode != null) __obj.updateDynamic("setSelectionMode")(js.Any.fromFunction1(setSelectionMode))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (!js.isUndefined(toggleOnClick)) __obj.updateDynamic("toggleOnClick")(toggleOnClick)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (unbindStoreListeners != null) __obj.updateDynamic("unbindStoreListeners")(js.Any.fromFunction1(unbindStoreListeners))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDataViewModel]
  }
}

