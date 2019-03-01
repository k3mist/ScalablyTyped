package typings
package extjsLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.chartNs.IHighlight because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined highlight, highlightCfg, highlightItem, unHighlightItem- extjsLib.ExtNs.chartNs.ILabel because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined label, onCreateLabel, onPlaceLabel */ trait ISeries
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Iterate over each of the records for this series
  		* @param fn Function The function to execute for each record.
  		* @param scope Object Scope for the fn.
  		*/
  var eachRecord: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] For a given x y point relative to the Surface find a corresponding item from this series if any
  		* @param x Number
  		* @param y Number
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain the following:
  		*/
  var getItemForPoint: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], _]
  ] = js.undefined
  /** [Method] Returns a string with the color to be used for the series legend item
  		* @param index Object
  		*/
  var getLegendColor: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Return the number of records being displayed in this series  */
  var getRecordCount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Hides all the elements in the series  */
  var hideAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.undefined
  /** [Method] Highlight the given series item
  		* @param item Object Info about the item; same format as returned by #getItemForPoint.
  		*/
  var highlightItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Determines whether the series item at the given index has been excluded i e
  		* @param index Object
  		*/
  var isExcluded: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Method] Called each time a new label is created
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element created (i.e the first created label, second created label, etc).
  		* @param display String The label.display type. May be false if the label is hidden
  		* @returns Ext.draw.Sprite The created sprite that will draw the label.
  		*/
  var onCreateLabel: js.UndefOr[
    js.Function4[
      /* storeItem */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[scala.Double], 
      /* display */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.drawNs.ISprite
    ]
  ] = js.undefined
  /** [Method] Called for updating the position of the label
  		* @param label Ext.draw.Sprite The sprite that draws the label.
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
  		* @param display String The label.display type. May be false if the label is hidden
  		* @param animate Boolean A boolean value to set or unset animations for the labels.
  		* @param index Number The series index.
  		*/
  var onPlaceLabel: js.UndefOr[
    js.Function7[
      /* label */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], 
      /* storeItem */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[scala.Double], 
      /* display */ js.UndefOr[java.lang.String], 
      /* animate */ js.UndefOr[scala.Boolean], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Method] Changes the value of the title for the series
  		* @param index Number
  		* @param title String
  		*/
  var setTitle: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* title */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Array) */
  var shadowAttributes: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Shows all the elements in the series  */
  var showAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var tips: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ISeries {
  @scala.inline
  def apply(
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addManagedListener: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    eachRecord: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getItemForPoint: js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], _] = null,
    getLegendColor: js.Function1[/* index */ js.UndefOr[js.Any], scala.Unit] = null,
    getRecordCount: js.Function0[scala.Unit] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    hideAll: js.Function0[scala.Unit] = null,
    highlight: js.Any = null,
    highlightCfg: js.Any = null,
    highlightItem: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ISeries] = null,
    isExcluded: js.Function1[/* index */ js.UndefOr[js.Any], scala.Unit] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    label: js.Any = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    mun: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    onCreateLabel: js.Function4[
      /* storeItem */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[scala.Double], 
      /* display */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.drawNs.ISprite
    ] = null,
    onPlaceLabel: js.Function7[
      /* label */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], 
      /* storeItem */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* item */ js.UndefOr[js.Any], 
      /* i */ js.UndefOr[scala.Double], 
      /* display */ js.UndefOr[java.lang.String], 
      /* animate */ js.UndefOr[scala.Boolean], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    removeListener: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    renderer: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    setTitle: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* title */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    shadowAttributes: extjsLib.ExtNs.Array = null,
    showAll: js.Function0[scala.Unit] = null,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    tips: js.Any = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unHighlightItem: js.Function0[scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null
  ): ISeries = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (eachRecord != null) __obj.updateDynamic("eachRecord")(eachRecord)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(getItemForPoint)
    if (getLegendColor != null) __obj.updateDynamic("getLegendColor")(getLegendColor)
    if (getRecordCount != null) __obj.updateDynamic("getRecordCount")(getRecordCount)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hideAll != null) __obj.updateDynamic("hideAll")(hideAll)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg)
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(highlightItem)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isExcluded != null) __obj.updateDynamic("isExcluded")(isExcluded)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (label != null) __obj.updateDynamic("label")(label)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onCreateLabel != null) __obj.updateDynamic("onCreateLabel")(onCreateLabel)
    if (onPlaceLabel != null) __obj.updateDynamic("onPlaceLabel")(onPlaceLabel)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (shadowAttributes != null) __obj.updateDynamic("shadowAttributes")(shadowAttributes)
    if (showAll != null) __obj.updateDynamic("showAll")(showAll)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (tips != null) __obj.updateDynamic("tips")(tips)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unHighlightItem != null) __obj.updateDynamic("unHighlightItem")(unHighlightItem)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISeries]
  }
}

