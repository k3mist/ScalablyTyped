package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings defining the table width's measurement units and value.
  */
trait TableWidthUnit extends js.Object {
  /**
    * Gets or sets the unit type for the table width.
    * Value: One of the <see cref="TableWidthUnitType" /> values.
    */
  var `type`: js.Any
  /**
    * Gets or sets the table width value in twips.
    * Value: An integer value specifying the table width.
    */
  var value: scala.Double
}

object TableWidthUnit {
  @scala.inline
  def apply(`type`: js.Any, value: scala.Double): TableWidthUnit = {
    val __obj = js.Dynamic.literal(`type` = `type`, value = value)
  
    __obj.asInstanceOf[TableWidthUnit]
  }
}

