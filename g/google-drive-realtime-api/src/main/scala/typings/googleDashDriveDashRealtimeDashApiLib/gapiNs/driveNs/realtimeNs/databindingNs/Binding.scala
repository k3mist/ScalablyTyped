package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.databindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding extends js.Object {
  // Throws gapi.drive.realtime.databinding.AlreadyBoundError If domElement has already been bound.
  // The collaborative object to bind.
  var collaborativeObject: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.CollaborativeObject
  // The DOM element that the collaborative object is bound to. Value must not be null.
  var domElement: stdLib.Element
  // Unbinds the domElement from collaborativeObject.
  def unbind(): scala.Unit
}

object Binding {
  @scala.inline
  def apply(
    collaborativeObject: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.CollaborativeObject,
    domElement: stdLib.Element,
    unbind: js.Function0[scala.Unit]
  ): Binding = {
    val __obj = js.Dynamic.literal(collaborativeObject = collaborativeObject, domElement = domElement, unbind = unbind)
  
    __obj.asInstanceOf[Binding]
  }
}

