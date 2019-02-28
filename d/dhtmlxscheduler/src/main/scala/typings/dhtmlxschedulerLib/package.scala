package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dhtmlxschedulerLib {
  type SchedulerCallback = js.Function1[/* repeated */ js.Any, js.Any]
  type SchedulerFilterCallback = js.Function2[/* id */ java.lang.String | scala.Double, /* event */ js.Any, scala.Boolean]
}
