package typings
package hapiDashAuthDashBearerDashTokenLib.hapiDashAuthDashBearerDashTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BearerTokenNs {
  type Validate = js.Function3[
    /* request */ hapiLib.hapiMod.Request, 
    /* token */ java.lang.String, 
    /* h */ hapiLib.hapiMod.ResponseToolkit, 
    js.Promise[hapiDashAuthDashBearerDashTokenLib.ValidateReturn] | hapiDashAuthDashBearerDashTokenLib.ValidateReturn
  ]
}
