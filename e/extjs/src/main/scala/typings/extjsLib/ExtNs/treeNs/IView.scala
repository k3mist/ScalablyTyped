package typings
package extjsLib.ExtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView
  extends extjsLib.ExtNs.viewNs.ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IView: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Collapses a record that is loaded in the view
  		* @param record Ext.data.Model The record to collapse
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var collapse: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expands a record that is loaded in the view
  		* @param record Ext.data.Model The record to expand
  		* @param deep Boolean True to expand nodes all the way down the tree hierarchy.
  		* @param callback Function The function to run after the expand is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var expand: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  @JSName("getStoreListeners")
  var getStoreListeners_IView: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the base TreeStore from the bound TreePanel  */
  var getTreeStore: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isTreeView: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("loadMask")
  var loadMask_IView: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance  */
  @JSName("onBindStore")
  var onBindStore_IView: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance  */
  @JSName("onUnbindStore")
  var onUnbindStore_IView: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Toggles a record between expanded and collapsed
  		* @param record Ext.data.Model
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the expand/collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var toggle: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

object IView {
  @scala.inline
  def apply(
    ITable: extjsLib.ExtNs.viewNs.ITable = null,
    afterComponentLayout: js.Function0[scala.Unit] = null,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    blockRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    collapse: js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    deferInitialRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    expand: js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    getStoreListeners: js.Function0[_] = null,
    getTreeStore: js.Function0[scala.Unit] = null,
    initComponent: js.Function0[scala.Unit] = null,
    isTreeView: js.UndefOr[scala.Boolean] = js.undefined,
    loadMask: js.UndefOr[scala.Boolean] = js.undefined,
    loadingCls: java.lang.String = null,
    onBindStore: js.Function0[scala.Unit] = null,
    onUnbindStore: js.Function0[scala.Unit] = null,
    rootVisible: js.UndefOr[scala.Boolean] = js.undefined,
    stripeRows: js.UndefOr[scala.Boolean] = js.undefined,
    toggle: js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null
  ): IView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITable)
    if (afterComponentLayout != null) __obj.updateDynamic("afterComponentLayout")(afterComponentLayout)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(blockRefresh)) __obj.updateDynamic("blockRefresh")(blockRefresh)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (!js.isUndefined(deferInitialRefresh)) __obj.updateDynamic("deferInitialRefresh")(deferInitialRefresh)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (getStoreListeners != null) __obj.updateDynamic("getStoreListeners")(getStoreListeners)
    if (getTreeStore != null) __obj.updateDynamic("getTreeStore")(getTreeStore)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (!js.isUndefined(isTreeView)) __obj.updateDynamic("isTreeView")(isTreeView)
    if (!js.isUndefined(loadMask)) __obj.updateDynamic("loadMask")(loadMask)
    if (loadingCls != null) __obj.updateDynamic("loadingCls")(loadingCls)
    if (onBindStore != null) __obj.updateDynamic("onBindStore")(onBindStore)
    if (onUnbindStore != null) __obj.updateDynamic("onUnbindStore")(onUnbindStore)
    if (!js.isUndefined(rootVisible)) __obj.updateDynamic("rootVisible")(rootVisible)
    if (!js.isUndefined(stripeRows)) __obj.updateDynamic("stripeRows")(stripeRows)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[IView]
  }
}

