package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a free type of camera. It can be usefull in First Person Shooter game for instance.
  * It is identical to the Free Camera and simply adds by default a virtual joystick.
  * Virtual Joysticks are on-screen 2D graphics that are used to control the camera or other scene items.
  * @see http://doc.babylonjs.com/features/cameras#virtual-joysticks-camera
  */
@JSGlobal("BABYLON.VirtualJoysticksCamera")
@js.native
class VirtualJoysticksCamera protected () extends FreeCamera {
  /**
    * Intantiates a VirtualJoysticksCamera. It can be usefull in First Person Shooter game for instance.
    * It is identical to the Free Camera and simply adds by default a virtual joystick.
    * Virtual Joysticks are on-screen 2D graphics that are used to control the camera or other scene items.
    * @see http://doc.babylonjs.com/features/cameras#virtual-joysticks-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: java.lang.String, position: Vector3, scene: Scene) = this()
}

