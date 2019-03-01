package typings
package extjsLib.ExtNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITable extends IView {
  /** [Method] Adds a CSS Class to a specific row
  		* @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
  		* @param cls String
  		*/
  var addRowCls: js.UndefOr[
    js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] Sizes the passed header to fit the max content width
  		* @param header Ext.grid.column.Column/Number The header (or index of header) to auto size.
  		*/
  var autoSizeColumn: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
  		* @param records Object
  		* @param startIndex Object
  		* @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
  		*/
  @JSName("collectData")
  var collectData_ITable: js.UndefOr[
    js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enableTextSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Expands a particular header to fit the max content width
  		* @param header Object
  		*/
  var expandToFit: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var firstCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Focuses a particular row and brings it into view
  		* @param row HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the
  		* @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds). record associated with the node.
  		*/
  var focusRow: js.UndefOr[
    js.Function2[/* row */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Try to focus this component
  		* @param selectText Object
  		* @param delay Object
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_ITable: js.UndefOr[
    js.Function2[
      /* selectText */ js.UndefOr[js.Any], 
      /* delay */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.IComponent
    ]
  ] = js.undefined
  /** [Method] Returns a CSS selector which selects the outermost element s in this view  */
  var getBodySelector: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns a CSS selector which selects a particular column if the desired header is passed or a general cell selector
  		* @param header Ext.grid.column.Column The column for which to return the selector. If omitted, the general cell selector which matches ant cell will be returned.
  		*/
  var getCellSelector: js.UndefOr[
    js.Function1[/* header */ js.UndefOr[extjsLib.ExtNs.gridNs.columnNs.IColumn], scala.Unit]
  ] = js.undefined
  /** [Method] Returns a CSS selector which selects the element s which define the width of a column
  		* @param header Object
  		*/
  var getColumnSizerSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns a CSS selector which selects a row which contains cells  */
  var getDataRowSelector: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Get a reference to a feature
  		* @param id String The id of the feature
  		* @returns Ext.grid.feature.Feature The feature. Undefined if not found
  		*/
  var getFeature: js.UndefOr[
    js.Function1[/* id */ js.UndefOr[java.lang.String], extjsLib.ExtNs.gridNs.featureNs.IFeature]
  ] = js.undefined
  /** [Method] Returns a CSS selector which selects items of the view rendered by the rowTpl */
  var getItemSelector: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns a CSS selector which selects the element which contains record nodes  */
  var getNodeContainerSelector: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the node given the passed Record or index or node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model The node or record
  		* @param dataRow Boolean true to return the data row (not the top level row if wrapped), false to return the top level row.
  		* @returns HTMLElement The node or null if it wasn't found
  		*/
  @JSName("getNode")
  var getNode_ITable: js.UndefOr[
    js.Function2[
      /* nodeInfo */ js.UndefOr[js.Any], 
      /* dataRow */ js.UndefOr[scala.Boolean], 
      stdLib.HTMLElement
    ]
  ] = js.undefined
  /** [Method] Gets the current XY position of the component s underlying element
  		* @param record Object
  		* @param header Object
  		* @returns Number[] The XY position of the element (e.g., [100, 200])
  		*/
  @JSName("getPosition")
  var getPosition_ITable: js.UndefOr[
    js.Function2[
      /* record */ js.UndefOr[js.Any], 
      /* header */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Override this function to apply custom CSS classes to rows during rendering
  		* @param record Ext.data.Model The record corresponding to the current row.
  		* @param index Number The row index.
  		* @param rowParams Object DEPRECATED. For row body use the getAdditionalData method of the rowbody feature.
  		* @param store Ext.data.Store The store this grid is bound to
  		* @returns String a CSS class name to add to the row.
  		*/
  var getRowClass: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* index */ js.UndefOr[scala.Double], 
      /* rowParams */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var lastCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var markDirty: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Removes a CSS Class from a specific row
  		* @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
  		* @param cls String
  		*/
  var removeRowCls: js.UndefOr[
    js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var stripeRows: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Navigates from the passed record by the passed increment which may be ve or ve Skips hidden records
  		* @param startRec Ext.data.Model The Record to start from.
  		* @param distance Number The distance to move from the record. May be +ve or -ve.
  		*/
  var walkRecs: js.UndefOr[
    js.Function2[
      /* startRec */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* distance */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Increments the passed row index by the passed increment which may be ve or ve Skips hidden rows
  		* @param startRow Number The zero-based row index to start from.
  		* @param distance Number The distance to move the row by. May be +ve or -ve.
  		*/
  var walkRows: js.UndefOr[
    js.Function2[
      /* startRow */ js.UndefOr[scala.Double], 
      /* distance */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
}

object ITable {
  @scala.inline
  def apply(
    IView: IView = null,
    addRowCls: js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    autoSizeColumn: js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit] = null,
    baseCls: java.lang.String = null,
    beforeDestroy: js.Function0[scala.Unit] = null,
    collectData: js.Function2[
      /* records */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ] = null,
    componentLayout: js.Any = null,
    enableTextSelection: js.UndefOr[scala.Boolean] = js.undefined,
    expandToFit: js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit] = null,
    firstCls: java.lang.String = null,
    focus: js.Function2[
      /* selectText */ js.UndefOr[js.Any], 
      /* delay */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.IComponent
    ] = null,
    focusRow: js.Function2[/* row */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], scala.Unit] = null,
    getBodySelector: js.Function0[scala.Unit] = null,
    getCellSelector: js.Function1[/* header */ js.UndefOr[extjsLib.ExtNs.gridNs.columnNs.IColumn], scala.Unit] = null,
    getColumnSizerSelector: js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit] = null,
    getDataRowSelector: js.Function0[scala.Unit] = null,
    getFeature: js.Function1[/* id */ js.UndefOr[java.lang.String], extjsLib.ExtNs.gridNs.featureNs.IFeature] = null,
    getItemSelector: js.Function0[scala.Unit] = null,
    getNode: js.Function2[
      /* nodeInfo */ js.UndefOr[js.Any], 
      /* dataRow */ js.UndefOr[scala.Boolean], 
      stdLib.HTMLElement
    ] = null,
    getNodeContainerSelector: js.Function0[scala.Unit] = null,
    getPosition: js.Function2[
      /* record */ js.UndefOr[js.Any], 
      /* header */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ] = null,
    getRecord: js.Function1[/* node */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.IModel] = null,
    getRowClass: js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* index */ js.UndefOr[scala.Double], 
      /* rowParams */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], 
      java.lang.String
    ] = null,
    indexOf: js.Function1[/* node */ js.UndefOr[js.Any], scala.Double] = null,
    initComponent: js.Function0[scala.Unit] = null,
    itemSelector: java.lang.String = null,
    lastCls: java.lang.String = null,
    markDirty: js.UndefOr[scala.Boolean] = js.undefined,
    onDestroy: js.Function0[scala.Unit] = null,
    overItemCls: java.lang.String = null,
    refresh: js.Function0[scala.Unit] = null,
    removeRowCls: js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    selectedItemCls: java.lang.String = null,
    stripeRows: js.UndefOr[scala.Boolean] = js.undefined,
    trackOver: js.UndefOr[scala.Boolean] = js.undefined,
    walkRecs: js.Function2[
      /* startRec */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* distance */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    walkRows: js.Function2[
      /* startRow */ js.UndefOr[scala.Double], 
      /* distance */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null
  ): ITable = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IView)
    if (addRowCls != null) __obj.updateDynamic("addRowCls")(addRowCls)
    if (autoSizeColumn != null) __obj.updateDynamic("autoSizeColumn")(autoSizeColumn)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (collectData != null) __obj.updateDynamic("collectData")(collectData)
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout)
    if (!js.isUndefined(enableTextSelection)) __obj.updateDynamic("enableTextSelection")(enableTextSelection)
    if (expandToFit != null) __obj.updateDynamic("expandToFit")(expandToFit)
    if (firstCls != null) __obj.updateDynamic("firstCls")(firstCls)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (focusRow != null) __obj.updateDynamic("focusRow")(focusRow)
    if (getBodySelector != null) __obj.updateDynamic("getBodySelector")(getBodySelector)
    if (getCellSelector != null) __obj.updateDynamic("getCellSelector")(getCellSelector)
    if (getColumnSizerSelector != null) __obj.updateDynamic("getColumnSizerSelector")(getColumnSizerSelector)
    if (getDataRowSelector != null) __obj.updateDynamic("getDataRowSelector")(getDataRowSelector)
    if (getFeature != null) __obj.updateDynamic("getFeature")(getFeature)
    if (getItemSelector != null) __obj.updateDynamic("getItemSelector")(getItemSelector)
    if (getNode != null) __obj.updateDynamic("getNode")(getNode)
    if (getNodeContainerSelector != null) __obj.updateDynamic("getNodeContainerSelector")(getNodeContainerSelector)
    if (getPosition != null) __obj.updateDynamic("getPosition")(getPosition)
    if (getRecord != null) __obj.updateDynamic("getRecord")(getRecord)
    if (getRowClass != null) __obj.updateDynamic("getRowClass")(getRowClass)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (lastCls != null) __obj.updateDynamic("lastCls")(lastCls)
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy)
    if (overItemCls != null) __obj.updateDynamic("overItemCls")(overItemCls)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh)
    if (removeRowCls != null) __obj.updateDynamic("removeRowCls")(removeRowCls)
    if (selectedItemCls != null) __obj.updateDynamic("selectedItemCls")(selectedItemCls)
    if (!js.isUndefined(stripeRows)) __obj.updateDynamic("stripeRows")(stripeRows)
    if (!js.isUndefined(trackOver)) __obj.updateDynamic("trackOver")(trackOver)
    if (walkRecs != null) __obj.updateDynamic("walkRecs")(walkRecs)
    if (walkRows != null) __obj.updateDynamic("walkRows")(walkRows)
    __obj.asInstanceOf[ITable]
  }
}

