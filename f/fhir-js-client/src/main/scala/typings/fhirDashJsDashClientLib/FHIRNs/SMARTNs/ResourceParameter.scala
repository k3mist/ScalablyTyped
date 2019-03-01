package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Resource type with ID
  * Used by the get method
  */
trait ResourceParameter extends js.Object {
  /**
    * Resource ID
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource type
    */
  var resource: java.lang.String
}

object ResourceParameter {
  @scala.inline
  def apply(resource: java.lang.String, id: java.lang.String = null): ResourceParameter = {
    val __obj = js.Dynamic.literal(resource = resource)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ResourceParameter]
  }
}

