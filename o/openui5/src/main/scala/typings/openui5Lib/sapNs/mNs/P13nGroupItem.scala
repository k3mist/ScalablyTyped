package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nGroupItem")
@js.native
class P13nGroupItem protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Item {
  /**
    * Constructor for a new P13nGroupItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>columnKey</code>.key of the column
    * @since 1.28.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): java.lang.String = js.native
  /**
    * Gets current value of property <code>operation</code>.sap.m.P13nConditionOperation
    * @since 1.28.0
    * @returns Value of property <code>operation</code>
    */
  def getOperation(): java.lang.String = js.native
  /**
    * Gets current value of property <code>showIfGrouped</code>.make the grouped column as normalcolumn
    * visibleDefault value is <code>false</code>.
    * @since 1.28.0
    * @returns Value of property <code>showIfGrouped</code>
    */
  def getShowIfGrouped(): scala.Boolean = js.native
  /**
    * Sets a new value for property <code>columnKey</code>.key of the columnWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.28.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: java.lang.String): P13nGroupItem = js.native
  /**
    * Sets a new value for property <code>operation</code>.sap.m.P13nConditionOperationWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @since 1.28.0
    * @param sOperation New value for property <code>operation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setOperation(sOperation: java.lang.String): P13nGroupItem = js.native
  /**
    * Sets a new value for property <code>showIfGrouped</code>.make the grouped column as normalcolumn
    * visibleWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @since 1.28.0
    * @param bShowIfGrouped New value for property <code>showIfGrouped</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowIfGrouped(bShowIfGrouped: scala.Boolean): P13nGroupItem = js.native
}

