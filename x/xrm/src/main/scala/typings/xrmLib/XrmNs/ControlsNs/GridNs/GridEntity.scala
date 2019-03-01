package typings
package xrmLib.XrmNs.ControlsNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid entity.  Use the GridEntity methods to access data about the specific records in the rows.
  * GridEntity is returned by the GridRowData.getEntity method.
  *
  * @deprecated Use GridRow.data.entity instead.
  */
trait GridEntity extends js.Object {
  /**
    * Returns the logical name for the record in the row.
    *
    * @returns The entity name.
    * @deprecated Use GridRow.data.entity.getEntityName() instead.
    */
  def getEntityName(): java.lang.String
  /**
    * Returns a LookupValue that references this record.
    *
    * @returns The entity reference.
    * @deprecated Use GridRow.data.entity.getEntityReference() instead.
    */
  def getEntityReference(): xrmLib.XrmNs.LookupValue
  /**
    * Returns the id for the record in the row.
    *
    * @returns The identifier of the GridEntity, in GUID format.
    * @example Example return: "{00000000-0000-0000-0000-000000000000}"
    * @deprecated Use GridRow.data.entity.getId() instead.
    */
  def getId(): java.lang.String
  /**
    * Returns the primary attribute value for the record in the row.  (Commonly the name.)
    *
    * @returns The primary attribute value.
    * @deprecated Use GridRow.data.entity.getPrimaryAttributeValue() instead.
    */
  def getPrimaryAttributeValue(): java.lang.String
}

object GridEntity {
  @scala.inline
  def apply(
    getEntityName: js.Function0[java.lang.String],
    getEntityReference: js.Function0[xrmLib.XrmNs.LookupValue],
    getId: js.Function0[java.lang.String],
    getPrimaryAttributeValue: js.Function0[java.lang.String]
  ): GridEntity = {
    val __obj = js.Dynamic.literal(getEntityName = getEntityName, getEntityReference = getEntityReference, getId = getId, getPrimaryAttributeValue = getPrimaryAttributeValue)
  
    __obj.asInstanceOf[GridEntity]
  }
}

