package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBoxViewModel extends js.Object {
  var cameraClicked: Event
  var cameraIconPath: java.lang.String
  var closeClicked: Event
  var description: java.lang.String
  var enableCamera: scala.Boolean
  var isCameraTracking: scala.Boolean
  var maxHeight: scala.Double
  var showInfo: scala.Boolean
  var titleText: java.lang.String
  def maxHeightOffset(offset: scala.Double): java.lang.String
}

object InfoBoxViewModel {
  @scala.inline
  def apply(
    cameraClicked: Event,
    cameraIconPath: java.lang.String,
    closeClicked: Event,
    description: java.lang.String,
    enableCamera: scala.Boolean,
    isCameraTracking: scala.Boolean,
    maxHeight: scala.Double,
    maxHeightOffset: js.Function1[scala.Double, java.lang.String],
    showInfo: scala.Boolean,
    titleText: java.lang.String
  ): InfoBoxViewModel = {
    val __obj = js.Dynamic.literal(cameraClicked = cameraClicked, cameraIconPath = cameraIconPath, closeClicked = closeClicked, description = description, enableCamera = enableCamera, isCameraTracking = isCameraTracking, maxHeight = maxHeight, maxHeightOffset = maxHeightOffset, showInfo = showInfo, titleText = titleText)
  
    __obj.asInstanceOf[InfoBoxViewModel]
  }
}

