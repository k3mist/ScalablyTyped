package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cwd extends js.Object {
  var cwd: js.UndefOr[js.Object] = js.undefined
  var destination: js.UndefOr[js.Any] = js.undefined
  var env: js.UndefOr[js.Object] = js.undefined
  var stdio: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
  var waitForClose: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Cwd {
  @scala.inline
  def apply(
    cwd: js.Object = null,
    destination: js.Any = null,
    env: js.Object = null,
    stdio: js.Array[_] | java.lang.String = null,
    waitForClose: java.lang.String = null
  ): Anon_Cwd = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (env != null) __obj.updateDynamic("env")(env)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (waitForClose != null) __obj.updateDynamic("waitForClose")(waitForClose)
    __obj.asInstanceOf[Anon_Cwd]
  }
}

