package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequest extends DeferredPermissionRequest {
  val state: MSWebViewPermissionState
  def defer(): scala.Unit
}

@JSGlobal("PermissionRequest")
@js.native
object PermissionRequest
  extends org.scalablytyped.runtime.Instantiable0[PermissionRequest]

