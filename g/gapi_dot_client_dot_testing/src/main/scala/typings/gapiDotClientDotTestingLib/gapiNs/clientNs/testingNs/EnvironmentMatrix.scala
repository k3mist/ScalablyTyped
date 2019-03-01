package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentMatrix extends js.Object {
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[AndroidDeviceList] = js.undefined
  /** A matrix of Android devices. */
  var androidMatrix: js.UndefOr[AndroidMatrix] = js.undefined
}

object EnvironmentMatrix {
  @scala.inline
  def apply(androidDeviceList: AndroidDeviceList = null, androidMatrix: AndroidMatrix = null): EnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    if (androidDeviceList != null) __obj.updateDynamic("androidDeviceList")(androidDeviceList)
    if (androidMatrix != null) __obj.updateDynamic("androidMatrix")(androidMatrix)
    __obj.asInstanceOf[EnvironmentMatrix]
  }
}

