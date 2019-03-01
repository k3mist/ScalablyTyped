package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConfigurationCatalog extends js.Object {
  var configurations: js.UndefOr[js.Array[NetworkConfiguration]] = js.undefined
}

object NetworkConfigurationCatalog {
  @scala.inline
  def apply(configurations: js.Array[NetworkConfiguration] = null): NetworkConfigurationCatalog = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations)
    __obj.asInstanceOf[NetworkConfigurationCatalog]
  }
}

