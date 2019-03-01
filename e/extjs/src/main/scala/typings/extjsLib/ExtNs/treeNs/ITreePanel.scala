package typings
package extjsLib.ExtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreePanel
  extends extjsLib.ExtNs.panelNs.ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_ITreePanel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Collapse all nodes
  		* @param callback Function A function to execute when the collapse finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var collapseAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Collapses a record that is loaded in the tree
  		* @param record Ext.data.Model The record to collapse
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var collapseNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Expand all nodes
  		* @param callback Function A function to execute when the expand finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var expandAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Expands a record that is loaded in the tree
  		* @param record Ext.data.Model The record to expand
  		* @param deep Boolean True to expand nodes all the way down the tree hierarchy.
  		* @param callback Function The function to run after the expand is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var expandNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expand the tree to the path of a particular node
  		* @param path String The path to expand. The path should include a leading separator.
  		* @param field String The field to get the data from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @param callback Function A function to execute when the expand finishes. The callback will be called with (success, lastNode) where success is if the expand was successful and lastNode is the last node that was expanded.
  		* @param scope Object The scope of the callback function
  		*/
  var expandPath: js.UndefOr[
    js.Function5[
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Retrieve an array of checked records
  		* @returns Ext.data.NodeInterface[] An array containing the checked records
  		*/
  var getChecked: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the root node for this tree
  		* @returns Ext.data.NodeInterface
  		*/
  var getRootNode: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.INodeInterface]] = js.undefined
  /** [Config Option] (Boolean) */
  var lines: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Expand the tree to the path of a particular node then select it
  		* @param path String The path to select. The path should include a leading separator.
  		* @param field String The field to get the data from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @param callback Function A function to execute when the select finishes. The callback will be called with (bSuccess, oLastNode) where bSuccess is if the select was successful and oLastNode is the last node that was expanded.
  		* @param scope Object The scope of the callback function
  		*/
  var selectPath: js.UndefOr[
    js.Function5[
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets root node of this tree
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object
  		* @returns Ext.data.NodeInterface The new root
  		*/
  var setRootNode: js.UndefOr[
    js.Function1[/* root */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.INodeInterface]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var singleExpand: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.TreeStore) */
  @JSName("store")
  var store_ITreePanel: js.UndefOr[extjsLib.ExtNs.dataNs.ITreeStore] = js.undefined
  /** [Config Option] (Boolean) */
  var useArrows: js.UndefOr[scala.Boolean] = js.undefined
}

object ITreePanel {
  @scala.inline
  def apply(
    ITable: extjsLib.ExtNs.panelNs.ITable = null,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    collapseAll: js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    collapseNode: js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    deferRowRender: js.UndefOr[scala.Boolean] = js.undefined,
    displayField: java.lang.String = null,
    expandAll: js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    expandNode: js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    expandPath: js.Function5[
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    folderSort: js.UndefOr[scala.Boolean] = js.undefined,
    getChecked: js.Function0[extjsLib.ExtNs.Array] = null,
    getRootNode: js.Function0[extjsLib.ExtNs.dataNs.INodeInterface] = null,
    hideHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    lines: js.UndefOr[scala.Boolean] = js.undefined,
    root: js.Any = null,
    rootVisible: js.UndefOr[scala.Boolean] = js.undefined,
    rowLines: js.UndefOr[scala.Boolean] = js.undefined,
    selType: java.lang.String = null,
    selectPath: js.Function5[
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    setRootNode: js.Function1[/* root */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.INodeInterface] = null,
    singleExpand: js.UndefOr[scala.Boolean] = js.undefined,
    store: extjsLib.ExtNs.dataNs.ITreeStore = null,
    useArrows: js.UndefOr[scala.Boolean] = js.undefined,
    viewType: java.lang.String = null
  ): ITreePanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITable)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (collapseAll != null) __obj.updateDynamic("collapseAll")(collapseAll)
    if (collapseNode != null) __obj.updateDynamic("collapseNode")(collapseNode)
    if (!js.isUndefined(deferRowRender)) __obj.updateDynamic("deferRowRender")(deferRowRender)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (expandAll != null) __obj.updateDynamic("expandAll")(expandAll)
    if (expandNode != null) __obj.updateDynamic("expandNode")(expandNode)
    if (expandPath != null) __obj.updateDynamic("expandPath")(expandPath)
    if (!js.isUndefined(folderSort)) __obj.updateDynamic("folderSort")(folderSort)
    if (getChecked != null) __obj.updateDynamic("getChecked")(getChecked)
    if (getRootNode != null) __obj.updateDynamic("getRootNode")(getRootNode)
    if (!js.isUndefined(hideHeaders)) __obj.updateDynamic("hideHeaders")(hideHeaders)
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(rootVisible)) __obj.updateDynamic("rootVisible")(rootVisible)
    if (!js.isUndefined(rowLines)) __obj.updateDynamic("rowLines")(rowLines)
    if (selType != null) __obj.updateDynamic("selType")(selType)
    if (selectPath != null) __obj.updateDynamic("selectPath")(selectPath)
    if (setRootNode != null) __obj.updateDynamic("setRootNode")(setRootNode)
    if (!js.isUndefined(singleExpand)) __obj.updateDynamic("singleExpand")(singleExpand)
    if (store != null) __obj.updateDynamic("store")(store)
    if (!js.isUndefined(useArrows)) __obj.updateDynamic("useArrows")(useArrows)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType)
    __obj.asInstanceOf[ITreePanel]
  }
}

