package typings
package testingbotDashApiLib.testingbotDashApiMod.TestingBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestingBotOptions extends js.Object {
  var api_key: js.UndefOr[java.lang.String] = js.undefined
  var api_secret: js.UndefOr[java.lang.String] = js.undefined
}

object TestingBotOptions {
  @scala.inline
  def apply(api_key: java.lang.String = null, api_secret: java.lang.String = null): TestingBotOptions = {
    val __obj = js.Dynamic.literal()
    if (api_key != null) __obj.updateDynamic("api_key")(api_key)
    if (api_secret != null) __obj.updateDynamic("api_secret")(api_secret)
    __obj.asInstanceOf[TestingBotOptions]
  }
}

