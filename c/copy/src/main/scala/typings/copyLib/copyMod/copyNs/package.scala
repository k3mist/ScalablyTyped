package typings
package copyLib.copyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object copyNs {
  type Callback = js.Function2[
    /* error */ stdLib.Error | scala.Null, 
    /* files */ js.UndefOr[js.Array[vinylLib.vinylMod.File]], 
    scala.Unit
  ]
}
